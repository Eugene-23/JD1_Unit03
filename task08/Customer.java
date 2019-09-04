package htp.home.task08.main;

public class Customer {

	private int id;
	private String name;
	private String address;
	private int creditCard;
	private int bankAcc;
	
	public Customer(int id, String name, String address, int creditCard, int bankAcc) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.creditCard = creditCard;
		this.bankAcc = bankAcc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCard() {
		return creditCard;
	}
	
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
	
	
	public int getBankAcc() {	
		return bankAcc;
	}

	public void setBankAcc(int bankAcc) {
		this.bankAcc = bankAcc;
	}
	
	@Override
	public String toString() {
		return "Customer: id = " + id + ", Name = " + name + ", address = " + address + ", creditCardNumber = " + creditCard
				+ ", bankAccountNumber = " + bankAcc;
	}
	
	
}
