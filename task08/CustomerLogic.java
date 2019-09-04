package htp.home.task08.main;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

	public static List<Customer> getCustomerInfo(CustomerInfo custInfo) { 
		
		Customer[] cust = custInfo.getCustInfo();
		List<Customer> result = new ArrayList<Customer>();
		for (Customer ct : cust) {
			result.add(ct);
		}

		return result;
	}

	public static List<Customer> sortCustInfo(CustomerInfo custInfo) {
		
		Customer[] custom = custInfo.getCustInfo();
		List<Customer> result = new ArrayList<Customer>();

		for (int i = 0; i < custom.length - 1; i++) {
			Customer max = custom[i];
			int maxIndex = i;

			for (int j = i + 1; j < custom.length; j++) {
				if (custom[j].getName().compareTo(max.getName()) < 0) {
					max = custom[j];
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				Customer temp = custom[i];
				custom[i] = custom[maxIndex];
				custom[maxIndex] = temp;
			}

		}
		for (Customer ct : custom) {
			result.add(ct);
		}

		return result;
	}

	public static List<Customer> sortCardNumber(CustomerInfo custInfo, int min, int max) {
		
		Customer[] custom = custInfo.getCustInfo();
		List<Customer> result = new ArrayList<Customer>();

		for (int i = 0; i < custom.length; i++) {

			if ((custom[i].getCreditCard() >= min) && (custom[i].getCreditCard() <= max)) {
				result.add(custom[i]);
			}
		}

		return result;
	}

}
