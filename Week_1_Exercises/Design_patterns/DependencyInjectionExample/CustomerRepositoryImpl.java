package customermanagement;

public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public Customer findCustomerById(String id) {
		// TODO Auto-generated method stub
		return new Customer(id,"Smith");
	}

}
