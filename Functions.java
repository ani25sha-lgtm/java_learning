import java.util.*;

public class Functions {
    public static void myName(String name){
        System.out.println(name);
        return;a
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        myName(name);// function-call
        sc.close();
    }
}
