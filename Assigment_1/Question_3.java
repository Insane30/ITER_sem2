import java.util.*;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,product=1;
        while(num>0){
            int r=num%10;
            sum+=r;
            product*=r;
            num=num/10;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Product is "+product);
        if(sum==product){
            System.out.println("Spy number");
        }else {
            System.out.println("Not a Spy number");
        }



    }
}
