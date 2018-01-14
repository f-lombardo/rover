package rover;

public class TurnCommand implements Command {

  private Rotation rotation;

  public TurnCommand(Rotation rotation) {
    this.rotation = rotation;
  }

  public Position executeFrom(Position position) {
    return position.turn(rotation);
  }

}
