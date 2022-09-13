package Absract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerCheckService {

	public boolean CheckIfRealPerson(Customer customer) throws RemoteException;

}
