// Design HashSet
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class designHashSet{
    public static void main(String[] args){
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.contains(2);
        myHashSet.contains(3);
        myHashSet.add(2);
        myHashSet.contains(2);
        myHashSet.remove(2);
        myHashSet.contains(2);
    }
}

class MyHashSet{
    boolean[] set;
    public MyHashSet(){
        set = new boolean[1000001];
    }
    public void add(int num){
        set[num] = true;
    }
    public void remove(int num){
        set[num] = false;
    }
    public boolean contains(int num){
        return set[num];
    }
}