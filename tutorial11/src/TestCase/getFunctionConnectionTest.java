package TestCase;

import static org.junit.Assert.*;

import org.junit.Test;

import subway.Connection;
import subway.Station;

public class getFunctionConnectionTest {
	// in this test, we check getStation1(), getStation2(), getLineName() method from connection class
	@Test
	public void test() {
		Station newStation1 = new Station("Manggarai Station");
		Station newStation2 = new Station("Tebet Station");
		String lineName = "Commuter Line";
		
		Connection newConnection = new Connection(newStation1,newStation2,lineName);
		
		assertEquals(newConnection.getStation1(),newStation1);
		
		assertEquals(newConnection.getStation2(),newStation2);
		
		assertEquals(newConnection.getLineName(),lineName);
	}


}
