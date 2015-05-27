package TestCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import subway.*;

import org.junit.Test;

public class RightLineTest {
	// In this test, we check the import whether the two station in the right line
	@Test
	public void test() {
		try{
			SubwayLoader loader = new SubwayLoader();
			Subway objectville = loader.loadFromFile(new File("C:/Users/agungwy/Documents/College Stuff/Semester 4/Advance Program/workspace/tutorial11/src/subway/ObjectvilleSubway.txt"));
 			boolean test = objectville.hasConnection("HTML Heights", "UML Walk", "Wirfs-Brock Line");
			assertEquals(true, test);
		}catch (IOException e){
            e.printStackTrace(System.out);
           }
		
		
	}

}
