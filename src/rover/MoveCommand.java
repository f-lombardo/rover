package rover;


public class MoveCommand implements Command {

  public enum Verse {
    FORWARD,
    BACKWARD
  }

  private Verse verse;
  
  public MoveCommand(Verse verse) {
    this.verse = verse;
  }

  public Position executeFrom(Position position) {
    switch (verse) {
      case FORWARD:
        return position.forward();
      
      case BACKWARD:
        return position.backward();
        
      default:
        throw new RuntimeException("Unknown verse: " + verse);
    }
  }

}
