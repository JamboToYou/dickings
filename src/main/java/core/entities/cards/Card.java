package core.entities.cards;

import core.entities.*;

public abstract class Card extends Entity {

	protected String cardName;
	private TypeOfCard cardType;
	
	public Card()
	{
		this.cardName = "unknow";
		this.cardType = TypeOfCard.BUILD;
	}

	public Card(String cName, TypeOfCard cType)
	{
		this.cardName = cName;
		this.cardType = cType;
	}

	public void setCardName(String cName)
	{
		this.cardName = cName;
	}

	public String getCardName()
	{
		return this.cardName;
	}
}
