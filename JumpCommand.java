package csce247.assignments.command;

public class JumpCommand implements Command {
	private Player player;
	public JumpCommand(Player player) {
	}
	/**
	 * executes the jump command
	 */
	public void execute() {
		player.jump();
	}

}
