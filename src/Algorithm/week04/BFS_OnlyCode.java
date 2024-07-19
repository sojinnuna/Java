package Algorithm.week04;

import java.util.*;

public class BFSExample {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static Map<Integer, Boolean> visited = new HashMap<>();

    public static void BFS_OnlyCode(int startVertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startVertex);
        visited.put(startVertex, true);

        while (!queue.isEmpty()) {
            int curVertex = queue.poll();
            for (int nextVertex : graph.get(curVertex)) {
                if (!visited.containsKey(nextVertex)) {
                    queue.offer(nextVertex);
                    visited.put(nextVertex, true);
                }
            }
        }
    }

    public static void main(String[] args) {
        // 예시 그래프를 만듭니다.
        makeGraph();
        BFS_OnlyCode(0);
    }

    public static void makeGraph() {
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 4));
        graph.put(3, Arrays.asList(1, 5));
        graph.put(4, Arrays.asList(1, 5));
    }
}