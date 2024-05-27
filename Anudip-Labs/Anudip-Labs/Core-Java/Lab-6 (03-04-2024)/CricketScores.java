package com.threadpackage;

import java.util.HashMap;
import java.util.Map;

public class CricketScores//main class
{
    public static void main(String arg[]) //main method
    {
        // Creating a Map to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Adding Crickets and their scores
        cricketerScores.put("Rohit Sharma",120);
        cricketerScores.put("Virat Kohli", 70);
        cricketerScores.put("MS Dhoni", 50);
        cricketerScores.put("Maxwell", 90);
        cricketerScores.put("Hardik Pandya", 80);

        // Searching for a batsman's name and displaying his score
        String batsmanName = "Rohit Sharma";
        if (cricketerScores.containsKey(batsmanName)) 
        {
            int score = cricketerScores.get(batsmanName);
            System.out.println(batsmanName + "'s score is: " + score);
        }
        else 
        {
            System.out.println("Batsman not found in the records.");
        }
    }
}

/*Output:
 Rohit Sharma's score is: 120
 */
