package core.entities;

public abstract class Rule<TContext> {
	public abstract boolean checkAction(Action action, TContext context);
}
