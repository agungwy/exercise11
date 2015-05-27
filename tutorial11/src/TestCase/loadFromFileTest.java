package TestCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import subway.Subway;
import subway.SubwayLoader;

public class loadFromFileTest {
	// in this test, we check loadFromFile method from SubwayLoader class
	@Test
	public void test() {
		try {
        	SubwayLoader loader = new SubwayLoader();
			Subway objectville = loader.loadFromFile(new File("D:/New folder/week13/ObjectvilleSubway.txt"));
			
			assertNotNull(objectville);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}
}
