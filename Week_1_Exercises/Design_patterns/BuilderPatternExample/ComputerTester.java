package products;

public class ComputerTester {

	public static void main(String[] args) {
		Computer c1=new Computer.ComputerBuilder().setOs("Windows").setCpu("Amd Ryzen 7").build();
		Computer c2=new Computer.ComputerBuilder().setStorage("1TB").setRam("8GB").build();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
