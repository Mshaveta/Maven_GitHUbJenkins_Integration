package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	
	
	
	public static String getConfigProp(String propName) {
		FileInputStream fis=null;
		//Get the Prop File path
		//D:\2020_batches_data\learnjava_02_01\POM_02_01\config\config.properties
		String propFilePath = System.getProperty("user.dir")+"\\config\\config.properties";
		try {
			 fis = new FileInputStream(propFilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		Properties prop = new Properties();
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Read the Porp.
		String propVal = prop.getProperty(propName);//chrome
		return propVal;
	}
	
	 
}
