package objectDetailPack;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ObjectDetails {
	
	Properties prop=new Properties();
	
	public Properties getObjectData() throws IOException{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/objects/object.properties");
		prop.load(fis);
		return prop;
	}

}
