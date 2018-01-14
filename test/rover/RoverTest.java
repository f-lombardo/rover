package rover;


import static org.junit.Assert.*;

import org.junit.*;

public class RoverTest {

  
  @Test
  public void testRoverStartingPosition() {
    String commands[] = {"1,2,S"};
    assertEquals("1,2,S", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test 
  public void testRoverCanGoForwardToSouth() {
    String commands[] = {"1,2,S", "f"};
    assertEquals("1,1,S", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }

  @Test 
  public void testRoverCanGoForwardToNorth() {
    String commands[] = {"1,2,N", "f"};
    assertEquals("1,3,N", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }

  @Test 
  public void testRoverCanGoForwardToEast() {
    String commands[] = {"1,2,E", "f"};
    assertEquals("2,2,E", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }

  @Test 
  public void testRoverCanGoForwardToWest() {
    String commands[] = {"1,2,W", "f"};
    assertEquals("0,2,W", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }

}
