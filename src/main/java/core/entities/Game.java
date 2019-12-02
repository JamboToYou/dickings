package core.entities;

import java.util.Deque;
import java.util.List;

public abstract class Game<TContext> {

	protected TContext gameContext;
	protected Deque<Player> players;
	protected List<Rule<TContext>> rules;

	public abstract void init();
	public abstract boolean applyAction(Action move);
}