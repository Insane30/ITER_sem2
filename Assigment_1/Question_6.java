import java.util.*;
public class Question_6 {
    public static boolean isOdd(int n){
       if((n&1)==0){
           return false;
       }else{
           return true;
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.println(a+" is odd : "+isOdd(a));


    }
}
