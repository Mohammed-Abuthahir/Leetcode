// Design HashMap
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

class designHashMap{
    public static void main(String[] args){
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        System.out.println(myHashMap.get(1));
        myHashMap.get(3);
        myHashMap.put(2, 1);
        System.out.println(myHashMap.get(2));
        myHashMap.remove(2);
        System.out.println(myHashMap.get(2));
    }
}

class MyHashMap{
    int[] map;
    public MyHashMap(){
        map = new int[10000001];
        Arrays.fill(map, -1);
    }
    public void put(int key, int value){
        map[key] = value;
    }
    public int get(int key){
        return map[key];
    }
    public void remove(int key){
        map[key] = -1;
    }
}