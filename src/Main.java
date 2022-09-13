import java.rmi.RemoteException;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) throws RemoteException {

		StarbucksCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Burak", "Tabakoðlu", 1997, 56497299840L));
	}

}
