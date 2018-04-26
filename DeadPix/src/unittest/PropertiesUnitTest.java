package unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.Test;

class PropertiesUnitTest {

	@Test
	public void CreatePropertiesFileSucceeds() throws IOException {
		Properties prop = new Properties();
		FileOutputStream out = new FileOutputStream("c:\\users\\" + System.getProperty("user.name") + "\\desktop\\settings.properties");
		
		prop.setProperty("language", "en");
		
		prop.store(out, "");
	}
	
	@Test
	public void CreateLanguagePropertiesFileSucceeds() throws IOException {
		Properties prop = new Properties();
		FileOutputStream out = new FileOutputStream("c:\\users\\" + System.getProperty("user.name") + "\\desktop\\en.properties");
		
		prop.setProperty("string_locator", "Locator");
		prop.setProperty("color_red", "Red");
		prop.setProperty("color_green", "Green");
		prop.setProperty("color_blue", "blue");
		prop.setProperty("color_black", "Black");
		prop.setProperty("color_random", "Random");
		prop.setProperty("color_custom","Custom");
		prop.setProperty("btn_start", "Start");
		prop.setProperty("string_interval", "Interval");
		prop.setProperty("string_pixelfixer", "Pixel Fixer");
		prop.setProperty("string_about", "About");
		prop.setProperty("string_settings", "Settings");
		
		prop.store(out, "");
	}

}
