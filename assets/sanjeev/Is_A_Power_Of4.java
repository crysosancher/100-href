import java.io.*;
import java.util.*;
public class Is_A_Power_Of4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fac = 0b01010101010101010101010101010101;
        System.out.print(n > 0 && (n & (n - 1)) == 0 && (fac & n) > 0);
    }
}
