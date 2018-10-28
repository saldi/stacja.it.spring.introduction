package it.stacja.app.factory.context;

import java.lang.reflect.InvocationTargetException;
import javax.naming.Context;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimpleContext {

  private final String prefix;

  private Map<Class<?>, Object> cache = new HashMap<>();

  public SimpleContext(String prefix) {
    this.prefix = prefix;
    init();
  }

  private void init() {
    Reflections reflections = new Reflections(this.prefix);
    Set<Class<?>> classes = reflections.getTypesAnnotatedWith(ContextBean.class);
    classes.stream().filter(aClass -> !aClass.isAnnotationPresent(Proto.class)).forEach(aClass -> {
      resolve(aClass);
    });
  }

  private Object resolve(Class<?> classType) {

    if (cache.containsKey(classType)) {
      return cache.get(classType);
    }
    Constructor<?> constructor = classType.getConstructors()[0];
    Class<?>[] parameterTypes = constructor.getParameterTypes();
    Object[] parameters = Arrays.stream(parameterTypes).map(this::resolve).toArray();
    try {
      Object instance = constructor.newInstance(parameters);
      if (isNotPrototype(classType)) {
        cache.put(classType, instance);
      }
      return instance;

    } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
      e.printStackTrace();
    }

    return null;
  }

  private boolean isNotPrototype(Class<?> classType) {
    return !classType.isAnnotationPresent(Proto.class);
  }

  public <T> T getObject(Class<T> aClass) {
    return (T) resolve(aClass);
  }


}
