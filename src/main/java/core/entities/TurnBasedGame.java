package core.entities;

public abstract class TurnBasedGame<TContext extends Context, TAction extends Action> extends Game<TContext, TAction> {

	public abstract boolean makeTurn();
}