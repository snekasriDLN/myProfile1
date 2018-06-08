package com.owner;

public abstract class Vehicle implements Owner,Travel {
	public class bike extends Vehicle{

		@Override
		public String getOwnerName() {
			return "Sri";
		}

		@Override
		public int getSpeed() {
			return 50;
		}
	}
	public class car extends Vehicle{

			@Override
			public String getOwnerName() {
				return "DevaLatha";
			}

			@Override
			public int getSpeed() {
				return 40;
			}
		}
	public class track extends Vehicle{

			@Override
			public String getOwnerName() {
				return "Nandhu";
			}

			@Override
			public int getSpeed() {
				return 60;
			}
		}
	}

	


