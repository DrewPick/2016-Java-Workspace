
public class AI {
	
	double chips = 500;
	int score;
	Card[] hand = new Card[5];
	
	public void setChips(double c){
		
		chips = c;
		
	}
	
	public void setScore(int s){
		
		score = s;
		
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
	
	public double getChips(){
		
		return chips;
		
	}
	
	public int getScore(){
		
		return score;
		
	}
	
	public Card getCard(int i){
		
		if(i > 4 || hand[i] == null){
			
			getCard(i - 1);
		
		}
		
		else if(hand[0] == null){
			
			
			
		}
		
		return hand[i];
		
	}

	public void deleteHand(){
		
		for(int i = 0; i < hand.length; i++){
			
			hand[i] = null;
			
		}
		
	}

	
}
