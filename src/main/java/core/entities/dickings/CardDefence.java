package core.entities.dickings;


public class CardDefence extends Card {
	
	private int cardCost;
	private TypeOfResource typeResource;
	private int defencePoint;

	public CardDefence()
	{
		super();
		this.cardCost = -1;
		this.typeResource = TypeOfResource.GOLD;
		this.defencePoint = -1;
	}

	public CardDefence(String cName, int cCost, String tRes, TypeOfCard tCard, int defPoint)
	{
		super(cName, tCard);
		this.cardCost = cCost;
		this.typeResource = TypeOfResource.GOLD;
		this.defencePoint = defPoint;
	}

	public int getCardCost()
	{
		return this.cardCost;
	}
}