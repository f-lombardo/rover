package rover;


public class MoveCommand implements Command {


  public MoveCommand() {
  }

  public Position executeFrom(Position position) {
    return position.forward();
  }

}
