package DSAStackQuene;

import java.util.LinkedList;
import java.util.Queue;

public class EX7 {
    public static void main(String[] args) {
        int[] array={5,8,9,10,12,4,2};
        int minElement = findMinElement(array);
        System.out.println("Phần tử nhỏ nhất trong mảng là: "+minElement);
}
public static int findMinElement(int[] array) {
    Queue<Integer> q = new LinkedList<>();

    for(int num : array){
        q.offer(num);
    }

    int size=q.size();
    int minElement=q.peek();

    for(int i=size-1;i>=0;i--){
        int current=q.poll();
        if(current<minElement){
            minElement=current;
        }

        q.offer(current);
    }
    return minElement;

}
}
