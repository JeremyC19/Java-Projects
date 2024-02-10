import java.util.*;

public class GraphSearch {
    public static boolean depthFirstSearch(List<List<Integer>> graph, int start, int target) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (node == target) {
                return true;
            }
            if (!visited.contains(node)) {
                visited.add(node);
                for (int neighbor : graph.get(node)) {
                    stack.push(neighbor);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Construct a sample graph
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(Arrays.asList(1, 2)); // Node 0 neighbors are 1 and 2
        graph.add(Arrays.asList(3));    // Node 1 neighbor is 3
        graph.add(Arrays.asList(4));    // Node 2 neighbor is 4
        graph.add(Arrays.asList(5));    // Node 3 neighbor is 5
        graph.add(Arrays.asList());     // Node 4 has no neighbors
        graph.add(Arrays.asList());     // Node 5 has no neighbors

        int start = 0;
        int target = 5;
        boolean found = depthFirstSearch(graph, start, target);
        System.out.println("Node " + target + " found: " + found);
    }
}
