package basiclibrary;

import java.util.*;

public class MapAndTally {
    public static void main(String[] args) {

        // Map-HashSet method
        //adding a commint
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String result = analyzeWeather(weeklyMonthTemperatures);
        System.out.println(result);

        System.out.println("------------");

        //Tally method
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

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }

    // Map-HashSet method
    public static String analyzeWeather(int[][] temperatureData) {
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        HashSet<Integer> uniqueTemps = new HashSet<>();

        // finding min and max temperatures and collect unique temperatures
        for (int[] weekTemps : temperatureData) {
            for (int temp : weekTemps) {
                minTemp = Math.min(minTemp, temp);
                maxTemp = Math.max(maxTemp, temp);
                uniqueTemps.add(temp);
            }
        }

        // build the String containing missing temperatures
        StringBuilder missingTemps = new StringBuilder();
        for (int temp = minTemp; temp <= maxTemp; temp++) {
            if (!uniqueTemps.contains(temp)) {
                missingTemps.append("Never saw temperature: ").append(temp).append("\n");
            }
        }

        return "High: " + maxTemp + "\nLow: " + minTemp + "\n" + missingTemps.toString();
    }

    //Tally method
    public static String tally(List<String> votes) {
        Map<String, Integer> voteCount = new HashMap<>();
        for (String candidate : votes) {
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        }

        int maxVotes = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner;
    }


}
