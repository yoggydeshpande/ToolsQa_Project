package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFile {

	public String getPropertydata(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fileInputStream=new FileInputStream(AutoConstant.propertyFilePath);
	    p.load(fileInputStream);
	    return p.getProperty(key);
	}
}
