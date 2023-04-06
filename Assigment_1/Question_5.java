import java.util.*;

public class Question_5 {
    public static int sum_Of_Digits(int n) {
        int sum=0;
        while(n!=0){
         sum+=n%10;
            n=n/10;
        }
        if(sum>9){
            sum=sum_Of_Digits(sum)
            }
return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
            int num=sc.nextInt();
        System.out.println("Sum of digits of "+num+""+"until the number is the single digit"+sum_Of_Digits(num));
    }


}
