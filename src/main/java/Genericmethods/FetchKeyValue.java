package Genericmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FetchKeyValue {

	public String FetchKeyValueFromProperty(String key) throws Throwable {
		
		FileInputStream fis= new FileInputStream(finalVariables.PROPERTIESPATH);
		
		Properties poj= new Properties();
		poj.load(fis);
		 return poj.getProperty(key);
		
		
	}

}
