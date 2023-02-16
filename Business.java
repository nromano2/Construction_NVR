/**
 * The business class is the first of two subclasses that extends the building superclass in the class hierarchy.
 * An object created from instantiating the business class represents a building with the main purpose of being a place of business
 * 
 * @author Nicholas Romano
 * @version 1.0
 * Module 1 Programming Project
 * CS131 Spring 2023
 */

public class Business extends Building{
	protected int numRentableUnits; //used to store the number of units able to be rented within a given business building

	/**
	 * The empty-argument default Business constructor uses the super reference to initialize its inherited variables.
	 * 
	 * The default business constructor also initializes the number of rentable units to 0
	 */
	public Business() {
		super();
		this.numRentableUnits = 0;
	}//end constructor

	/**
	 * The preferred Business constructor uses the super reference to assist in initializing its inherited variables, 
	 * This constructor also initializes the numRentableUntits variable to the value that passed in through the parameter list.
	 * 
	 * @param projectName - the name given to the construction project of the business building
	 * @param completeAddress - the address that the business building will be constructed.
	 * @param totalSquareFeet - the total square feet of the given project
	 * @param occupancyGroup - the appropriate occupancy group label according to the International Building Code
	 * @param subgroup - the appropriate subgroup label according to the occupancy group
	 * @param numberRentableUnits - the number of rentable units within the given business building
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
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
		sb.append("Number Rentable Units: " + getNumRentableUnits() + "\n");
		return sb.toString();
	}//end displayData

	/**
	 * Accessor method that returns the current value of the numRentableUnits variable
	 * @return the current numRentableUnits value
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	/**
	 * Modifier method that modifies the numRentableUnits variable to the int value that is passed through the parameter list
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumberRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumberRentableUnits

	@Override
	public String toString() {
		return "Business [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet 
				+ ", occupancyGroup="+ occupancyGroup + ", subgroup=" + subgroup + ", numRentableUnits=" + numRentableUnits +"]";
	}//end toString
	
}//end class
