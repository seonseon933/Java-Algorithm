package Hashing.Counting.p2225_Find_Players_With_Zero_or_One_Losses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p2225_Find_Players_With_Zero_or_One_Losses {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> winnersList = new ArrayList<>();
        List<Integer> losersList = new ArrayList<>();

        Map<Integer, Integer> loserCnt = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            loserCnt.put(winner, loserCnt.getOrDefault(winner, 0));
            loserCnt.put(loser, loserCnt.getOrDefault(loser, 0) + 1);
        }

        for (int p : loserCnt.keySet()) {
            int cnt = loserCnt.get(p);
            if (cnt == 0)
                winnersList.add(p);
            else if (cnt == 1)
                losersList.add(p);
        }

        Collections.sort(winnersList);
        Collections.sort(losersList);

        res.add(winnersList);
        res.add(losersList);

        return res;
    }
}