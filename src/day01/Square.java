package day01;
import java.util.*;
public class Square {
    static int CalculateSquare(int n){

        return n*n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The Square Of Number Is ="+CalculateSquare(n));
    }
}
