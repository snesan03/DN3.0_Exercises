package documentfactory;

public class DocumentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory df=new WordDocumentFactory();
		Document d1=df.createDocument();
		
		d1.open();
		
		df=new ExcelDocumentFactory();
		Document d2=df.createDocument();
		d2.open();
		
		df=new PdfDocumentFactory();
		Document d3=df.createDocument();
		d3.open();
		
		
	}

}
