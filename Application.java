/**
 * The Application java file is used to run the code programmed in the Building, Business, Residential, Mall, Apartment, and SingleFamilyHome classes.
 * This is done by creating two objects of each class, one with the default constructor and the other with the preferred constructor.
 * Once the object is instantiated, the various methods are ran.
 * 
 * 
 * @author Nicholas Romano
 * @version 1.0
 * Module 1 Programming Project
 * CS131 Spring 2023
 */
public class Application {

	public static void main(String[] args) {
		/*
		 * Creating a Building object with the default empty-argument constructor, initializing the variables with the mutator methods, 
		 * then returning the initialized values with the accesoor methods.
		 * 
		 * Following the initialization and returning of the object variables, then draw method is called,
		 *  and finally the both data displays are used (toString() and displayData())
		 */
		Building newBuilding1 = new Building();
		System.out.println("Building Design 1: \n");
		newBuilding1.setProjectName("Local Driving Range");
		newBuilding1.setCompleteAddress("4510 River Road, Louisville, Kentucky, 40222");
		newBuilding1.setTotalSquareFeet(2450.0);
		newBuilding1.setOccupancyGroup("Assembly");
		newBuilding1.setSubgroup("A-5");
		System.out.println("Building Project Name: " + newBuilding1.getProjectName());
		System.out.println("Building Address: " + newBuilding1.getCompleteAddress());
		System.out.println("Building Square Footage: " + newBuilding1.getTotalSquareFeet() + " sq. feet");
		System.out.println("Occupancy Group: " + newBuilding1.getOccupancyGroup());
		System.out.println("Occupancy SubGroup: " + newBuilding1.getSubgroup());
		
		System.out.print("\nDrawing Design: ");
		newBuilding1.draw();
		
		System.out.println("Condensed Data Display: " + newBuilding1.toString() + "\n");		
		System.out.println(newBuilding1.displayData());
		
		/*
		 * Creating a second Building object, but instead using the preferred constructor.
		 * After initializing the values of the variables with the preferred constructor, the accessor methods are used to return the values.
		 * Then the draw method is called to display the drawing design.
		 * Finally, both data displays are shown (toString() and displayData()).
		 */
		Building newBuilding2 = new Building("City Parking Garage", "300 East Main Street, Louisville, Kentucky, 40202", 10000.0, "Storage", "S-2");
		System.out.println("\nBuilding Design 2: \n");
		System.out.println("Building Project Name: " + newBuilding2.getProjectName());
		System.out.println("Building Address: " + newBuilding2.getCompleteAddress());
		System.out.println("Building Square Footage: " + newBuilding2.getTotalSquareFeet() + " sq. feet");
		System.out.println("Occupancy Group: " + newBuilding2.getOccupancyGroup());
		System.out.println("Occupancy SubGroup: " + newBuilding2.getSubgroup());		
		
		System.out.print("\nDrawing Design: ");
		newBuilding2.draw();
		
		System.out.println("Condensed Data Display: " + newBuilding2.toString() + "\n");
		System.out.println(newBuilding2.displayData());
	
		/*
		 * Creating a Business building object with the default empty-argument constructor, initializing the variables with the mutator methods, 
		 * then returning the initialized values with the accesoor methods.
		 * 
		 * Following the initialization and returning of the variables,
		 * then drawing design is displayed, then the both data displays are shown (toString() and displayData())
		 */
		Business businessBuilding1 = new Business();
		System.out.println("\nBusiness Building Design 1: \n");
		businessBuilding1.setProjectName("Romano Technology Center");
		businessBuilding1.setCompleteAddress("13275 Shelbyville Road, Louisville, Kentucky, 40243");
		businessBuilding1.setTotalSquareFeet(16000.0);
		businessBuilding1.setOccupancyGroup("Business");
		businessBuilding1.setSubgroup("B");
		businessBuilding1.setNumberRentableUnits(16);
		System.out.println("Business Project Name: " + businessBuilding1.getProjectName());	
		System.out.println("Business Address: " + businessBuilding1.getCompleteAddress());
		System.out.println("Business Building Square Footage: " + businessBuilding1.getTotalSquareFeet() + " sq. feet");
		System.out.println("Occupancy Group: " + businessBuilding1.getOccupancyGroup());
		System.out.println("Occupancy SubGroup: " + businessBuilding1.getSubgroup());
		System.out.println("Number of Rentable Units: " + businessBuilding1.getNumRentableUnits());

		System.out.print("\nDrawing Design: ");
		businessBuilding1.draw();
		
		System.out.println("Condensed Data Display: " + businessBuilding1.toString() + "\n");	
		System.out.println(businessBuilding1.displayData());
		
		
		/*
		 * Creating a second Business object, but instead using the preferred constructor.
		 * After initializing the values of the variables with the preferred constructor, the accessor methods are used to return the values.
		 * Then the draw method is called to display the drawing design.
		 * Finally, both data displays are shown (toString() and displayData()).
		 */
		Business businessBuilding2 = new Business("General Construction Company", "1500 South 7th Street, Louisville, Kentucky, 40208", 4500.0, "Business", "B", 17);
		System.out.println("\nBusiness Building Design 2: \n");
		System.out.println("Business Project Name: " + businessBuilding2.getProjectName());
		System.out.println("Business Address: " + businessBuilding2.getCompleteAddress());
		System.out.println("Business Building Square Footage: " + businessBuilding2.getTotalSquareFeet() + " sq. feet");
		System.out.println("Occupancy Group: " + businessBuilding2.getOccupancyGroup());
		System.out.println("Occupancy SubGroup: " + businessBuilding2.getSubgroup());
		System.out.println("Number of Rentable Units: " + businessBuilding2.getNumRentableUnits());
		
		System.out.print("\nDrawing Design: ");
		businessBuilding2.draw();
		
		System.out.println("Condensed Data Display: " + businessBuilding2.toString() + "\n");	
		System.out.println(businessBuilding2.displayData());
		
		
		/*
		 * Creating a Residential building object with the default empty-argument constructor, initializing the variables with the mutator methods, 
		 * then returning the initialized values with the accesoor methods.
		 * 
		 * Following the initialization and returning of the variables,
		 * then drawing design is displayed, then the both data displays are shown (toString() and displayData())
		 */
		Residential residentialBuilding1 = new Residential();
		residentialBuilding1.setProjectName("Residential Unit 1089");
		residentialBuilding1.setCompleteAddress("13840 Old Henry Road, Louisville, Kentucky, 40245");		
		residentialBuilding1.setTotalSquareFeet(2450.0);
		residentialBuilding1.setOccupancyGroup("Residential");
		residentialBuilding1.setSubgroup("R-2");
		residentialBuilding1.setNumBedrooms(4);
		residentialBuilding1.setNumBathrooms(3);
		residentialBuilding1.setLaundryRoom(false);
		System.out.println("\nResidential Building Design 1: \n");
		System.out.println("Residential Project Name: " + residentialBuilding1.getProjectName());
		System.out.println("Residential Address: " +residentialBuilding1.getCompleteAddress());
		System.out.println("Residential Total Square Footage: " +residentialBuilding1.getTotalSquareFeet() + " sq. feet");
		System.out.println("Occupancy Group: " +residentialBuilding1.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " +residentialBuilding1.getSubgroup());
		System.out.println("Number of Bedrooms in Residential Building: " +residentialBuilding1.getNumBedrooms());
		System.out.println("Number of Bathrooms in Residential Building:" +residentialBuilding1.getNumBathrooms());
		System.out.println("Does the Residential Building have a Laundry Room?: " +residentialBuilding1.getLaundryRoom());
		
		System.out.print("\nDrawing Design: ");
		residentialBuilding1.draw();
		
		System.out.println("Condensed Data Display: " + residentialBuilding1.toString() + "\n");
		System.out.println(residentialBuilding1.displayData());
		
		
		/*
		 * Creating a second Residential building object, but instead using the preferred constructor.
		 * After initializing the values of the variables with the preferred constructor, the accessor methods are used to return the values.
		 * Then the draw method is called to display the drawing design.
		 * Finally, both data displays are shown (toString() and displayData()).
		 */
		Residential residentialBuilding2 = new Residential("Residential Unit 1108", "10100 Westport Road, Louisville, Kentucky, 40241", 1950.0, "Residential", "R-2", 2, 1, true);
		System.out.println("\nResidential Building Design 2: \n");
		System.out.println("Residential Project Name: " + residentialBuilding2.getProjectName());
		System.out.println("Residential Address: " +residentialBuilding2.getCompleteAddress());
		System.out.println("Residential Total Square Footage: " +residentialBuilding2.getTotalSquareFeet() + " sq. feet");
		System.out.println("Occupancy Group: " +residentialBuilding2.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " +residentialBuilding2.getSubgroup());
		System.out.println("Number of Bedrooms in Residential Building: " +residentialBuilding2.getNumBedrooms());
		System.out.println("Number of Bathrooms in Residential Building:" +residentialBuilding2.getNumBathrooms());
		System.out.println("Does the Residential Building have a Laundry Room?: " +residentialBuilding2.getLaundryRoom());
		
		System.out.print("\nDrawing Design: ");
		residentialBuilding2.draw();
		
		System.out.println("Condensed Data Display: " + residentialBuilding2.toString() + "\n");
		System.out.println(residentialBuilding2.displayData());
		
		
		/*
		 * Creating a Mall object with the default empty-argument constructor, initializing the variables with the mutator methods, 
		 * then returning the initialized values with the accesoor methods.
		 * 
		 * Following the initialization and returning of the variables,
		 * then drawing design is displayed, then the both data displays are shown (toString() and displayData())
		 */
		Mall mall_1 = new Mall();
		
		mall_1.setProjectName("Downtown Shopping Center");
		mall_1.setCompleteAddress("400 S 2nd Street, Louisville, Kentucky, 40202");		
		mall_1.setTotalSquareFeet(30000.0);
		mall_1.setOccupancyGroup("Mercentile");
		mall_1.setSubgroup("M");
		mall_1.setNumberRentableUnits(17);
		mall_1.setNumRentedUnits(15);
		mall_1.setMedianUnitSize(mall_1.getTotalSquareFeet() / mall_1.getNumRentableUnits());
		mall_1.setNumParkingSpaces(1275);
		
		System.out.println("\nMall Design 1: \n");
		System.out.println("Mall Project Name: " + mall_1.getProjectName());
		System.out.println("Mall Address: " + mall_1.getCompleteAddress());
		System.out.println("Mall Total Square Footage: " + mall_1.getTotalSquareFeet());
		System.out.println("Occupancy Group Type: " + mall_1.getOccupancyGroup());
		System.out.println("Occupancy Subgroup Type: " + mall_1.getSubgroup());
		System.out.println("Number of Rentable Units: " + mall_1.getNumRentableUnits());
		System.out.println("Number of Units Currently Rented: " + mall_1.getNumRentedUnits());
		System.out.println("Median Size of each Units: " + mall_1.getMedianUnitSize() + " sq. feet");
		System.out.println("Number of Parking Spots: " + mall_1.getNumParkingSpaces());
		
		System.out.print("\nDrawing Design: ");
		mall_1.draw();
		
		System.out.println("Condensed Data Display: " + mall_1.toString() + "\n");
		System.out.println(mall_1.displayData());
		
		
		/*
		 * Creating a second Mall object, but instead using the preferred constructor.
		 * After initializing the values of the variables with the preferred constructor, the accessor methods are used to return the values.
		 * Then the draw method is called to display the drawing design.
		 * Finally, both data displays are shown (toString() and displayData()).
		 */
		Mall mall_2 = new Mall("Main Street Shopping Center", "451 Main Street, Louisville, Kentucky, 40202", 32000.0, "Mercential", "M", 20, 16, (32000.0/20), 1300);	
		System.out.println("\nMall Design 2: \n");
		System.out.println("Mall Project Name: " + mall_2.getProjectName());
		System.out.println("Mall Address: " + mall_2.getCompleteAddress());
		System.out.println("Mall Total Square Footage: " + mall_2.getTotalSquareFeet());
		System.out.println("Occupancy Group Type: " + mall_2.getOccupancyGroup());
		System.out.println("Occupancy Subgroup Type: " + mall_2.getSubgroup());
		System.out.println("Number of Rentable Units: " + mall_2.getNumRentableUnits());
		System.out.println("Number of Units Currently Rented: " + mall_2.getNumRentedUnits());
		System.out.println("Median Size of each Units: " + mall_2.getMedianUnitSize() + " sq. feet");
		System.out.println("Number of Parking Spots: " + mall_2.getNumParkingSpaces());
		
		System.out.print("\nDrawing Design: ");
		mall_2.draw();
		
		System.out.println("Condensed Data Display: " + mall_2.toString() + "\n");
		System.out.println(mall_2.displayData());
		
		
		
		/*
		 * Creating an Apartment object with the default empty-argument constructor, initializing the variables with the mutator methods, 
		 * then returning the initialized values with the accesoor methods.
		 * 
		 * Following the initialization and returning of the variables,
		 * then drawing design is displayed, then the both data displays are shown (toString() and displayData())
		 */
		Apartment apartment1 = new Apartment();
		apartment1.setProjectName("Louisville Apartment Complex");
		apartment1.setCompleteAddress("10573 Westport Road, Louisville, Kentucky, 40241");		
		apartment1.setTotalSquareFeet(2450.0);
		apartment1.setOccupancyGroup("Residential");
		apartment1.setSubgroup("R-2");
		apartment1.setNumBedrooms(4);
		apartment1.setNumBathrooms(3);
		apartment1.setLaundryRoom(false);
		apartment1.setNumRentableUnits(17);
		apartment1.setAvgUnitSize(apartment1.getTotalSquareFeet() / apartment1.getNumRentableUnits());
		apartment1.setParkingAvailabilty(true);
		System.out.println("\nApartment Building Design 1: \n");
		System.out.println("Apartment Project Name: " + apartment1.getProjectName());
		System.out.println("Apartment Project Address: " + apartment1.getCompleteAddress());
		System.out.println("Apartment Project Total Square Footage: " + apartment1.getTotalSquareFeet());
		System.out.println("Occupancy Group: " + apartment1.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " + apartment1.getSubgroup());
		System.out.println("Number of Bedrooms within a Apartment Building: " + apartment1.getNumBedrooms());
		System.out.println("Number of Bathrooms within a Apartment Building: " + apartment1.getNumBathrooms());
		System.out.println("Does the Apartment Building have a Laundry Room?: " + apartment1.getLaundryRoom());
		System.out.println("Number of Rentable Units within Apartment complex: " + apartment1.getNumRentableUnits());
		System.out.println("Average Apartment Unit size: " + apartment1.getAvgUnitSize() + " sq. feet");
		System.out.println("Does the Apartment complex provide parking? " + apartment1.getParkingAvailabilty());
		
		System.out.print("\nDrawing Design: ");
		apartment1.draw();
		
		System.out.println("Condensed Data Display: " + apartment1.toString() + "\n");
		System.out.println(apartment1.displayData());
		
		/*
		 * Creating a second Apartment object, but instead using the preferred constructor.
		 * After initializing the values of the variables with the preferred constructor, the accessor methods are used to return the values.
		 * Then the draw method is called to display the drawing design.
		 * Finally, both data displays are shown (toString() and displayData()).
		 */
		Apartment apartment2 = new Apartment("Metro Apartment Complex", "3004 Newburg Road, Louisville, Kentucky, 40205", 19000.0, "Residential", "R-2", 3, 2, true, 17, (19000.0/17), true);	
		System.out.println("\nApartment Building Design 2: \n");
		System.out.println("Apartment Project Name: " + apartment2.getProjectName());
		System.out.println("Apartment Project Address: " + apartment2.getCompleteAddress());
		System.out.println("Apartment Project Total Square Footage: " + apartment2.getTotalSquareFeet());
		System.out.println("Occupancy Group: " + apartment2.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " + apartment2.getSubgroup());
		System.out.println("Number of Bedrooms within a Apartment Building: " + apartment2.getNumBedrooms());
		System.out.println("Number of Bathrooms within a Apartment Building: " + apartment2.getNumBathrooms());
		System.out.println("Does the Apartment Building have a Laundry Room?: " + apartment2.getLaundryRoom());
		System.out.println("Number of Rentable Units within Apartment complex: " + apartment2.getNumRentableUnits());
		System.out.println("Average Apartment Unit size: " + apartment2.getAvgUnitSize() + " sq. feet");
		System.out.println("Does the Apartment complex provide parking? " + apartment2.getParkingAvailabilty());
		
		System.out.print("\nDrawing Design: ");
		apartment2.draw();
		
		System.out.println("Condensed Data Display: " + apartment2.toString() + "\n");
		System.out.println(apartment2.displayData());
		
		
		/*
		 * Creating a SingleFamilyHome object with the default empty-argument constructor, initializing the variables with the mutator methods, 
		 * then returning the initialized values with the accesoor methods.
		 * 
		 * Following the initialization and returning of the variables,
		 * then drawing design is displayed, then the both data displays are shown (toString() and displayData())
		 */
		SingleFamilyHome singleFamilyHome1 = new SingleFamilyHome();
		singleFamilyHome1.setProjectName("Romano Family Home");
		singleFamilyHome1.setCompleteAddress("1504 Bardstown Road, Louisville, Kentucky, 40205");		
		singleFamilyHome1.setTotalSquareFeet(3745.0);
		singleFamilyHome1.setOccupancyGroup("Residential");
		singleFamilyHome1.setSubgroup("R-2");
		singleFamilyHome1.setNumBedrooms(6);
		singleFamilyHome1.setNumBathrooms(4);
		singleFamilyHome1.setLaundryRoom(true);
		singleFamilyHome1.setGarage(true);
		System.out.println("\nSingle Family Home Design 1: \n");
		System.out.println("Single Family Home Project Name: " + singleFamilyHome1.getProjectName());
		System.out.println("Single Family Home Address: " + singleFamilyHome1.getCompleteAddress());
		System.out.println("Single Family Home Total Square Footage: " + singleFamilyHome1.getTotalSquareFeet() + " sq. feet");
		System.out.println("Occupancy Group: " + singleFamilyHome1.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " + singleFamilyHome1.getSubgroup());
		System.out.println("Number of Bedrooms in the Single Family Home: " + singleFamilyHome1.getNumBedrooms());
		System.out.println("Number of Bathrooms in the Single Family Home: " + singleFamilyHome1.getNumBathrooms());
		System.out.println("Is there a Laundry Room within the Single Family Home? : " + singleFamilyHome1.getLaundryRoom());
		System.out.println("Is there a garage within the Single Family Home?: " + singleFamilyHome1.getGarage());
		
		System.out.print("\nDrawing Design: ");
		singleFamilyHome1.draw();
		
		System.out.println("Condensed Data Display: " + singleFamilyHome1.toString() + "\n");
		System.out.println(singleFamilyHome1.displayData());
		
		/*
		 * Creating a second SingleFamilyHome object, but instead using the preferred constructor.
		 * After initializing the values of the variables with the preferred constructor, the accessor methods are used to return the values.
		 * Then the draw method is called to display the drawing design.
		 * Finally, both data displays are shown (toString() and displayData()).
		 */
		SingleFamilyHome singleFamilyHome2 = new SingleFamilyHome("Romano Family Duplex", "1432 Popular Level Road, Louisville, Kentucky, 40217", 3250.0, "Residential", "R-2", 4, 3, true, false);
		System.out.println("\nSingle Family Home Design 2: \n");
		System.out.println("Single Family Home Project Name: " + singleFamilyHome2.getProjectName());
		System.out.println("Single Family Home Address: " + singleFamilyHome2.getCompleteAddress());
		System.out.println("Single Family Home Total Square Footage: " + singleFamilyHome2.getTotalSquareFeet() + " sq. feet");
		System.out.println("Occupancy Group: " + singleFamilyHome2.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " + singleFamilyHome2.getSubgroup());
		System.out.println("Number of Bedrooms in the Single Family Home: " + singleFamilyHome2.getNumBedrooms());
		System.out.println("Number of Bathrooms in the Single Family Home: " + singleFamilyHome2.getNumBathrooms());
		System.out.println("Is there a Laundry Room within the Single Family Home? : " + singleFamilyHome2.getLaundryRoom());
		System.out.println("Is there a garage within the Single Family Home?: " + singleFamilyHome2.getGarage());
		
		System.out.print("\nDrawing Design: ");
		singleFamilyHome2.draw();
		
		System.out.println("Condensed Data Display: " + singleFamilyHome2.toString() + "\n");
		System.out.println(singleFamilyHome2.displayData());
	}

}
