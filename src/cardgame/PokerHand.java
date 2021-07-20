package cardgame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class PokerHand implements Iterable <Card>{
	
	public Collection hand;
	public PokerHand(Collection<Card> hand) {
		
		if(hand.size()!=5) 
		{
			 throw new IllegalArgumentException();  	 
		}
		boolean flag=true;
		ArrayList temp =  (ArrayList) hand;
		
		for(int i = 0 ; i < hand.size() && flag == true ; i++ ) 
		{
			Card a = (Card) temp.get(i);
			
			for(int j = i+1 ; j < hand.size() && flag == true; j++) 
			{
				Card b = (Card) temp.get(j);
				
				if(a == b) 
				{
					flag = false; 
				}
			}
		}
		
		 if (flag == false) 
		{
			 throw new IllegalArgumentException();  
		}
		this.hand=hand;
	}


	public PokerHand(Card... hand) {
		if(hand.length!=5)
		{
			throw new IllegalArgumentException();
		}
		boolean flag = true; 
		for(int i = 0 ; i < hand.length && flag==true ; i++) 
		{
			for(int j = i+1 ; j < hand.length && flag==true ; j++) 
			{
				if(hand[i]==hand[j]) 
				{
				flag=false;
				}
			
		    }		
		}
		if(flag == false) 
		{
			throw new IllegalArgumentException();
		}
		
	this.hand = new ArrayList();
	for(int i = 0 ; i < hand.length ; i ++ ) {
		((ArrayList) this.hand).add(i, hand[i]);
	}
	
	}

	
	@SuppressWarnings("unchecked")
	public List <Card> getHand ()
	{
	
		ArrayList a = (ArrayList) this.hand;
	
		return a;
		
	}

	@Override
	public String toString (){
		return this.hand.toString();
		
	}

	@Override
	public Iterator <Card> iterator() {
		Iterator <Card> it = this.hand.iterator();  
		return it ;
		
	}

}
