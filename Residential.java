/**
 * The residential class is the second of the two subclasses that extends the building superclass in the class hierarchy.
 * An object created from instantiating the residential class represents a building with the main purpose of being a place where people live
 * for certain periods of time
 * 
 * @author Nicholas Romano
 * @version 1.0
 * Module 1 Programming Project
 * CS131 Spring 2023
 */

public class Residential extends Building{
	protected int numBedrooms; //used to store the number of bedrooms within the residential building
	protected int numBathrooms; //used to store the number of bathrooms within the residential building
	protected boolean laundryRoom; //used to store whether or not the residential building has a laundry room
	
	/**
	 * The empty-argument Residential default constructor makes use of the super reference to assist in initializing its inherited variables
	 * and also initializes the numBedroom and numBathroom int variables to 0 and the laundryRoom boolean variable to false
	 */
	public Residential() 
	{
		super();
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}//end constructor

	/**
	 * The Residential preferred constructor makes use of the super reference to assist in initializing its inherited variables 
	 * to the values passed through the parameter list.
	 * The preferred constructor also initializes the numBedroom, numBathroom, laundryRoom variable to the values passed through the parameter list.
	 * 
	 * @param projectName - the name given to the residential building
	 * @param completeAddress - the address that the residential building is at
	 * @param totalSquareFeet - the total square feet of the given residential building
	 * @param occupancyGroup - the appropriate occupancy group label according to the International Building Code
	 * @param subgroup - the appropriate subgroup label according to the occupancy group
	 * @param numBedrooms - the number of bedrooms that the residential building will contain
	 * @param numBathrooms - the number of bathrooms that the residential building will contain
	 * @param laundryRoom - boolean value representing whether or not the residential building contains a laundry room
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms,
					   int numBathrooms, boolean laundryRoom) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//end constructor

	/**
	 * The draw method will eventually be used to draw the object.
	 * For now, the method will just display 'Drawing code for {Class Name}' to the console.
	 */
	@Override
	public void draw()
	{
		System.out.println("Drawing code for " + getClass().getName());
	}// end draw
	
	/**
	 * The displayData method contains all the information regarding a given object of this particular class.
	 * The displayData method uses a StringBuilder to store all the information.
	 * @return sb - a StringBuilder containing the information regarding to the given object.
	 */
	@Override
	public String displayData()
	{
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("Number of Bedrooms: " + getNumBedrooms() + "\n");
		sb.append("Number of Bathrooms: " + getNumBathrooms() + "\n");
		sb.append("Laundry Room: " + getLaundryRoom() + "\n");
		return sb.toString();
	}//end displayData

	/**
	 * Accessor method that returns the current value of the numBedrooms variable
	 * @return the current value of the numBedrooms variable
	 */
	public int getNumBedrooms() 
	{
		return numBedrooms;
	}//end getNumBedrooms

	/**
	 * Mutator method that modifies the numBedrooms variable to the value that is passed through the parameter list
	 * @param numBedrooms - the new value that the numBedrooms variable is to be set to
	 */
	public void setNumBedrooms(int numBedrooms) 
	{
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	/**
	 * Accessor method that returns the current value of the numBathrooms variable
	 * @return the current value of the numBathrooms variable
	 */
	public int getNumBathrooms() 
	{
		return numBathrooms;
	}//end getNumBathrooms

	/**
	 * Mutator method that modifies the numBathrooms variable to the value that is passed through the parameter list
	 * @param numBathrooms - the new value that the numBathrooms variable is to be set to
	 */
	public void setNumBathrooms(int numBathrooms) 
	{
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	/**
	 * Accessor method that returns the current boolean value of the laundryRoom variable
	 * @return the current boolean value of the laundryRoom variable
	 */
	public boolean getLaundryRoom() 
	{
		return laundryRoom;
	}//end getLaundryRoom
	
	/**
	 * Mutator method that modifies the laudryRoom boolean variable that is passed through the parameter list
	 * @param laundryRoom - the new boolean variable that the laundryRoom variable is to be set to
	 */
	public void setLaundryRoom(boolean laundryRoom) 
	{
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	@Override
	public String toString() 
	{
		return "Residential [projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup 
				+ ", subgroup=" + subgroup + "numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms 
				+ ", laundryRoom=" + laundryRoom + "]";
	}//end toString

}//end class
