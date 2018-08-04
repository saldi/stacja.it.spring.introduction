package it.stacja.app.factory.context;

import java.lang.reflect.InvocationTargetException;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimpleContext {

  private Map<Class<?>, Object> instances = new HashMap<>();
  private final String prefix;

  public SimpleContext(String prefix) {
    this.prefix = prefix;
    init();
  }

  private void init() {
    Reflections reflections = new Reflections(this.prefix);

    Set<Class<?>> annotatedWith = reflections.getTypesAnnotatedWith(Component.class);
    annotatedWith.stream().forEach(aClass -> resolve(aClass));
  }

  private Object resolve(Class<?> classType) {

    Constructor<?>[] constructors = classType.getConstructors();
    Constructor constructor = constructors[0];

    if (instances.containsKey(classType)) {
      return instances.get(classType);
    }

    try {

      Class[] types = constructor.getParameterTypes();
      Object[] parameters = Arrays.stream(types).map(
          this::resolve
      ).toArray();

      Object instance = constructor.newInstance(parameters);

      if (!classType.isAnnotationPresent(Prototype.class)) {
        instances.put(classType, instance);
      }
      return instance;

    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  public <T> T getElement(Class<T> aClass) {
    return (T) this.resolve(aClass);
  }


}
