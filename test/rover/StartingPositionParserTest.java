package rover;


import static org.junit.Assert.*;

import org.junit.Test;

public class StartingPositionParserTest {

  @Test
  public void testParsingValidStrings() {
    Command command = new StartingPositionParser().parse("1,2,S");
    assertNotNull(command);;
  }

}
