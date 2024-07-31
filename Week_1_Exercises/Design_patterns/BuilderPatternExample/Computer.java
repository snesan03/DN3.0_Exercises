package products;

public class Computer {
	



	private String cpu;
	private String ram;
	private String storage;
	private String os;
	
	public String getCpu() {
		return cpu;
	}



	public void setCpu(String cpu) {
		this.cpu = cpu;
	}



	public String getRam() {
		return ram;
	}



	public void setRam(String ram) {
		this.ram = ram;
	}



	public String getStorage() {
		return storage;
	}



	public void setStorage(String storage) {
		this.storage = storage;
	}



	public String getOs() {
		return os;
	}



	public void setOs(String os) {
		this.os = os;
	}



	private Computer(ComputerBuilder computerBuilder) {
		// TODO Auto-generated constructor stub
		this.cpu=computerBuilder.cpu;
		this.ram=computerBuilder.ram;
		this.storage=computerBuilder.storage;
		this.os=computerBuilder.os;
		
		
	}
	
	
	
	static class ComputerBuilder {
		private String cpu;
		private String ram;
		private String storage;
		private String os;
		
		ComputerBuilder computerBuilder(){
			return this;
		}
		public ComputerBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		public ComputerBuilder setStorage(String storage) {
			this.storage = storage;
			return this;
		}
		
		public ComputerBuilder setOs(String os) {
			this.os = os;
			return this;
		}
		public ComputerBuilder setCpu(String cpu) {
			this.cpu=cpu;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}



	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + ", os=" + os + "]";
	}
	
	
}
