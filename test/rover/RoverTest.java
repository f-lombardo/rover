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
  
  @Test 
  public void testRoverCanGoBackwardFromSouth() {
    String commands[] = {"1,2,S", "b"};
    assertEquals("1,3,S", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }

  @Test 
  public void testRoverCanGoBackwardFromNorth() {
    String commands[] = {"1,2,N", "b"};
    assertEquals("1,1,N", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test 
  public void testRoverCanGoBackwardFromEast() {
    String commands[] = {"1,2,E", "b"};
    assertEquals("0,2,E", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test 
  public void testRoverCanGoBackwardFromWest() {
    String commands[] = {"1,2,W", "b"};
    assertEquals("2,2,W", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }
}
