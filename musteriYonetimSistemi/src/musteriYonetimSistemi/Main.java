package musteriYonetimSistemi;

import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServisAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServisAdapter());
		
		Customer bircan = new Customer(1, "Bircan", "ÇÝFTÇÝ", 1998/ 8/ 21, "12345678902");
		
		customerManager.save(bircan);
		
		System.out.println(bircan);
		

	}

}