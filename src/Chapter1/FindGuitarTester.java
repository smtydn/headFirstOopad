package Chapter1;

import java.util.List;
import java.util.Iterator;

public class FindGuitarTester {

	public static void main(String[] args) {
		// Set up Rick's inventory
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec spec = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6); 
		
		List<Guitar> matchingGuitars = inventory.search(spec);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec guitarSpec = guitar.getSpec();
				System.out.println("  We have a " + 
					guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " +
					guitarSpec.getType() + " guitar:\n    " + 
					guitarSpec.getBackWood() + " back and sides, \n    " + 
					guitarSpec.getTopWood() + " top.\n  You can have it for only $" +
					guitar.getPrice() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}	

	private static void initializeInventory(Inventory inventory) {
		GuitarSpec spec = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		inventory.addGuitar("V95693", 1499.95, spec);	
		inventory.addGuitar("V9512", 1549.95, spec);
	}
	
}
