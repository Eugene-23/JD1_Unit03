package htp.home.task08.main;

public class CustomerInfo {
	
	private Customer[] custInfo;	
	private int count;

	public CustomerInfo(int num) {
				
		custInfo = new Customer[num];
		count = 0;		
	}
	
	public void add(Customer newCustomer) {
		custInfo[count] = newCustomer;
		count++;
	}
	
	public void setCustInfo(Customer[] custInfo) {
		this.custInfo = custInfo;
	}
	
	public Customer[] getCustInfo() {
		return custInfo;
	}
	
}
