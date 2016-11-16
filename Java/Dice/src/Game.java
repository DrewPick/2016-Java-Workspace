import javax.swing.JOptionPane;


public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Di d1 = new Di();
		Di d2 = new Di();
		Di d3 = new Di();
		
		String answer; // For JOptionPane
		int menu; // For Switch
		int outcome; // For outcome of dice rolled
		boolean loop = true; // For game loops
		
		JOptionPane.showMessageDialog(null, "Welcome!");
		
		// Game choice
		answer = JOptionPane.showInputDialog(null,"Would you like to play a regular game of "
				+ "Dice or a game of Fours? EX (1 or 2)"
				+ "\n 1. Dice"
				+ "\n 2. Fours");
		menu = Integer.parseInt(answer);
		
		// Type of game to play
		switch(menu){
		
		// GAME OF DICE
		case 1: 
			
			Dice dice = new Dice();
			
			// Dice Game Start
			while(dice.displayGame() == true){
				
				dice.displayGame();
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		// GAME OF FOURS
		case 2: 
			
			
				
		
		// NO GAMES
		default: JOptionPane.showMessageDialog(null, "Goodbye.");
		
		
		
		
		
		}// End of Switch
		
		

	}// End of Main
	
}// End of Driver
