import java.util.*;

public class Bins {
	ArrayList<Map<String, Integer>> locations;

	
	public Bins() {
		ArrayList<Map<String, Integer>> locations = new ArrayList<>();

	}
	/**
	 * Adds A Bin the User Requested To System
	 * @param name of the bin the user wants to add
	 */
public void addBins(String name) { //add bins into the system
	Map<String, Integer> name1 = new HashMap<>();
	name1.put(name, 0);
	locations.add(name1);
}
/**
 * Removes The bin the User Requested from System
 * @param name of the bin the user wants to remove
 */
public void removeBins(String name) { //removes bins from the system
	boolean remove = true;
	for(int i=0; i<locations.size(); i++) {
		Map current = locations.get(i);
		if(current.containsKey(name) == true) {
			locations.remove(i);
			remove=false;
			System.out.println("Bin has been removed from the system.");
		}
	}
	if(remove == true) {
		throw new NoSuchElementException("Bin wasn't found.");
	}
}
/**
 * Finds A Map The User Wants and returns the map
 * @param name of the bin the user wants to find
 * @return the specific bin that the user wanted
 */
public Map SpecBin(String name) {
	for(int i=0; i<locations.size(); i++) {
		Map current = locations.get(i);
		if(current.containsKey(name) == true) {
			return current;
		}
	}
	throw new NoSuchElementException("Bin wasn't found.");
}

	}
