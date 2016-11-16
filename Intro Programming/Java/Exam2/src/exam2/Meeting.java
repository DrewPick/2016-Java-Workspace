package exam2;

/** Meeting.java
 * This object class sets a meeting during a time and a room number
 * Drew Pickett
 * 11 - 1 - 2016
 */
public class Meeting {
    
    // Attributes
    private int startTime;
    private int roomNum;
    
    // Consructor
    public Meeting(int s, int r){
        
        startTime = s;
        roomNum = r;
        
    }
    
    // Set Methods
    public void setStartTime(int s){
        
        startTime = s;
        
    }
    
    public void setRoomNum(int r){
        
        roomNum = r;
        
    }
    
    // Get Methods
    public int getStartTime(){
        
        return startTime;
        
    }
    
    public int getRoomNum(){
        
        return roomNum;
        
    }
    
    // ToString Method
    public String toString(){
        
        return "The meeting is scheduled for " + startTime + " in Room " + roomNum;
        
    }
    
    
    
}
