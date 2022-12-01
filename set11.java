//Write a Java Program to input a weighted graph,
// where nodes represent city numbers, and the weight of the edge represent the distance between two cities.
// Given two nodes as source and destination find the shortest route between them using single-source shortest path algorithm.//
//

package com.mukul;


import java.util.*;


public class set11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[a - 1][b - 1] = c;
            arr[b - 1][a - 1] = c;
        }
        int source = sc.nextInt();
        int dest = sc.nextInt();
        int[] dist = new int[n];
        int[] prev = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
            prev[i] = -1;
        }
        dist[source - 1] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return dist[o1] - dist[o2];
            }
        });
        for (int i = 0; i < n; i++) {
            pq.add(i);
        }
        while (!pq.isEmpty()) {
            int u = pq.poll();
            for (int i = 0; i < n; i++) {
                if (arr[u][i] != 0) {
                    if (dist[i] > dist[u] + arr[u][i]) {
                        dist[i] = dist[u] + arr[u][i];
                        prev[i] = u;
                        pq.remove(i);
                        pq.add(i);
                    }
                }
            }
        }
        int i = dest - 1;
        Stack<Integer> st = new Stack<>();
        while (i != -1) {
            st.push(i + 1);
            i = prev[i];
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}