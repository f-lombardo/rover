package rover;

import java.util.*;

import static rover.WrappedIndex.*;

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
    return elements.get(wrappedIndex(index, elements.size() -1));
  }

}
