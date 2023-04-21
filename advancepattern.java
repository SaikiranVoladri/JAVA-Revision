public class advancepattern{

    // program to print hollow rectrangle
    public static void hollowRect(int n , int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    // inverted half rotated pyramid 
    public static void ihrp(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // inversted half pyramid
    public static void ihp(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    // floids triangle
    public static void floydtri(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    // 01 triangle
    public static void zone(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
               
            }
            System.out.println();
        }
    }

    // butterfly pattern
    public static void bfly(int n){
        for(int i=1;i<=n;i++){
            
                // stars i starts
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                for(int k=1;k<=2*(n-i);k++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println(); 
            } 
            for(int i=n;i>=1;i--){
            
                // stars i starts
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                for(int k=1;k<=2*(n-i);k++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println(); 
            } 
        }

        // solid rhombus
        public static void srom(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(".");
                }
                
                 System.out.print("*****");
                
                System.out.println();
            }
        }

        // hollow rhombus
        public static void hros(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(".");
                }
                for(int j=1;j<=n;j++){
                    if(i==1|| j==1||i==n||j==n){
                        System.out.print("*");
                    }else{
                        System.out.print(".");
                    }
                }System.out.println();
            }
        }

        // diamond pattern
        public static void diamond(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(".");
                }
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n;i>0;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(".");
                }
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        // number pyramid
        public static void np(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }

        // palindromic pattern 
        public static void pdrome(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    
    public static void main(String[] args) {
        // hollowRect(4,5);
        // ihrp(5);
        // ihp(5);
        // floydtri(5);
        // zone(5);
        // bfly(5);
        // srom(5);
        // hros(5);
        // diamond(6);
        // np(5);
        pdrome(5);
    }
}