package TestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ addConnectionTest.class, addStationTest.class,
		getConnectionTest.class, getDirectionTest.class,
		getFunctionConnectionTest.class, hasConnectionTest.class,
		hasStationTest.class, loadFromFileTest.class, RightLineTest.class,
		StationgetNameTest.class })
public class AllTests {

}
