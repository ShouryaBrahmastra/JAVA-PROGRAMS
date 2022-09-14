package A;

import B.*;

class Acc {
	private int id;
	String name;
	String address;
	int panNumber;

	public Acc(int id, String name, String address, int panNumber) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.panNumber = panNumber;
	}

	public void update(String name, String address, int panNumber) {
		this.name = name;
		this.address = address;
		this.panNumber = panNumber;
	}

	public String toString() {
		return ("ID: " + this.id + ", Name: " + this.name + ", Address: " + this.address + ", PAN Number: "
				+ this.panNumber + ", Account type: Home Loan");
	}
}

public class Main {
	public static void main(String[] args) {
		Account acc1 = new Account(128, "Shourya Gupta", "Kolkata", 354548);
		System.out.println(acc1);
		acc1.update("Shourya Gupta", "DB block, New Town", 146589);
		System.out.println(acc1);
		Account acc2 = new Account(115, "Aditya Azad", "Patna", 834677);
		System.out.println(acc2);
	}
}
