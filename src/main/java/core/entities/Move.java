package core.entities;

public abstract class Move<TContext> {

	public abstract boolean make(TContext gameContext);
}