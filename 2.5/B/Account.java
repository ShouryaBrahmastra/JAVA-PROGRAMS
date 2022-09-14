package B;

public class Account {
	int id;
	String name;
	String address;
	int panNumber;

	public Account(int id, String name, String address, int panNumber) {
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
				+ this.panNumber + ", Account type: Savings");
	}
}
