package cardgame;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random; 

public class CardDeck implements Iterable <Card>{

	public Collection deck ;
	
	public CardDeck ()
	{
		CardValue v = null;
		CardSuit s = null;
		
	this.deck= new ArrayList<Card>(52);
		for(int i = 0 ; i < 4 ; i++) 
		{
				for(int j = 0 ; j < 13 ; j++ ) 
				{
						if(i==0) 
						{
						s=CardSuit.HEARTS;
						}
					
						if(i == 1) 
					 	{
							s=CardSuit.DIAMONDS;
						}
						if(i == 2) 
					 	{
							s=CardSuit.CLUBS;
						}
						if(i == 3) 
					 	{
							s=CardSuit.SPADES;
						}
				         
					
					if(j==0) 
					{
						v=CardValue.ACE;
					}
				
					if( j == 1 )
					{
					v=CardValue.TWO;
					}
					if( j == 2 )
					{
					v=CardValue.THREE;
					}
					if( j == 3 )
					{
					v=CardValue.FOUR;
					}
					if( j == 4 )
					{
					v=CardValue.FIVE;
					}
					if( j == 5 )
					{
					v=CardValue.SIX;
					}
					if( j == 6 )
					{
					v=CardValue.SEVEN;
					}
					if( j == 7 )
					{
					v=CardValue.EIGHT;
					}
					if( j == 8 )
					{
					v=CardValue.NINE;
					}
					if( j == 9 )
					{
					v=CardValue.TEN;
					}
					if( j == 10 )
					{
					v=CardValue.JACK;
					}
					if( j == 11 )
					{
					v=CardValue.QUEEN;
					}
					if( j == 12 )
					{
					v=CardValue.KING;
					}
					this.deck.add(new Card(v,s));
					}
					
				}
		
	
	}

	public void shuffle(){
	      
        Random rand = new Random(); 
       
        for (int i = 0; i < 52; i++) 
        { 
            // Random for remaining positions. 
            int r = i + rand.nextInt(52 - i); 
             
             //swapping the elements 
             Card temp = (Card) ((ArrayList<Card>) this.deck).get(r);
             Card c = (Card) ((ArrayList<Card>) this.deck).get(i);
             ((ArrayList<Card>) this.deck).set(r, c); 
             	((ArrayList<Card>) this.deck).set(i, temp); 
         } 
    
	}

	/**
	 * returns a collection of 5 cards taken from the top of deck.
	 * After the operation those 5 cards should be removed from the deck
	 * and its size is decreased by 5.
	 * @return a collection of 5 cards taken from the top of deck
	 */
	public Collection<Card> draw5Cards ()
	{
    ArrayList hand= new ArrayList<Card>();
    if(this.deck.size() >= 5) 
    {
		for( int i = this.deck.size()-1 ; i >= this.deck.size()-5 ; i--) 
		{
			Card k = (Card) ((ArrayList<Card>) this.deck).get(i);
	        hand.add(k);
	     
		}
		for(  int i =1 ; i <= 5 ; i++ ) 
		{
			((ArrayList<Card>) this.deck).remove(this.size()-i);
			
		}
    }
    else 
    {
		  throw new IllegalArgumentException();  	 
    }
  
   
		return hand;
		
	}


	public Card drawCard (){
		
		Card n = (Card) ((ArrayList<Card>) this.deck).get(this.deck.size()-1); 
		((ArrayList<Card>) this.deck).remove(this.size()-1);
		return n;
	}

	
	public int size(){
		return this.deck.size();
		
	}

	@Override
	public String toString (){
		
		return this.deck.toString();
	}

	@Override
	public Iterator <Card> iterator() {
		Iterator <Card> it = this.deck.iterator();  
		return it ;
		
	}

}
