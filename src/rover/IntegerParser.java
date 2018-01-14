package rover;

public class IntegerParser {

  public static Integer parse(String s) {
    try {
      return Integer.parseInt(s);
    } catch (NumberFormatException e) {
      return null;
    }
  }

}
