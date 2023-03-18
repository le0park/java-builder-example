package org.example.models;

public class LatteCoffee extends Coffee {
	private int milk = 0;

	public int getMilk() {
		return milk;
	}

	public LatteCoffee(Builder builder) {
		super(builder);

		this.milk = builder.milk;
	}

	@Override
	public String toString() {
		return "LatteCoffee{" +
			"milk=" + milk +
			"} " + super.toString();
	}

	public static class Builder extends Coffee.Builder<Builder> {
		private int milk;

		public Builder() {
			super();
		}

		@Override
		protected Builder self() {
			return this;
		}

		@Override
		public Coffee build() {
			return new LatteCoffee(this);
		}

		public Builder milk(int milk) {
			this.milk = milk;
			return self();
		}
	}
}
