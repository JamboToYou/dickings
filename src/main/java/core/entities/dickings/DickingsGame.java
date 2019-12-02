package core.entities.dickings;

import core.entities.Action;
import core.entities.cards.CardGame;

public class DickingsGame extends CardGame<DickingsContext, DickingsAction> {

	private boolean turnDone;

	@Override
	public void init(int playersNumber) {
		
	}

	@Override
	public boolean makeTurn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean applyAction(DickingsAction move) {
		// TODO Auto-generated method stub
		return false;
	}

}