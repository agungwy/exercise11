package TestCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import subway.Connection;
import subway.Station;
import subway.Subway;
import subway.SubwayLoader;

public class getConnectionTest {
	// in this test, we check addConnection() method in Subway class
	@Test
	public void test() {
		try {
			SubwayLoader loader = new SubwayLoader();
			Subway objectville = loader.loadFromFile(new File("C:/Users/agungwy/Documents/College Stuff/Semester 4/Advance Program/workspace/tutorial11/src/subway/ObjectvilleSubway.txt"));
			Station station1 = new Station("Servlet Springs");
			Station station2 = new Station("JavaRanch");
			
			Connection connection01 = objectville.getConnection(station1, station2);
			assertNotNull(connection01);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}

}
