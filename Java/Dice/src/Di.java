import java.util.*;

public class Di {

	int faceValue;
	Random gen = new Random(6 + 1);
	
	public Di(){
		
	}

	public int roll(){
		
		faceValue = gen.nextInt(6) + 1;
		return faceValue;
		
	}
	
	public void setFaceValue(int i){
		
		faceValue = i;
		
	}
	
	public int getFaceValue(){
		
		return faceValue;
		
	}


}


