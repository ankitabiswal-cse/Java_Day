package day01;
import java.util.*;
public class SumOfTwoNumbers {
    static int CalculateSum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The Sum Of Two Number Is ="+CalculateSum(a,b));
    }

}
