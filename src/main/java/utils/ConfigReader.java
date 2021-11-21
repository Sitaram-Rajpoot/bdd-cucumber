package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Sitaram Rajpoot
 * @date 17-May-2021
 */
public class ConfigReader {

	private Properties pro;

	/***
	 * This is used to read Properties file and Return Properties object
	 * 
	 * @return
	 */
	public Properties initProperties() {
		pro = new Properties();

		try {
			
			
			String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties";
			System.out.println(filePath);
			FileInputStream fis = new FileInputStream(filePath);
			try {
				System.out.println("Propery initialization ");
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro;

	}

}
