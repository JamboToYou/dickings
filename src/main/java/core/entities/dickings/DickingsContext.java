package core.entities.dickings;

import core.entities.*;

public class DickingsContext extends Context {

	private DickingsBoard gameBoard;
	private Phase currentPhase;

	public Phase getCurrentPhase() {
		return currentPhase;
	}

	public DickingsBoard getGameBoard() {
		return gameBoard;
	}
}