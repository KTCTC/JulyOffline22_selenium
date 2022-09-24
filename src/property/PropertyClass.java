package property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {

	public static void main(String[] args) throws IOException {
  
  File f = new File(System.getProperty("user.dir")+"\\env.properties");
  FileInputStream fis = new FileInputStream(f);
  
  
  Properties prop = new Properties();

  prop.load(fis);
  
 String url = prop.getProperty("baseUrl");
 System.out.println(url);
 System.out.println(prop.getProperty("userName"));
 System.out.println(prop.getProperty("passWord"));
 

	}

}
