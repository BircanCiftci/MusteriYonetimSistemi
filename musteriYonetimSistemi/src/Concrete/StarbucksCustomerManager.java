package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckServise;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if (customerCheckServise.CheckIfRealPerson(customer) ) {
			save(customer);
		} else {
			System.out.println("Not a valid person");
		}
		
	}
}
