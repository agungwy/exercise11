package TestCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import subway.Subway;
import subway.SubwayLoader;

public class getDirectionTest {
	// in this test, we test getDirection() methiod in subway
	@Test
	public void test() {
		try {
			SubwayLoader loader = new SubwayLoader();
			Subway objectville = loader.loadFromFile(new File("D:/New folder/week13/ObjectvilleSubway.txt"));
			
			List direction01 = (LinkedList) objectville.getDirections("Servlet Springs", "OCP Orchard");
			assertNotNull(direction01);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}

}
