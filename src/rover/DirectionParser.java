package rover;


import java.util.*;

import static rover.Direction.*;

public class DirectionParser {
  private static Map <String, Direction> directions = new HashMap<String, Direction>() {{
    put(NORTH.toString(), NORTH);
    put(EAST.toString(), EAST);
    put(SOUTH.toString(), SOUTH);
    put(WEST.toString(), WEST);
  }};
  
  public static Direction parse(String s) {
    if (s == null) {
      return null;
    }
    return directions.get(s.trim().toUpperCase());
  }
}
