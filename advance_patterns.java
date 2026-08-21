public class advance_patterns {
    public static void main(String[] args) {
        int n;

        // ---pattern 1---

        n=8;
        System.out.println("pattern 1:");
        //first part

        for(int i=0;i<n/2;i++){
            for( int j=0;j<=i;j++){
                System.out.print("*");
            }
            for( int k=0;k<=n-2*i-3;k++){
                System.out.print(" ");
            }
            for( int l=0;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second part

        for(int i=0;i<n/2;i++){
            for( int j=(n/2)-i;j>0;j--){
                System.out.print("*");
            }
            for( int k=0;k<2*i;k++){
                System.out.print(" ");
            }
            for( int j=(n/2)-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // ---pattern 2---

        n=5;
        System.out.println("pattern 2:");

        for(int i=0;i<n;i++){
            for(int k=n-i-1;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
        System.out.println();
        }


        // ---pattern 3---

        n=5;
        System.out.println("pattern 3:");
        for(int i=0;i<n;i++){
            for(int k=n-i-1;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((i+1)+" ");
            }
        System.out.println();
        }

    }
}
