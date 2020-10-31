import java.util.*;

public class Bins {
	public static ArrayList<Map<String, Item>> locations;

	
	public Bins() {
		 Bins.locations = new ArrayList<>();

	}
/**
* Adds A Bin the User Requested To System
* @param name of the bin the user wants to add
*/
public void addBins(String name) { //add bins into the system
	Map<String, Item> name1 = new HashMap<>();
	Date baseDate = new Date(0,0,0);
	Item blank = new Item(name, 0, baseDate);
	name1.put(name,blank);
	locations.add(name1);
}
/**
 * Removes The bin the User Requested from System
 * @param name of the bin the user wants to remove
 */
public void removeBins(String name) { //removes bins from the system
	for(int i=0; i<locations.size(); i++) {
		Map<String, Item> current = locations.get(i);
		if(current.containsKey(name) == true) {
			locations.remove(i);
			System.out.println("Bin has been removed from the system.");
		}
	}
	throw new NoSuchElementException("Bin was not found.");
}
/**
 * Finds A Map The User Wants and returns the map
 * @param name of the bin the user wants to find
 * @return the specific bin that the user wanted
 */
public static Map<String, Item> SpecBin(String name) {
	for(int i=0; i<locations.size(); i++) {
		Map<String, Item> current = locations.get(i);
		if(current.containsKey(name) == true) {
			return current;
		}
	}
	throw new NoSuchElementException("Bin wasn't found.");
	}
}
