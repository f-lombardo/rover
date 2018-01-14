package rover;

public class StartingPositionCommand implements Command {

  private final Position startingPosition;

  public StartingPositionCommand(Position position) {
    this.startingPosition = position;
  }

  public Position executeFrom(Position position) {
    return startingPosition;
  }

}
