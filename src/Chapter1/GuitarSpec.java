package Chapter1;

public class GuitarSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numStrings;

	public GuitarSpec(
		Builder builder,
		String model,
		Type type,
		Wood backWood,
		Wood topWood,
		int numStrings
	) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}

	public Builder getBuilder() {
		return this.builder;
	}

	public String getModel() {
		return this.model;
	}

	public Type getType() {
		return this.type;
	}

	public Wood getBackWood() {
		return this.backWood;
	}

	public Wood getTopWood() {
		return this.topWood;
	}

	public int getNumStrings() {
		return this.numStrings;
	}

	@Override
	public boolean equals(Object compared) {
		if (this == compared) {
			return true;
		}

		if (!(compared instanceof GuitarSpec)) {
			return false;
		}

		GuitarSpec comparedSpec = (GuitarSpec) compared;

		if (comparedSpec.builder != this.builder) {
			return false;
		}

		if (!(comparedSpec.model.equals(this.model))) {
			return false;
		}

		if (comparedSpec.type != this.type) {
			return false;
		}

		if (comparedSpec.backWood != this.backWood) {
			return false;
		}

		if (comparedSpec.topWood != this.topWood) {
			return false;
		}

		return true;
	}
	
}
