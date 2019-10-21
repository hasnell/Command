package csce247.assignments.command;

public class RunCommand implements Command {
	private Player player;
	public RunCommand(Player player) {
	}
	/**
	 * executes the run command
	 */
	public void execute() {
		player.run();
	}

}
