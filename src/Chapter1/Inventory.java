package Chapter1;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {

	private List guitars;

	public Inventory() {
		this.guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price,
						  GuitarSpec spec) {
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}

		return null;
	}

	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new ArrayList<>();

		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar) i.next();
			GuitarSpec guitarSpec = guitar.getSpec();
			// Ignore serial number since that's unique
			// Ignore price since that's unique
			if (guitarSpec.equals(searchSpec)) {
				matchingGuitars.add(guitar);
			}
		}

		return matchingGuitars;
	}
	
}
