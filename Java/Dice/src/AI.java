
public class AI {
	
	double money;
	int score;
	
	public AI(double m, int s){
		
		money = m;
		score = s;
		
	}
	
	public void reduceMoney(double m){
		
		money = money - m;
		
	}
	
	public void reduceScore(int s){
		
		score = score - s;
		
	}
	
	public void setMoney(double m){
		
		money = m;
		
	}
	
	public void setScore(int s){
		
		score = s;
		
	}
	
	public double getMoney(){
		
		return money;
		
	}
	
	public int getScore(){
		
		return score;
		
	}

}
