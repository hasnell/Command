package csce247.assignments.command;

public class FireCommand implements Command {
	private Player player;
	public FireCommand(Player player) {
	}
	/**
	 * executes the fire command
	 */
	public void execute() {
		player.fire();
	}

}
