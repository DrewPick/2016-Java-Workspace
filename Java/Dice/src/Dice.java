import javax.swing.JOptionPane;
import java.util.*;
public class Dice {
	
	Di d1 = new Di();
	Di d2 = new Di();
	Di d3 = new Di();
	
	ArrayList<Integer> di = new ArrayList<Integer>();
	
	
	int pairNum = 0;
	
	public Dice(){
		
		di.add(0,0);
		di.add(1, 0);
		di.add(2, 0);
		
		di.set(0, d1.roll());
		di.set(1, d2.roll());
		di.set(2, d3.roll());
		
	}
	
	public void setDice(){
		
		d1.roll();
		d2.roll();
		d3.roll();
		
	}
	
	public void setpairNum(int i){
		
		if(i >= 7 || i <= 0){
			
			pairNum = 0;
			
		}
		else{
			
			pairNum = i;
			
		}
		
	}
	
	public int getSingleDiceScore(int f){
		
		if( f >= 7 || f <= 0){
			
			return 0;
			
		}
		else{
			
			return di.get(f);
			
		}
		
	}
	
	public int getPairNum(){
		
		return pairNum;
		
	}
	
	public boolean pairRule(){
		
		if(di.get(0) == di.get(1)){
			
			pairNum = di.get(2);
			return true;
			
		}
		
		else if(di.get(0) == di.get(2)){
			
			pairNum = di.get(1);
			return true;
			
		}
		
		else if(di.get(1) == di.get(2)){
			
			pairNum = di.get(0);
			return true;
			
		}
		
		else{
			
			return false;
			
		}
		
	}
	
	public boolean lostRule(){
		
		if(di.get(0) == 1 && di.get(1) == 2 && di.get(2) == 3){
			
			return true;
			
		}
		
		else if(di.get(0) == 2 && di.get(1) == 3 && di.get(2) == 1){
			
			return true;
			
		}
		
		else if(di.get(0) == 3 && di.get(1) == 1 && di.get(2) == 2){
			
			return true;
			
		}
		
		else{
			
			return false;
			
		}
		
	}

	public boolean winRule(){
		
		if(di.get(0) == 4 && di.get(1) == 5 && di.get(2) == 6){
			
			return true;
			
		}
		
		if(di.get(0) == 5 && di.get(1) == 6 && di.get(2) == 4){
			
			return true;
			
		}
		
		if(di.get(0) == 6 && di.get(1) == 4 && di.get(2) == 5){
			
			return true;
			
		}
		
		else{
			
			return false;
			
		}
		
	}

	public void roll(){
		
		di.set(0, d1.roll());
		di.set(1, d1.roll());
		di.set(2, d1.roll());
		
	}
	
	public String toString(){
		
		return "[ " + di.get(0) + ", " + di.get(1) + ", " + di.get(2) + " ]";
		
	}

	public int playerPair(){
		
		do{
			
			// Rolls the Dice
			
			roll();
			roll();
			roll();
			
			// Player roll
			JOptionPane.showMessageDialog(null, "You roll the Di...");
			JOptionPane.showMessageDialog(null, "You rolled " + toString());
			
			
			// If the player looses
			if(lostRule() == true){
				
				return 7; // 7 for a lost game
				
			}
			
			// If the player Wins
			else if(winRule() == true){
				
				return 8; // 8 for a won game
				
			}
			
			// If the player gets a pair
			else if(pairRule() == true){
				
				return pairNum;
				
			}
			
			else
				return -1;
			
			
		}while(pairNum != 0);
			
	}

	public int aIPair(){
		
		do{
			
			// Rolls the Dice
			roll();
			roll();
			roll();
			
			// Opponent roll
			JOptionPane.showMessageDialog(null, "Your Opponent rolls the Di...");
			JOptionPane.showMessageDialog(null, "They rolled " + toString());
			
			
			// If the Opponent looses
			if(lostRule() == true){
				
				return 8; // 8 for a lost game
				
			}
			
			// If the Opponent Wins
			else if(winRule() == true){
				
				return 7; // 7 for a won game
				
			}
			
			// If the Opponent gets a pair
			else if(pairRule() == true){
				
				return pairNum;
				
			}
			
			else
				return -1;
			
			
		}while(pairNum != 0);
			
	}
	
	public boolean playAgain(int i){
		
		if(i >= 3 || i <= 0){
			
			return false;
			
		}
		
		// Play Again
		else if(i == 1){
			
			return true;
			
		}
		
		// Don't play
		else{
			
			return false;
			
		}
		
	}

	public boolean displayLost(int p, int o, int l){
		
		String answer;
		int choice;
		
		// If opponent won
		if(o > p){
			
			answer = JOptionPane.showInputDialog("GAME OVER"
					+ "\n The other player had a higher score"
					+ "\n Would you like to play again? EX(1 or 2)"
					+ "\n 1. Yes"
					+ "\n 2. No");
			choice = Integer.parseInt(answer);
			
			return playAgain(choice);
			
		}
		
		// If lost rule applies
		if(lostRule() == true || l == 7){
			
			answer = JOptionPane.showInputDialog("GAME OVER"
					+ "\n You rolled a 1, 2 and a 3"
					+ "\n Would you like to play again? EX(1 or 2)"
					+ "\n 1. Yes"
					+ "\n 2. No");
			
			choice = Integer.parseInt(answer);
			
			return playAgain(choice);
				
		}
		
		else{
			
			answer = JOptionPane.showInputDialog("GAME OVER"
					+ "\n Would you like to play again? EX(1 or 2)"
					+ "\n 1. Yes"
					+ "\n 2. No");
			
			choice = Integer.parseInt(answer);
			
			return playAgain(choice);
				
		}
		
		
	}

	public boolean displayWin(int p, int o, int w){
		
		String answer;
		int choice;
		
		// If player won
		if(p > o){
			
			answer = JOptionPane.showInputDialog("YOU WIN!"
					+ "\n You had a higher score"
					+ "\n Would you like to play again? EX(1 or 2)"
					+ "\n 1. Yes"
					+ "\n 2. No");
			choice = Integer.parseInt(answer);
			
			return playAgain(choice);
			
		}
		
		// If win rule applies
		if(winRule() == true || w == 8){
			
			answer = JOptionPane.showInputDialog("YOU WIN!"
					+ "\n You rolled a 4, 5 and a 6"
					+ "\n Would you like to play again? EX(1 or 2)"
					+ "\n 1. Yes"
					+ "\n 2. No");
			
			choice = Integer.parseInt(answer);
			
			return playAgain(choice);
				
		}
		
		else{
			
			answer = JOptionPane.showInputDialog("YOU WIN!"
					+ "\n Would you like to play again? EX(1 or 2)"
					+ "\n 1. Yes"
					+ "\n 2. No");
			
			choice = Integer.parseInt(answer);
			
			return playAgain(choice);
				
		}
		
		
	}

	public boolean displayGame(){
		
		Player player = new Player(0,0);
		AI op = new AI(0,0);
		
		// Player Turn
		player.setScore(playerPair());
		
		// Player looses
		if(player.getScore() == 7){
			
			return displayLost(player.getScore(), 0, 7);
			
		}
		
		// Player Wins
		else if(player.getScore() == 8){
			
			return displayWin(player.getScore(), 0, 8);
			
		}
		
		// AI Turn
		op.setScore(aIPair());
		
		// AI looses
		if(op.getScore() == 8){
			
			return displayWin(op.getScore(), 0, 8);
		}
		
		// AI Wins
		else if(op.getScore() == 7){
			
			return displayLost(op.getScore(), 0, 7);
			
		}
		
		// Comparing scores
		
		if(player.getScore() > op.getScore() && !(player.getScore() >= 7) && !(player.getScore() <= 0)){ 
				
			return displayWin(player.getScore(), op.getScore(), 0);
			
		}
		else{
			
			return displayLost(player.getScore(), op.getScore(), 0);
			
		}
		
	}
}
