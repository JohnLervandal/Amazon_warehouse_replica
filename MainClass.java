import java.util.*;
public class MainClass {
	String currentUserName;
	int speed; //tracks user speed;
	int itemsPicked; //# of items user picked
	int itemsStowed; //# of items user stowed
	
	public void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome To Amazon! Please enter Your User Name "
				+ "Displayed On Your Badge!");
		String userName = console.nextLine();
		currentUserName = userName;
		
		System.out.print("Welcome! " + currentUserName);
		System.out.println("Go See a Manager And Get Assigned A Job!"
				+ " When You Get Assigned Type In Either Inbound or OutBound!");
		String work = console.nextLine();
		work = work.toLowerCase();
		if(work == "inbound") {
			Inbound();
		} else if (work=="outbound") {
			Outbound();
		} else {
			throw new NoSuchElementException("Please Type In Inbound or Outbound");

		}
		
	}
	
	public void Inbound() {
		//For this assume there's no PO number for simplicity
		//this will simply ask the employee what items they are adding, 
		//the expiration date of that item and the quantity and into which bin
		
	}
	
	public void Outbound() {
		//we need a database of all the customers orders that has their names, address, phone number, and 
				// a list of all the items they ordered. If the user can't find the item in the bin it will send
				//them to an alternative that should also hold the item, if the user can't find the item whatsoever
				// then it will be added to a database that managers can access and tell the user to send that bag to
				//problem solve and a Bin doctor will be in charge of that order now.
	}

}
	
