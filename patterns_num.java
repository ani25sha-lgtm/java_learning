public class patterns_num {
    public static void main(String[] args) {
        int n = 5;


        // ---pattern 1---

        System.out.println("pattern 1:");
        for(int i=0;i<n;i++){
            for( int j=0;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        // ---pattern 2---

        System.out.println("pattern 2:");
        for(int i=0;i<n;i++){
            for( int j=0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // ---pattern 3---

        System.out.println("pattern 3:");
        for(int i=n;i>=0;i--){
            for( int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        // ---pattern 4---

        System.out.println("pattern 4:");
        for(int i=n;i>=0;i--){
            for( int j=0;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // ---pattern 5---

        System.out.println("pattern 5:");
        int k=0;
        for(int i=0;i<=n;i++){
            for( int j=0;j<i;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }

        // ---pattern 6---

        System.out.println("pattern 3:");

        System.out.println("pattern 5:");
        k=0;
        for(int i=0;i<=n;i++){
            for( int j=0;j<i;j++){
                System.out.print(k +" ");
                if(k==0){
                    k=1;
                }
                else {
                    k=0;
                }
            }
            System.out.println();
        }
    }
}