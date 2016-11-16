import java.util.*;


public class Game {

	public static void main(String[] args) {
		
		
		Deck deck = new Deck();
		AI dealer = new AI();
		Player p1 = new Player();
		
		boolean loop = true;
		
		// Introducton
		System.out.println("Welcome to BlackJack!");
		System.out.println("Let's begin...");
		System.out.println("");
		System.out.println("=====================");
		
		//Game Start
		while(loop == true){
			
			System.out.println("");
			System.out.println("The Dealer shuffles the deck...");
			deck.shuffle();
			System.out.println("The Dealer hands you and himself two cards.");
			
			// Pre defines Players and Dealers hands
			p1.addToHand(deck, 0);
			p1.addToHand(deck, 1);
			p1.addToHand(deck, 2);
			p1.addToHand(deck, 3);
			p1.addToHand(deck, 4);
			
			dealer.addToHand(deck, 5);
			dealer.addToHand(deck, 6);
			dealer.addToHand(deck, 7);
			dealer.addToHand(deck, 8);
			dealer.addToHand(deck, 9);
			
			System.out.println("");
			System.out.println("You have: " + p1.getCard(0).toString() + ", " 
								+ p1.getCard(1).toString());
			System.out.println("The Dealers has: " + dealer.getCard(0).toString() 
								+ ", and a card faceing down.");
			
			
			
			
			
			
			p1.deleteHand();
			dealer.deleteHand();
			
		}// END OF GAME LOOP
		
	}// END OF MAIN

public static boolean blackJack(int s){
	
	if(s == 21){
		
		return true;
		
	}
	else{
		return false;
	}	
}

public static boolean bust(int s){
	
	if(s > 21){
		
		return true;
	}
	else{
		return false;
	}	
}





}// END OF CLASS
