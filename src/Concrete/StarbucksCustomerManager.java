package Concrete;

import java.rmi.RemoteException;

import Absract.BaseCustomerManager;
import Absract.CustomerCheckService;
import Absract.CustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerService, CustomerCheckService {

	private CustomerCheckService _CustomerCheckService;

	public StarbucksCustomerManager(CustomerCheckService _CustomerCheckService) {
		this._CustomerCheckService = _CustomerCheckService;

	}

	@Override
	public void save(Customer customer) throws RemoteException {
		if (this._CustomerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);

		} else {
			System.out.println("Not a valid person");
		}

 	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;

	}

}
