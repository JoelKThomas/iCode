package com.algoexpert.array.tournamentwinner;

import java.util.*;

public class TournamentWinner {

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++) {
            int winnerIndex = results.get(i) == 1 ? 0 : 1;
            String matchWinner = competitions.get(i).get(winnerIndex);
            if (scoreMap.containsKey(matchWinner)) {
                scoreMap.put(matchWinner, scoreMap.get(matchWinner) + 3);
            } else {
                scoreMap.put(matchWinner, 1);
            }
        }
        int maxValueInMap = (Collections.max(scoreMap.values()));
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                return entry.getKey();
            }
        }
        return " ";
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));
        var actual = tournamentWinner(competitions, results);
        System.out.println("Winner: " + actual);
    }
}
