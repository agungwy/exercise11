package TestCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import subway.Subway;
import subway.SubwayLoader;

public class hasStationTest {

	@Test
	public void test() {
		try{
			SubwayLoader loader = new SubwayLoader();
			Subway objectville = loader.loadFromFile(new File("C:/Users/agungwy/Documents/College Stuff/Semester 4/Advance Program/workspace/tutorial11/src/subway/ObjectvilleSubway.txt"));
 			boolean test = objectville.hasStation("HTML Heights");
			assertEquals(true, test);
		}catch (IOException e){
            e.printStackTrace(System.out);
           }
	}

}
