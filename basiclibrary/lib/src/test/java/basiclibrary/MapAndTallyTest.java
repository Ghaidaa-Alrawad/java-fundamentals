package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class MapAndTallyTest {
    @Test
    public void testAnalyzeWeather() {
        System.out.println("Map-HashSet Method");
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String result = MapAndTally.analyzeWeather(weeklyMonthTemperatures);
        String expected = "High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69\n";

        assertEquals(expected, result);
        System.out.println("Result: \n" + result);
    }

    @Test
    public void testTally() {
        System.out.println("Tally Method");
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = MapAndTally.tally(votes);
        String expectedWinner = "Bush";

        assertEquals(expectedWinner, winner);
        System.out.println(winner + " received the most votes!");
    }
}
