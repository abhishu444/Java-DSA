import java.util.Scanner;

public class Arraysum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int value[]=new int[5];
        for(int i=0;i<5;i++){
            value[i]=sc.nextInt();
            sum+=value[i];
        }
        System.out.println("Sum of array elements: "+sum);
    }
}