package customermanagement;

public class CustomerService {
	CustomerRepository cr;

	public CustomerService(CustomerRepository cr) {
		super();
		this.cr = cr;
	}
	
	public Customer findCustomerById(String id) {
		return cr.findCustomerById(id);
	}
}
