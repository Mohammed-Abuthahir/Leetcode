import java.util.*;
class Robotreturnorigin{
    public static boolean robots(String s){
        int Rcount = 0 , Lcount = 0, Ucount = 0, Dcount = 0;
        boolean isUp = false , isDown = false, isLeft = false, isRight = false;
        for(char c : s.toCharArray()){
            if(c == 'U') {
                Ucount++;
                isUp = true;
            }
            else if(c == 'D'){
                Dcount++;
                isDown = true;
            }
            else if(c == 'L'){
                Lcount++;
                isLeft = true;
            }
            else{
                Rcount++;
                isRight = true;
            }
        }
        if(isUp || isDown){
            if(Ucount > 0 && Dcount == 0) return false;
            else if(Ucount == 0 && Dcount > 0) return false;
            else if(Ucount != Dcount) return false;
        }
        if(isLeft || isRight){
            if(Rcount > 0 && Lcount == 0) return false;
            else if(Rcount == 0 && Lcount > 0) return false;
            else if(Rcount != Lcount) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = robots(s);
        System.out.println(result);
    }
}