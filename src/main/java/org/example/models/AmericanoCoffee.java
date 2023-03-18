package org.example.models;

public class AmericanoCoffee extends Coffee {
	private int water;

	public int getWater() {
		return water;
	}

	public AmericanoCoffee(Builder builder) {
		super(builder);
		this.water = builder.water;
	}

	@Override
	public String toString() {
		return "AmericanoCoffee{" +
			"water=" + water +
			"} " + super.toString();
	}

	public static class Builder extends Coffee.Builder<Builder> {
		private int water;

		public Builder() {
			super();
		}

		@Override
		protected Builder self() {
			return this;
		}

		@Override
		public Coffee build() {
			return new AmericanoCoffee(this);
		}

		public Builder water(int water) {
			this.water = water;
			return self();
		}
	}
}
