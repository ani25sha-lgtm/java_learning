import java.util.*;

public class functions2 {
    public static int Calcsum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum= Calcsum(a,b) ;
        System.out.println(sum);
    }
}
