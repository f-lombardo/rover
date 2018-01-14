package rover;


import static org.junit.Assert.*;

import org.junit.*;

public class RoverTest {

  
  @Test
  public void testRoverDefalutPosition() {
    assertEquals(Rover.DEFAULT_STARTING_POSITION.toString(), new Rover().getPositionAsString());
  }
  
  
  @Test
  public void testRoverStartingPosition() {
    String commands[] = {"1,2,S"};
    assertEquals("1,2,S", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test
  public void testRoverDoesntMoveOnWrongCommands() {
    String commands[] = {"1,2,S", "dlfkngldndln"};
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
  
  @Test 
  public void testRoverCanTurnRight() {
    String commands[] = {"1,2,N", "r"};
    assertEquals("1,2,E", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test 
  public void testRoverCanTurnLeft() {
    String commands[] = {"1,2,N", "l"};
    assertEquals("1,2,W", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test 
  public void testRoverCanDoACompleteRotation() {
    String commands[] = {"1,2,N", "l", "l", "l", "l"};
    assertEquals("1,2,N", new Rover()
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test 
  public void testWrappingTheWorlToNorth() {
    String commands[] = {"0,0,N", "f", "f", "f"};
    assertEquals("0,0,N", new Rover()
                         .setBorders(2, 2) 
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test 
  public void testWrappingTheWorlToSouth() {
    String commands[] = {"0,0,S", "f", "f", "f"};
    assertEquals("0,0,S", new Rover()
                         .setBorders(2, 2) 
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test 
  public void testWrappingTheWorlToEast() {
    String commands[] = {"0,0,E", "f", "f", "f", "f"};
    assertEquals("1,0,E", new Rover()
                         .setBorders(2, 2) 
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test 
  public void testWrappingTheWorlToWest() {
    String commands[] = {"0,0,W", "f", "f", "f", "f", "f"};
    assertEquals("1,0,W", new Rover()
                         .setBorders(2, 2) 
                         .parse(commands)
                         .getPositionAsString());
  }
  
  @Test 
  public void testAnObstacleOnPath() {
    String commands[] = {"0,0,E", "f", "f", "f", "f", "f"};
    Sensor sensor = new ListSensor(new Point(3, 0), new Point(0, 1));
    Rover rover = new Rover()
                  .setSensor(sensor);
    try {
      rover.parse(commands);
      fail("Command sequence should be aborted when it encounters an obstacle");
    } catch (CommandException ex) {
    }
    assertEquals("2,0,E", rover.getPositionAsString());
  }
}
