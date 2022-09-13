package Adapters;

import java.rmi.RemoteException;

import Absract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(customer.nationalityId, customer.FirtName.toUpperCase(),
				customer.Lastname.toUpperCase(), customer.DateOfBirth);

	}

}
