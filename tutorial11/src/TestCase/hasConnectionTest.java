package TestCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import subway.Subway;
import subway.SubwayLoader;

public class hasConnectionTest {
	//We test about hasConnection method.
		@Test
		public void test() {
			
	        try {
	        	SubwayLoader loader = new SubwayLoader();
				Subway objectville = loader.loadFromFile(new File("D:/New folder/week13/ObjectvilleSubway.txt"));
				
				//We test about the connection between two station with the correct input (two station that has connection, with correct line name).
				Boolean test01 = objectville.hasConnection("XHTML Expressway", "Infinite Circle", "Rumbaugh Line");
				assertEquals(test01, true);
				
				//We test about the connection between two station with the wrong input (two station that has connection, with wrong line name).
				Boolean test02 = objectville.hasConnection("XHTML Expressway", "Infinite Circle", "Gamma Line");
				assertEquals(test02, false);
				
				//We test about the connection between two station with the wrong input (two station that has not any connection, with wrong line name).
				Boolean test03 = objectville.hasConnection("HTML Heights", "Infinite Circle", "Wirfs-Brock Line");
				assertEquals(test03, false);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(System.out);
			}
		}

}
