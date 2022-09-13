package Concrete;

import java.rmi.RemoteException;

import Absract.BaseCustomerManager;
import Absract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	public CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;

	}

	@Override
	public void save(Customer customer) throws RemoteException {
		if (this.customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);

		}else {
			System.out.println("Not a valid person!");
		}
		
	}

}
