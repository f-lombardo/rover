package rover;

import static org.junit.Assert.*;

import org.junit.Test;

public class WrappedIndexTest {

  @Test
  public void testWrapsPositiveIndexes() {
    assertEquals(1, WrappedIndex.wrappedIndex(4, 2));
  }
  
  @Test
  public void testWrapsNegativeIndexes() {
    assertEquals(2, WrappedIndex.wrappedIndex(-1, 2));
  }

}
