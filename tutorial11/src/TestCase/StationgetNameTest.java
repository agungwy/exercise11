package TestCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import subway.Station;
import subway.Subway;
import subway.SubwayLoader;

public class StationgetNameTest {

	@Test
	public void test() {
		Station station = new Station("Ajax Rapids");
		assertEquals("Ajax Rapids", station.getName());
	}

}
