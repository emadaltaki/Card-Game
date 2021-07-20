package cardgame;

import java.awt.List;
import java.util.ArrayList;


public class Poker 
{
	private Poker(){};

	
	public static boolean hasPair(PokerHand hand)
	{
		ArrayList a =   (ArrayList) hand.getHand();
		int count = 0;
		for(int i = 0 ; i < a.size() ; i++) 
		{
			Card n = (Card) a.get(i);
			for(int j = i+1 ; j < a.size() ; j++) 
				
			{
				Card b = (Card) a.get(j);
				
				if(n.cardValue == b.cardValue) 
				{
					
					count++; 
					
				}
		    }		
		}
		if(count == 1) 
		{
		return true;
		}
		else 
		{
		return false; 	
		}
		//TODO
	}

	
	public static boolean has2Pairs(PokerHand hand)
	{
		ArrayList a =   (ArrayList) hand.getHand();
		int count = 0;
		for(int i = 0 ; i < a.size() ; i++) 
		{
			Card n = (Card) a.get(i);
			for(int j = i+1 ; j < a.size() ; j++) 
				
			{
				Card b = (Card) a.get(j);
				
				if(n.cardValue == b.cardValue) 
				{
					count++; 
					
				}
		    }		
		}
		if(count == 2) 
		{
		return true;
		}
		else 
		{
		return false; 	
		}
	}

}
