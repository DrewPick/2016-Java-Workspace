public class Card{

	String suit;
	String rank;
	int value;
	
	public Card(){
		
	}
	
	public Card(String s, String r, int v){
		
		suit = s;
		rank = r;
		value = v;
		
	}
	
	public void setSuit(String s){
		
		suit = s;
		
	}
	
	public void setRank(String r){
		
		rank = r;
		
	}
	
	public void setValue(int v){
		
		value = v;
		
	}
	
	public String getSuit(){
		
		return suit;
		
	}
	
	public String getRank(){
		
		return rank;
		
	}
	
	public int getValue(){
		
		return value;
	}

	public String toString(){
		
		return"[ " + suit + ", " + rank + ", " + value + " ]";
		
	}
}
