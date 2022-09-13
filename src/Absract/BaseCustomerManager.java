package Absract;

import java.rmi.RemoteException;

import Entities.Customer;

	public abstract class BaseCustomerManager implements CustomerService {

	
	public void save(Customer customer) throws RemoteException {
		System.out.println("Saved to Database : "+customer.FirtName +" " + customer.Lastname);
		
	} 

}
