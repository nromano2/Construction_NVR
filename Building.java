/**
 * This project is making use of class hierarchies via inheritance. This program develops layouts for various types of buildings.
 * The building class is atop the class hierarchy, and consists of basic characteristics that the specific types of buildings will inherit.
 * 
 * @author Nicholas Romano
 * @version 1.0 
 * Module 1 Programming Project
 * CS131 Spring 2023
 */

public class Building {
	protected String projectName; //used to store the name of the building project
	protected String completeAddress; //used to store the name of the address of the building project
	protected double totalSquareFeet; //used to store the total square feet for the given project
	protected String occupancyGroup; //used to store type of occupancy group the project falls into according to International Building Code (IBC)
	protected String subgroup; //used to store the subgroup of the occupancy group according to the International Building Code
	
	/**
	 * This empty-argument default Building constructor initializes the projectName, completeAddrss, occupanyGroup and subgroup variables to empty strings,
	 * while initializing the totalSquareFeet value to 0.0.
	 */
	public Building()
	{
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subgroup = "";
	}//end constructor

	
	/**
	 * The preferred Building constructor allows the initialization of the projectName, completeAddress, totalSquareFeet, occupanyGroup and subgroup
	 * variables by passing them through the parameter list.
	 * 
	 * @param projectName - the name given to the building project
	 * @param completeAddress - the address that the building will be constructed at
	 * @param totalSquareFeet - the total square feet of the given building
	 * @param occupancyGroup - the appropriate occupancy group label according to the International Building Code
	 * @param subgroup - the appropriate subgroup label according to the occupancy group
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) 
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//end constructor

	/**
	 * The draw method will eventually be used to draw the object.
	 * For now, the method will just display 'Drawing code for {Class Name}' to the console.
	 */
	public void draw()
	{
		System.out.println("Drawing code for " + getClass().getName());
	}// end draw
	
	/**
	 * The displayData method contains all the information regarding a given object of this particular class.
	 * The displayData method uses a StringBuilder to store all the information.
	 * @return sb - a StringBuilder containing the information regarding to the given object.
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder("\n\t\t" + getClass().getName() + " Design Data Report \n");
		sb.append("Project Name: " + getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + " sq ft\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		return sb.toString();
	}//end displayData

	/**
	 * Accessor method that returns the current String stored within the projectName variable.
	 * @return the current projectName String
	 */
	public String getProjectName() {
		return projectName;
	}//end getProjectName

	/**
	 * Mutator method for the projectName variable that allows the modification of the projectName variable to the value passed in the parameter list.
	 * @param projectName - the new String projectName is to be set to
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	/**
	 * Accessor method that returns the current String stored within the completeAddress variable.
	 * @return the current completeAddress String
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	/**
	 * Mutator method that modifies the completeAddress variable to the new String that is passed through the parameter list.
	 * @param completeAddress - the new String that completeAddress is to be set to.
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	/**
	 * Accessor method that returns the current totalSquareFeet double variable.
	 * @return the current totalSquareFeet value
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	 * Mutator method that modifies the totalSquareFeet variable to the new double value that is passed through the parameter list.
	 * @param totalSquareFeet - the new double value that totalSquareFeet is to be set to.
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	/**
	 * Accessor method that returns the current String stored within the occupancyGroup variable.
	 * @return the current occupancyGroup String variable 
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	 * Mutator method that modifies the occupancyGroup variable to the new String that is passed through the parameter list.
	 * @param occupancyGroup - the new String that the occupancyGroup variable is to be set to
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	 * Accessor method that returns the current String stored in the subgroup variable.
	 * @return the current subgroup String variable
	 */
	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup

	/**
	 * Mutator method that modifies the subgroup variable to the new String that is passed through the parameter list.
	 * @param subgroup - the new String that the subgroup variable is to be set to
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end setSubgroup

	@Override
	public String toString() 
	{
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end Class
