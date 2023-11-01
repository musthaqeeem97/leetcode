package june;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class Ex207CourseSchedule {

	//brute force approach not optimum solution
	public boolean canFinish1(int numCourses, int[][] prerequisites) {
        // Create an adjacency matrix to represent the graph
        boolean[][] graph = new boolean[numCourses][numCourses];
        // Populate the adjacency matrix based on prerequisites
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            graph[course][prerequisiteCourse] = true;
        }

        // Generate all possible permutations of courses
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutations(numCourses, new ArrayList<>(), permutations);

        // Check each permutation for prerequisites satisfaction
        for (List<Integer> permutation : permutations) {
            if (checkPrerequisites(permutation, graph))
                return true;
        }

        return false;
    }

    private void generatePermutations(int numCourses, List<Integer> current, List<List<Integer>> permutations) {
        if (current.size() == numCourses) {
            permutations.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < numCourses; i++) {
            if (!current.contains(i)) {
                current.add(i);
                generatePermutations(numCourses, current, permutations);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean checkPrerequisites(List<Integer> permutation, boolean[][] graph) {
        for (int i = 1; i < permutation.size(); i++) {
            int course = permutation.get(i);
            for (int j = 0; j < i; j++) {
                int prerequisiteCourse = permutation.get(j);
                if (graph[course][prerequisiteCourse])
                    return false; // Prerequisites not satisfied
            }
        }
        return true; // All prerequisites satisfied
    }

    
    //topological sorting T- O(v+e)
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    	 // Step 1: Build adjacency list and calculate in-degrees
        List<List<Integer>> adjacencyList = new ArrayList<>();
        int[] inDegrees = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            adjacencyList.get(prerequisiteCourse).add(course);
            inDegrees[course]++;
        }

        // Step 2: Perform BFS
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegrees[i] == 0) {
                queue.add(i);
            }
        }
        int[] order = new int[numCourses];
        int index = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            order[index++] = course;
            for (int neighbor : adjacencyList.get(course)) {
                inDegrees[neighbor]--;
                if (inDegrees[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        return index == numCourses;
        
    }
    
    
}
