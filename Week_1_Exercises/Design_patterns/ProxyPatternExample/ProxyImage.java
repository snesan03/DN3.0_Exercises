package image.viewer;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image{
	
	Map<String,Image> cache=new HashMap<>();
	Image image;
	@Override
	public Image display(String fileName) {
		// TODO Auto-generated method stub
		if(!cache.containsKey(fileName)) {
			image=new RealImage(fileName);
			cache.put(fileName, image.display(fileName));
		}else {
			return cache.get(fileName).display(fileName);
		}
		return image;
		
		
		
	}

}
