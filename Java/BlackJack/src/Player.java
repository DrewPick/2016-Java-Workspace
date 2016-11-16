
public class Player {
	
	double chips = 500;
	int score;
	Card[] hand = new Card[5];
	
	public Player(){
		
	}
	
	public void addToHand(Deck d,int i){
		
		if(hand[0] == null){
			
			Card c = d.getCard(i);
			hand[0] = c;
			score = score + c.getValue();
			
		}
		
		else if(hand[1] == null){
			
			Card c = d.getCard(i);
			hand[1] = c;
			score = score + c.getValue();
			
		}
		
		else if(hand[2] == null){
			
			Card c = d.getCard(i);
			hand[2] = c;
			score = score + c.getValue();

			
		}
		
		else if(hand[3] == null){
			
			Card c = d.getCard(i);
			hand[3] = c;
			score = score + c.getValue();

		}
		else if(hand[4] == null){
			
			Card c = d.getCard(i);
			hand[4] = c;
			score = score + c.getValue();

		}
		else{
			
		}
		
	}
	
	public Card getCard(int i){
		
		if(i > 4 || hand[i] == null){
			
			getCard(i - 1);
		
		}
		
		else if(hand[0] == null){
			
			
			
		}
		
		return hand[i];
		
	}
	
	public int getScore(){
		
		return score;
		
	}
	
	public void addToScore(Card c){
		
		score = score + c.getValue();
		
	}
	
	public void addChips(double c){
		
		chips = chips + c;
		
	}
	
	public double reduceChips(double c){
		
		return chips;
		
	}

	public void setChips(double c){
		
		chips = c;
		
	}
	
	public double getChips(){
		
		return chips;
	}
	
	public void deleteHand(){
		
		for(int i = 0; i < hand.length; i++){
			
			hand[i] = null;
			
		}
		
	}
	
	
	
}
