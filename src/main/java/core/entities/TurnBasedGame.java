package core.entities;

public abstract class TurnBasedGame<TContext> extends Game<TContext> {

	public abstract boolean makeTurn();
}