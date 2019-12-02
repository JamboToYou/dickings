package core.entities.cards;

import java.util.LinkedList;

public abstract class Deck<TCard extends Card> {

	public LinkedList<TCard> cards;
	public TCard getCard() {
		return cards.poll();
	}
}
