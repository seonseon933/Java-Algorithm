package Hashing.Checking_for_existence.p1496_Path_Crossing;

import java.util.HashSet;
import java.util.Set;

public class p1496_Path_Crossing {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add(x + "," + y);
        for(char c : path.toCharArray()){
            if(c == 'E') x++;
            else if(c == 'W') x--;
            else if(c == 'S') y--;
            else y++;

            String value = x + "," + y;
            if(visited.contains(value)) return true; 
            visited.add(value);
        } 
        return false;
    }
}
