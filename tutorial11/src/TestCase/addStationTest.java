package TestCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import subway.Station;
import subway.Subway;
import subway.SubwayLoader;

public class addStationTest {
	// in this test, we check the addStation() method
	@Test
	public void test() {
		try {
			SubwayLoader loader = new SubwayLoader();
			Subway objectville = loader.loadFromFile(new File("D:/New folder/week13/ObjectvilleSubway.txt"));
			
			String newStation = "Manggarai Station";
			
			boolean test01 = objectville.hasStation(newStation);
			assertEquals(test01, false);
			
			objectville.addStation(newStation);
			
			boolean test02 = objectville.hasStation(newStation);
			assertEquals(test02, true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}

}
