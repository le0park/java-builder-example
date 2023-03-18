package org.example.models;

public abstract class Coffee {
	public enum Type {
		ICED, HOT
	}

	private Type type = Type.HOT;
	private int shot;

	public Coffee(Builder<? extends Builder<?>> builder) {
		this.type = builder.type;
		this.shot = builder.shot;
	}

	public Type getType() {
		return type;
	}

	public int getShot() {
		return shot;
	}

	@Override
	public String toString() {
		return "Coffee{" +
			"type=" + type +
			", shot=" + shot +
			'}';
	}

	public static abstract class Builder<T extends Builder<T>> {
		private Type type;
		private int shot;

		public Builder() {
		}

		public T type(Type type) {
			this.type = type;
			return self();
		}

		public T shot(int shot) {
			this.shot = shot;
			return self();
		}

		protected abstract T self();

		public abstract Coffee build();
	}
}
