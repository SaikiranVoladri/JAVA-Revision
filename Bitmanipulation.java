public class Bitmanipulation {

    public static void evenorodd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even");
        }else
        System.out.println("odd");
    }

    public static int getithbit(int n, int i){
        int bm= 1<<i;
        if((n & bm)==0){
            return 0;
        }else
        return 1;
    }
    public static int setithbit(int n, int i){
        int bm= 1<<i;
        return ((n | bm));
    }

    public static int clearith(int n, int i){
        int bm= ~(1<<i);
        return (n & bm);
    }
    // clear ith bits
    public static int clearithbits(int n , int i){
            int bm=(~0)<<i;
            return n&bm;

    }

    public static int updateithbit(int n, int i, int newbit){
        // if(newbit==0){
        //     return clearith(n, i);
        // }else
        //     return setithbit(n, i);
       n= clearith(n, i);
       int bm= newbit<<i;
       return n | bm;

        
    }


    public static int clearrangebits(int n, int i, int j){
        int a=(~0)<<(j+1);
        int b= (1<<i)-1;
        int bm= a |b;
        return n & bm;
    }

    public static boolean ispoweroftwo(int n){
        return ((n &(n-1)) ==0);
    }


    // claculate set bits in an number

    public static int noofsetbits(int n){
        int c=0;
        while(n!=0){
            if((n  &1 )!=0){
                c++;
            }
            n= n>>1;
        }
        return c;
    }
    // A to the power N

    public static int apowern(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans= a * ans;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    //swap
    public static void swap(){
        int x=3,y=4;
        
        System.out.println(x+" "+y);
         x= x^y;
         System.out.println(x+" "+y);
         y=x^y;
         System.out.println(x+" "+y);
         x=x^y;
         System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
       //swap();
       System.out.println(-~(-4));
        // setithbit(10, 2);
        // System.out.println(getithbit(10, 2));
        // evenorodd(12);
        // evenorodd(11);
        // System.out.println(5&6);
        // System.out.println(5|6);
        // System.out.println(5^6);
        // System.out.println(~0);
        // System.out.println(5<<2);
        // System.out.println(6>>1);

    }
    
}
