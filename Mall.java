/**
 * The Mall class is the only class that extends the Business class within the class hierarchy.
 * An object created from instantiating the Mall class represents a shopping center, a more specific type of Business focused building.
 * 
 * @author Nicholas Romano
 * @version 1.0
 * Module 1 Programming Project
 * CS131 Spring 2023
 */
public class Mall extends Business
{
	private int numRentedUnits; //will be used to store the number of rented units within the mall
	private double medianUnitSize; //will be used to store the median size of the units within the mall
	private int numParkingSpaces; //numParkingSpaces will be used to store the number of parking spaces that a Mall has
	
	/**
	 * The empty-argument default Mall constructor makes use of the super reference to assist in initializing the variables that the class has inherited.
	 * The constructor also initializes the numRentedUnits variable to 0, medianUnitSize to 0.0, and numParkingSpaces to 0
	 */
	public Mall() 
	{
		super();
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	}//end constructor

	/**
	 * The default Mall constructor makes use of the super reference to assist in initializing the variables that the class has inherited 
	 * to the values that are passed through the parameter list.
	 * The constructor also initializes the numRentedUnits, medianUnitSize, and numParkingSpaces variables to the values passed in through the parameter list.
	 * 
	 * @param projectName - the name given to the Mall
	 * @param completeAddress - the address that the Mall is at
	 * @param totalSquareFeet - the total square feet of the Mall
	 * @param occupancyGroup - the appropriate occupancy group label according to the International Building Code
	 * @param subgroup - the appropriate subgroup label according to the occupancy group
	 * @param numRentableUnits - the number of units that are available to rent in the Mall
	 * @param numRentedUnits - the number of rentable units that are actually rented 
	 * @param medianUnitSize - the median size of the units within the mall
	 * @param numParkingSpaces - the number of parking spaces available at the mall
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, 
			int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
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
		sb.append("Number of Rented Units: " + getNumRentedUnits() + "\n");
		sb.append("Median Unit Size: " + getMedianUnitSize() + " sq. ft\n");
		sb.append("Number of Parking Spaces: " + getNumParkingSpaces() + "\n");
		return sb.toString();
	}//end displayData

	/**
	 * Accessor method that returns the current value of numRentedUnits variable
	 * @return the current value of numRentedUnits variable
	 */
	public int getNumRentedUnits() 
	{
		return numRentedUnits;
	}//end getNumRentedUnits

	/**
	 * Mutator method that modifies the numRentedUnits variable to the value being passed through the parameter list
	 * @param numRentedUnits - the new value that the numRentedUnits variable is to be set to
	 */
	public void setNumRentedUnits(int numRentedUnits) 
	{
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits

	/**
	 * Accessor method that returns the current value of the medianUnitSize variable
	 * @return the current value of the medianUnitSize variable
	 */
	public double getMedianUnitSize() 
	{
		return medianUnitSize;
	}//end getMedianUnitSize

	/**
	 * Mutator method that modifies the medianUnitSize variable to the value that is passed through the parameter list
	 * @param medianUnitSize - the new value that the medianUnitSize variable is to be set to
	 */
	public void setMedianUnitSize(double medianUnitSize) 
	{
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize

	/**
	 * Accessor method that returns the current value of the numParkingSpces variable
	 * @return the current value of the numParkingSpaces variable
	 */
	public int getNumParkingSpaces() 
	{
		return numParkingSpaces;
	}//end getNumParkingSpaces

	/**
	 * Mutator method that modifies the numParkingSpaces variable to the value that is passed through the parameter list
	 * @param numParkingSpaces - the new value that the numParkingSpaces variable is to be set to
	 */
	public void setNumParkingSpaces(int numParkingSpaces) 
	{
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces

	@Override
	public String toString() {
		return "Mall [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet +
				", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numberRentableUnits=" + numRentableUnits + 
				", numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + 
				", numParkingSpaces=" + numParkingSpaces + "]";
	}//end toString
}//end class
