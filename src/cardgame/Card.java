package cardgame;


public class Card {
	
	protected final CardValue cardValue;
	protected final CardSuit suit;
	public Card (CardValue cardValue, CardSuit suit)
	{
		this.cardValue=cardValue;
		this.suit=suit;
	}

	
	public CardValue getCardValue()
	{  
		CardValue v = this.cardValue;
		return v;
	}

	
	public CardSuit getSuit()
	{
		CardSuit s = this.suit;
		return s;
	}

	@Override
	public String toString(){
		
		return cardValue +" "+suit ; 
	}
}
