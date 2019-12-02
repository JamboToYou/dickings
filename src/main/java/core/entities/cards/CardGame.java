package core.entities.cards;

import java.util.List;

import core.entities.TurnBasedGame;
import core.entities.Context;
import core.entities.Action;

public abstract class CardGame<TContext extends Context, TAction extends Action> extends TurnBasedGame<TContext, TAction> {

	public List<Deck<Card>> decks;
}