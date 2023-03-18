package org.example.models;

public class EverythingAllAtOnceCoffee extends Coffee {
	private int syrup;
	private int sugar;
	private int cinnamon;
	private int chocolate;
	private int magicPowder;
	private int carrot;
	private int tomato;
	private int pineapple;
	private String message;

	public int getSyrup() {
		return syrup;
	}

	public int getSugar() {
		return sugar;
	}

	public int getCinnamon() {
		return cinnamon;
	}

	public int getChocolate() {
		return chocolate;
	}

	public int getMagicPowder() {
		return magicPowder;
	}

	public int getCarrot() {
		return carrot;
	}

	public int getTomato() {
		return tomato;
	}

	public int getPineapple() {
		return pineapple;
	}

	public String getMessage() {
		return message;
	}

	public EverythingAllAtOnceCoffee(Builder builder) {
		super(builder);

		this.syrup = builder.syrup;
		this.sugar = builder.sugar;
		this.cinnamon = builder.cinnamon;
		this.chocolate = builder.chocolate;
		this.magicPowder = builder.magicPowder;
		this.carrot = builder.carrot;
		this.tomato = builder.tomato;
		this.pineapple = builder.pineapple;
		this.message = builder.message;
	}


	@Override
	public String toString() {
		return "EverythingAllAtOnceCoffee{" +
			"syrup=" + syrup +
			", sugar=" + sugar +
			", cinnamon=" + cinnamon +
			", chocolate=" + chocolate +
			", magicPowder=" + magicPowder +
			", carrot=" + carrot +
			", tomato=" + tomato +
			", pineapple=" + pineapple +
			", message='" + message + '\'' +
			"} " + super.toString();
	}

	public static class Builder extends Coffee.Builder<Builder> {
		private int syrup;
		private int sugar;
		private int cinnamon;
		private int chocolate;
		private int magicPowder;
		private int carrot;
		private int tomato;
		private int pineapple;
		private String message;

		public Builder() {
			super();
		}

		@Override
		protected Builder self() {
			return this;
		}

		@Override
		public Coffee build() {
			return new EverythingAllAtOnceCoffee(this);
		}

		public Builder syrup(int syrup) {
			this.syrup = syrup;
			return self();
		}

		public Builder sugar(int sugar) {
			this.sugar = sugar;
			return self();
		}

		public Builder cinnamon(int cinnamon) {
			this.cinnamon = cinnamon;
			return self();
		}

		public Builder chocolate(int chocolate) {
			this.chocolate = chocolate;
			return self();
		}

		public Builder magicPowder(int magicPowder) {
			this.magicPowder = magicPowder;
			return self();
		}

		public Builder carrot(int carrot) {
			this.carrot = carrot;
			return self();
		}

		public Builder tomato(int tomato) {
			this.tomato = tomato;
			return self();
		}

		public Builder pineapple(int pineapple) {
			this.pineapple = pineapple;
			return self();
		}

		public Builder message(String message) {
			this.message = message;
			return self();
		}
	}
}
