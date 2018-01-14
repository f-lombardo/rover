package rover;

public class InvalidCommand implements Command {

  private String commandString;

  public InvalidCommand(String commandString) {
    this.commandString = commandString;
  }

  public Position executeFrom(Position position) {
    System.out.println("Invalid command: " + commandString);
    return position;
  }

}
