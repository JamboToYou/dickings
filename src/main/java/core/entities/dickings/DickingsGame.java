package core.entities.dickings;

import core.entities.*;

public class DickingsGame extends Game<DickingsContext> {

	private DickingsBoard gameBoard;

	@Override
	public boolean makeMove(Move<DickingsContext> move) {
		// TODO make move
		return false;
	}

	public DickingsBoard getGameBoard() {
		return gameBoard;
	}

}