package day01;
import java.util.*;
public class Cube {
    static int CalculateCube(int n){
        return n*n*n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The Cube Of The Number Is ="+CalculateCube(n));
    }
}
