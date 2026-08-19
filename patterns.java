
public class patterns {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        //Scanner sc =new Scanner(System.in);
       // n=sc.nextInt();
       // m=sc.nextInt();
        //System.out.println("Enter the value of n:");

        // ---pattern 1---

        System.out.println("pattern 1:");
        for(int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ---pattern 2---

        System.out.println("pattern 2:");
        for(int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                if(i==0||i==n-1||j==0||j==m-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }

        //---pattern 3---
        
        System.out.println("pattern 3:");
        for(int i=0;i<n;i++){
            for( int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
   }
}
