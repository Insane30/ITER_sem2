import java.util.*;
public class Question_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max,min,maxc=0,minc=0;
        System.out.print("Enter number of elements of Array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter elements of thr array : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
         max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(max==a[i]){
                maxc++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(min==a[i]){
                minc++;
            }
        }
        System.out.println("Maximum element of Array is "+max+" and occurs "+maxc+" times");
        System.out.println("Minimum element of Array is "+min+" and occurs "+minc+" times");
        int maxoc = 0,minoc = 0;
        for(int i=0;i<a.length;i++){
            if(max==a[i]){
                maxoc=i;
                break;
            }
        }
        for(int i=a.length-1;i>=0;i--){
            if(min==a[i]){
                minoc=i;
                break;
            }
        }
        System.out.println("First occurrence of maximum element is at position "+maxoc);
        System.out.println("Last occurrence of minimum is at position "+minoc);
    }
}
