package core.entities;

import java.util.Deque;
import java.util.List;

public abstract class Game<TContext extends Context, TAction extends Action> {

	protected TContext gameContext;
	protected Deque<Player> players;
	protected List<Rule<TContext>> rules;

	public abstract void init(int playersNumber);
	public abstract boolean applyAction(TAction move);
}