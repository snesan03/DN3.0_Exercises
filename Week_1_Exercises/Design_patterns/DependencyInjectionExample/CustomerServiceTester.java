package customermanagement;

public class CustomerServiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CustomerRepository customerRepository = new CustomerRepositoryImpl();

	       
	        CustomerService customerService = new CustomerService(customerRepository);

	      
	        Customer customer = customerService.findCustomerById("123");
	        System.out.println("Customer Id   : " + customer.getId());
	        System.out.println("Customer Name : " + customer.getName());
	}

}
