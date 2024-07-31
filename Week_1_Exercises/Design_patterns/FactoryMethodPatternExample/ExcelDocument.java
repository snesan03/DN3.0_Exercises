package documentfactory;

public class ExcelDocument implements Document{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Creating a Excel doucment");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening a Excel document");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.err.println("Saving a Excel document");
	}
	
}
