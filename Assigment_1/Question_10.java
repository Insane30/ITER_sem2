import java.util.*;
public class Question_10 {
    public static double  sumColumn (double [][]m,int columnIndex){
        double sum=0;
        for(int i=0;i<m.length;i++){
            sum+=m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 3-by-4 matrix row bt row :");
        double arr[][]=new double[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j< 4;j++){
                arr[i][j]=sc.nextDouble();
            }
        }
        for(int i=0;i<=3;i++){
            System.out.println("Sum of the elements at column "+i+" is "+sumColumn(arr,i));
        }
    }
}
