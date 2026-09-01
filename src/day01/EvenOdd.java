package day01;
import java.util.*;

public class EvenOdd {
    static void  CheckEvenOdd(int n){
    if(n % 2 == 0){
        System.out.println("The Number Is Even");
    }else{
        System.out.println("The Number Is Odd");
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number:");
        int n = sc.nextInt();
        CheckEvenOdd(n);

    }


}