
import java.util.*;


public class Deck{
	
	String[] suits = new String[]{"Spades", "Hearts", "Diamonds", "Clubs"};
	String[] ranks = new String[]{"Two", "Three", "Four", "Five", "Six", "Seven",
								   "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	int[] values = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
	
	String format = "";
	ArrayList<Card> deck = new ArrayList<Card>();
	Card singleCard; 
	
	Random gen = new Random();
	
	int count = 0;
	int posi1 = gen.nextInt(52);
	int posi2 = gen.nextInt(52);
	// Indexes
	int ind1;
	int ind2;
	
	ArrayList<Card> dupes = new ArrayList<Card>();
	
	public Deck(){
		
		
		for(int s = 0; s < 4 ; s++){
			for(int c = 0; c < 13; c++){
				
				singleCard = new Card(suits[s], ranks[c], values[c]);
				deck.add(singleCard);
				
			}	
		}
		
	}
	
	public void shuffle(){
		
		Card temp;
		
		for( int i = 0; i < 52; i++){
			
			int x = gen.nextInt(52);
			temp = deck.get(i);
			deck.set(i, deck.get(x));
			deck.set(x, temp);
			
		}
		
	}
	
	public Card getRandomCard(){
		
		return deck.get(gen.nextInt(52));
		
	}
	
	public Card getCard(int i){
		
		return deck.get(i);
		
	}
	
	public String toString(){
		
		for(Card c : deck){
				
			format = c.toString() + "\n" + format;
				
		}
			
		return format;
			
	}
		
		
	}


