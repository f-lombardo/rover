package rover;

public interface Command {

  public Position executeFrom(Position position);

}
