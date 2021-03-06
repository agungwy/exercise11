package subway;

import java.io.*;
import java.util.*;

public class SubwayTester
{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: SubwayTester [StartStation] [endStation]");
            System.exit(-1);
        }
        try {
            SubwayLoader loader = new SubwayLoader();
            Subway objectville = loader.loadFromFile(new File("C:/Users/agungwy/Documents/College Stuff/Semester 4/Advance Program/workspace/tutorial11/src/subway/ObjectvilleSubway.txt"));
            // delete command to test Broken Line case
//            loader.brokeLine("Rumbaugh Line");
            // delete command to test broken station test
            loader.brokeStation("Infinite Circle");
            
            if (!objectville.hasStation(args[0])) {
                System.err.println(args[0] + " is not a station in Objecville");
                System.exit(-1);
            } else if (!objectville.hasStation(args[1])) {
                System.err.println(args[1] + " is not a station in Objecville");
                System.exit(-1);
            }
            
            List route = objectville.getDirections(args[0], args[1]);
            SubwayPrinter printer = new SubwayPrinter(System.out);
            printer.printDirections(route);
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
