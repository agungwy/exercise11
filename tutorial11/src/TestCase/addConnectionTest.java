package TestCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import subway.Connection;
import subway.Station;
import subway.Subway;
import subway.SubwayLoader;

public class addConnectionTest {
	// in this test, we check the addConnection() method
	@Test
	public void test() {
		try{
			SubwayLoader loader = new SubwayLoader();
			Subway objectville = loader.loadFromFile(new File("C:/Users/agungwy/Documents/College Stuff/Semester 4/Advance Program/workspace/tutorial11/src/subway/ObjectvilleSubway.txt"));
			objectville.addConnection("HTML Heights","UML Walk", "Wirfs-Brock Line" );
 			boolean test = objectville.hasConnection("HTML Heights", "UML Walk","Wirfs-Brock Line" );
			assertEquals(true, test);
		}catch (IOException e){
            e.printStackTrace(System.out);
           }
	}

}
