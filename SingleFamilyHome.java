/**
 * The SingleFamilyHome class is the second of the two subclasses that extends from the Residential class in the class hierarchy.
 * An object created from instantiating the SingleFamilyHome class represents a Single Family Home, a more specific type of residential building.
 * 
 * @author Nicholas Romano
 * @version 1.0
 * Module 1 Programming Project
 * CS131 Spring 2023
 */
public class SingleFamilyHome extends Residential{
	private boolean garage; //used to store a boolean value that represents whether or not the single family home has a garage

	/**
	 * The empty-argument default SingleFamilyHome constructor uses the super reference to assist in initializing its inherited variables,
	 * then initializes the garage variable to false
	 */
	public SingleFamilyHome() {
		super();
		this.garage = false;
	}//end constructor

	/**
	 * The preferred SingleFamilyHome constructor uses the super reference to assist in initializing its inherited variables to the values passed through the parameter list.
	 * The preferred constructor also initializes the garage variable to the value that is passed through the parameter list.
	 * 
	 * @param projectName - the name given to the single family home
	 * @param completeAddress - the address that the single family home is at
	 * @param totalSquareFeet - the total square feet of the given single family home
	 * @param occupancyGroup - the appropriate occupancy group label according to the ICB
	 * @param subgroup - the appropriate subgroup label according to the occupancy group
	 * @param numBedrooms - the number of bedrooms that the single family home will contain
	 * @param numBathrooms - the number of bathrooms that the single family home will contain
	 * @param laundryRoom - boolean value representing whether or not the single family home contains a laundry room
	 * @param garage - boolean value representing whether or not the single family home contains a garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
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
	 * 
	 * @return sb - a StringBuilder containing the information regarding to the given object.
	 */
	@Override
	public String displayData()
	{
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("Garage: " + getGarage() + "\n");
		return sb.toString();
	}//end displayData

	/**
	 * Accessor method that returns the current boolean value of the garage variable
	 * @return the current garage boolean value
	 */
	public boolean getGarage() 
	{
		return garage;
	}//end getGarage

	/**
	 * Modifier method that modifies the garage variable to be set to the boolean value that is passed through the parameter list
	 * @param the new boolean value that the garage variable is to be set to
	 */
	public void setGarage(boolean garage) 
	{
		this.garage = garage;
	}//end setGarage

	@Override
	public String toString()
	{
		return "SingleFamilyHome [projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", garage=" + garage + "]";
	}//end toString
	
}//end class
