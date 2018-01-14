package rover;

import java.util.*;

public class Ring<T> {

  private List<T> elements;

  public Ring(T... elements) {
    this.elements = Arrays.asList(elements);
  }

  public T after(T t) {
    return element(elements.indexOf(t) + 1);
  }

  public T before(T t) {
    return element(elements.indexOf(t) - 1);
  }
  
  private T element(int index) {
    if (index == -1) {
      index = elements.size() - 1;
    } else if (index == elements.size()) {
      index = 0;
    }

    return elements.get(index);
  }

}
