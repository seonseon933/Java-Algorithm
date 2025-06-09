package Graphs.p2368_Reachable_Nodes_With_Restrictions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p2368_Reachable_Nodes_With_Restrictions {
    boolean[] seen;
    Map<Integer, List<Integer>> graph = new HashMap<>();
    int res = 0;
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        seen = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(!graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for(int num : restricted) {
            seen[num] = true;
        }
        
        dfs(0);
        return res;
    }

    private void dfs(int node) {
        if(seen[node] == true) return;

        seen[node] = true;
        res++;

        for(int n : graph.get(node)) {
            dfs(n);
        }
    }
}
