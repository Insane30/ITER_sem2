import java.util.*;
public class Question_6 {
    public static boolean isOdd(int n){
        boolean b =true;
        for(int i=0;i<=n;i++){
            b=!b;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.println(a+" is odd : "+isOdd(a));


    }
}
