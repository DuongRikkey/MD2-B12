package DSAStackQuene;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EX6 {
    public static void main(String[] args) {
        int[] array = {5, 4, 1, 3, 4, 5, 5};
        int minElement = findMinElement(array);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minElement);
    }

    public static int findMinElement(int[] array) {
        Queue<Integer> q = new LinkedList<Integer>();

        for (int num : array) {
            q.offer(num);
        }
        int minElement = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            int current = q.poll();
            if (current <minElement) {
                minElement = current;
            }

        }
        return minElement;
    }

}
