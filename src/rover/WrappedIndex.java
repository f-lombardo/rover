package rover;

public class WrappedIndex {

  public static int wrappedIndex(int i, int maxI) {
    if (i >= 0 && i<=maxI) {
      return i;
    }
    int modulus = (maxI +1);
    int result = i % modulus;
    if (result < 0) {
      result = result + modulus;
    }
    return result;
  }
}
