package core.entities.cards;

import java.util.List;

import core.entities.TurnBasedGame;

public abstract class CardGame<TContext> extends TurnBasedGame<TContext> {

	public List<Deck<Card>> decks;
}