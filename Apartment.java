/**
 * The Apartment class is the first of the two subclasses that extends from the Residential class in the class hierarchy.
 * An object created from instantiating the Apartment class represents an apartment complex, a more specific type of residential building.
 * 
 * @author Nicholas Romano
 * @version 1.0
 * Module 1 Programming Project
 * CS131 Spring 2023
 */
public class Apartment extends Residential
{
	private int numRentableUnits; //used to store the number of rentable units within the apartment complex
	private double avgUnitSize; //used to store the average size of the units within the apartment complex
	private boolean parkingAvailabilty; //used to store a boolean value that represents whether or not the apartment complex had parking
	
	/**
	 * The empty-argument default Apartment constructor uses the super reference to assist in initializing its inherited variables,
	 * then initializes the numRentableUnits to 0, avgUnitSize to 0.0, and parkingAvailiability to false
	 */
	public Apartment() 
	{
		super();
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailabilty = false;
	}//end constructor

	/**
	 * The preferred Apartment constructor uses the super reference to assist in initializing its inherited variables to the values passed through the parameter list.
	 * The preferred constructor also initializes the numRentableUnits, avgUnitSize and parkingAvailabilty variables to the values passed through the parameter list.
	 * 
	 * @param projectName - the name given to the apartment complex
	 * @param completeAddress - the address that the apartment complex is at
	 * @param totalSquareFeet - the total square feet of the given apartment complex
	 * @param occupancyGroup - the appropriate occupancy group label according to the International Building Code
	 * @param subgroup - the appropriate subgroup label according to the occupancy group
	 * @param numBedrooms - the number of bedrooms that each apartment will contain
	 * @param numBathrooms - the number of bathrooms that each apartment will contain
	 * @param laundryRoom - boolean value representing whether or not the apartment contains a laundry room
	 * @param numRentableUnits - the number of rentable units within the apartment complex
	 * @param avgUnitSize - the average size of the units within the apartment complex
	 * @param parkingAvalability - boolean value that represents whether or not the apartment complex had parking
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, 
			int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailability) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailabilty = parkingAvailability;
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
		
		sb.append("Number of Rentable Units: " + getNumRentableUnits() + "\n");
		sb.append("Average Unit Size: " + getAvgUnitSize() + " sq. ft\n");
		sb.append("Parking Availability: " + getParkingAvailabilty() + "\n");
		
		return sb.toString();
	}//end displayData

	/**
	 * Accessor method that returns the current value of the numRentableUnits variable
	 * @return the current value of the numRentableUnits variable
	 */
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	}//end getNumRentableUnits

	/**
	 * Mutator method that modifies the the numRentableUnits variable to the new value being passed through the parameter list
	 * @param numRentableUnits - the new int value that the numRentableUnits variable to be set to
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	/**
	 * Accessor method that returns the current value of the avgUnitSize variable
	 * @return the current value of the avgUnitSize variable
	 */
	public double getAvgUnitSize() 
	{
		return avgUnitSize;
	}//end getAvgSize

	/**
	 * Mutator method that modifies the avgUnitSize to the double value being passed through the parameter list
	 * @param avgUnitSize - the new double value that the avgUnitSize variable is to be set to
	 */
	public void setAvgUnitSize(double avgUnitSize) 
	{
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

	/**
	 * Accessor method that returns the current boolean value of the parkingAvailabilty variable
	 * @return the current boolean value of the parkingAvailabilty variable
	 */
	public boolean getParkingAvailabilty() 
	{
		return parkingAvailabilty;
	}//end getParkingAvailability

	/**
	 * Mutator method that modifies the parkingAvailability variable to the new boolean value that is being passed through the parameter list
	 * @param parkingAvailabilty - the new boolean value that the parkingAvailabilty variable is to be set to
	 */
	public void setParkingAvailabilty(boolean parkingAvailabilty) 
	{
		this.parkingAvailabilty = parkingAvailabilty;
	}//end setParkingAvailability

	@Override
	public String toString() 
	{
		return "Apartment [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numBedrooms="
				+ numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom=" + laundryRoom
				+ ", numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize + ", parkingAvailabilty="
				+ parkingAvailabilty + "]";
	}//end toString
	
	
}
