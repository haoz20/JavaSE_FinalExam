package exam.p7;


import java.util.List;

public class P7 {

    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        int[][] edgeList = new int[][] {
                {1, 2, 2},
                {1, 3, 1},
                {2, 3, 2},
                {3, 4, 1},
                {4, 5, 3},
                {2, 5, 4}
        };

        int start = 1;
        int end = 5;
        int[][] adjList = new int[5][];
        for (int[] edge: edgeList) {
            adjList[edge[0]-1][0] = edge[1];
        }

    }

//    public static int shortestPath(int start, int end, int[][] edgeList) {
//    }

}
