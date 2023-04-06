import java.util.*;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height in meters : ");
        double height=sc.nextDouble();
        System.out.print("Enter the weight in kg :");
        double weight =sc.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("BMI is : "+bmi);
        if(bmi<18.5){
            System.out.println("underweight");
        } else if (bmi<24.9) {
            System.out.println("Normal Weight");
        }else if(bmi<29.9){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
