package core.entities;

public abstract class Game<TContext> {

	private TContext gameContext;

	public abstract boolean makeMove(Move<TContext> move);

	public TContext getGameContext() {
		return gameContext;
	}
}