package image.viewer;

public class RealImage implements Image{
	String fileName;
	@Override
	public Image display(String fileName) {
		// TODO Auto-generated method stub

		System.out.println("Displaying the image "+fileName);
		return this;
	}
	
	public RealImage(String fileName) {
		this.fileName=fileName;
		loadImage(fileName);
	}

	public void loadImage(String fileName) {
		System.out.println("Loading the image "+fileName+" from the server");
	}

}
