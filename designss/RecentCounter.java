// 933. Number of Recent Calls
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class RecentCounter{
    public static void main(String[] args){
        Recents r1 = new Recents();
        System.out.println(r1.ping(1));
        System.out.println(r1.ping(100));
        System.out.println(r1.ping(3001));
        System.out.println(r1.ping(3002));
    }
}

class Recents{
    Queue<Integer> queue;
    public Recents(){
        queue = new LinkedList<>();
    }

    public int ping(int t){
        int t1 = t - 3000;
        queue.add(t);
        while(!queue.isEmpty() && queue.peek() < t1){
            queue.poll();
        }
        return queue.size();
    }
}