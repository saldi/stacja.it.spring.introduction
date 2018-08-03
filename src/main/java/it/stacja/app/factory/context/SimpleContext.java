package it.stacja.app.factory.context;

import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimpleContext {

  private final String prefix = null;

  public SimpleContext() {
    init();
  }

  private void init() {
    Reflections reflections = new Reflections(this.prefix);

  }

  private Object resolve(Class<?> classType) {

    return null;
  }


}
