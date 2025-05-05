package Hashing.Checking_for_existence.p1436_Destination_City;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p1436_Destination_City {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < paths.size(); i++){
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }

        for(String str : map.values()){
            if(!map.containsKey(str)){
                return str;
            }
        }
        return null;
    }
}
