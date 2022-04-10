package hw3;

/**
 * Assignment 	#3
 * Question 	#2
 * 
 * @author 	Michelle_Sawan and Nancy_Rahal
 * ID 		201801993
 * 
 * Course	GIN231 Sect. #21705
*/

public class Room{
	private String name;
	private int capacity;
	private int floorNumber;
	
	public Room() {
		name = null;
		capacity = 0;
		floorNumber = 0;
	}
	public Room(String name, int capacity, int floorNumber) {
		this.name = name;
		this.capacity=capacity;
		this.floorNumber= floorNumber;
	}
	// getters and setters
	 public String getName() {
	        return name;
	    }
	 public int getCapacity() {
	        return capacity;
	    }
	 public int getfloorNumber() {
	        return floorNumber;
	    }
    public void setName(String name) {
	        this.name = name;
	    }
    public void setCapicity(int capacity) {
        this.capacity = capacity;
    }
    public void setfloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
	public String toString() {
		return name+" "+ capacity+ " " + floorNumber;
		
	}
	public boolean equals(Room room) {
		
		if (this == room)
			return true;
		if (room == null)
			return false;
		return true;
	
	
	}
	
}