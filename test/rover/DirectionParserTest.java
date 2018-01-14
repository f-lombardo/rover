package rover;

import static org.junit.Assert.*;

import org.junit.Test;

import static rover.Direction.*;

public class DirectionParserTest {

  @Test
  public void testParsesValidString() {
    assertEquals(NORTH, DirectionParser.parse("N"));
    assertEquals(EAST, DirectionParser.parse("E"));
    assertEquals(SOUTH, DirectionParser.parse("S"));
    assertEquals(WEST, DirectionParser.parse("W"));
  }

}
