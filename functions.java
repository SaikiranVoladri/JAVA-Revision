import java.util.Scanner;
public class functions {


    public static int  printsum(int a , int b){ //parameters formal parameters
        return a+b;

    }

    public static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);

    }

    public static int product(int a, int b){
        return a*b;
    }

    public static int fact(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void binfact(int n, int r ){
        int bcf= fact(n)/ (fact(n-r) * fact(r));
        System.out.println(bcf);
    }

    // func to add 2 numbers
    public static int sum(int a , int b){
        return a+b;
    }
    public static float  sum(float  a, float b ){
        return a+b;
    }

    // function to check a prime number
    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        } 
    }
    return true;
}

// primes in range 
public static void primesinrange(int n){
    for(int i=2;i<n;i++){
        if(isprime(i)){
            System.out.print(i+" ");
        }
        }
    }

 // Code for Binary to decimal 

 public static int btod(int n){
    int decimal=0;
    int pow=0;
    while(n>0){
        int ld= n%10;
        decimal= decimal+ld*(int)Math.pow(2,pow);
        pow++;
        n=n/10;
    }
    return decimal;
 }


 public static int dtob(int n){
    int bin=0;
    int pow=0;
    while(n>0){
        int rem= n%2;
        bin= bin+(rem*(int)Math.pow(10,pow));
        pow++;
        n=n/2;
        
    }
    return bin;
 }

 // wap to print sum of digits 
 public static void sumofdigits(int n){
    int sum=0;
    while(n>0){
        int ld= n%10;
        sum+=ld;
        n=n/10;
    }
    System.out.println(sum);
 }

 // write a program for palindrome
 public static boolean ispdrome(int n){
    int original =n;
    int rev=0;
    while(n>0){
        int ld= n%10;
        rev= rev*10+ld;
        n=n/10;
    }
    System.out.println(rev);
    if(original==rev){
        return true;
    }
    return false;
 }


    public static void main(String[] args) {
        // function ids used to do a task which can be reused
        // Scanner sc= new Scanner(System.in);
        // int a =sc.nextInt();
        // int b= sc.nextInt();
        // int sum= printsum(a, b);// arguments actual params
        // System.out.println(sum);
        // swap(20, 10);
        //    int pro= product(2, 3);
        //    System.out.println(pro);
        // int f= fact(5);
        // System.out.println(f);
        // binfact(5, 3);

        // FUNCTION OVERLOADING (same function name but different parameters(in type or no of parameters))
        // System.out.println(sum(1, 01));
        // System.out.println(sum(1.2f, 2.3f));
        // sumofdigits(35);


        //PRIME NUMBER
        // primesinrange(20);
        // System.out.println(dtob(8));
        System.out.println(ispdrome(112211));


    }

}
