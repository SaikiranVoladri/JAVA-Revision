public class Reccursion {
    public static void printDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }

    public static void Printinc(int n){
        if(n==0){
            return;
        }
       
        Printinc(n-1);
        System.out.println(n);
        
    }

    public static int factorial(int n){
        int fact=1;
        if(n==1){
            return 1 ;
        }

       fact= n* factorial(n-1);
       return fact;

    }

    public static int sum(int n){
        int sum=0;
        if(n==1){
            return 1;
        }
        sum= n+sum(n-1);
        return sum;

    }

    public static int fibonachi(int n){
        if(n==1 ||  n==0){
            return n;
        }
        int fibn = fibonachi(n-1)+fibonachi(n-2);
        return fibn;
    }

    public static boolean issorted(int arr[], int i){
        // base case
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }

    public static int firstoccourance(int arr[], int key, int i){
        if(arr[i]== key ){
            return i;

        }
         return firstoccourance(arr, key, i-1);
    }

    public static int xtothepowern(int x, int n){
        if(n==0){
            return 1;
        }

        int val= x* xtothepowern(x, n-1);
        return val;
    }

    public static int optimizedpower(int x, int n){
        if(n==0){
            return 1;
        }
        int hp= optimizedpower(x, n/2);
        if(n%2==0){
            return hp* hp ;
        }
        else
            return x* hp*hp;
        
    }

    public static int tiling(int n){
        if(n==1 || n==0){
            return 1;
        }
        int v= tiling(n-1);
        int h= tiling(n-2);
        return v+h;
    }


    public static void duplicatesremove(String str, int i, StringBuilder sb , boolean map[]){
       
      
        if(i==str.length()){
            System.out.println(sb);
            return ;
        }
        // kaam
        char ch= str.charAt(i);
        if(map[ch-'a']==true){
            // duplicates existed
            duplicatesremove(str, i+1, sb, map);

        }else{
            // duplicates not there
            map[ch-'a']=true;
           
            duplicatesremove(str, i+1, sb.append(ch), map);

        }

    }

    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        
        // single
        int fnm1= friendspairing(n-1);
        // pairs
        int  fnm2= (n-1)*friendspairing(n-2);
        return fnm1+fnm2;
    }


    public static void binarystrings(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binarystrings(n-1,0, str+"0");
        if(lastplace==0){
            binarystrings(n-1, 1, str+"1");
        }
    }

    public static void towerofhanoi(int n, String src, String helper, String dest){

        if(n==1){
            System.out.println("transfered desc"+n+" from "+src+" to "+dest);
            return;
            
        }

        // trensfer from src to dest using helper

        towerofhanoi(n-1, src, dest, helper);
        System.out.println("transfered desc"+n+" from "+src+" to  "+dest);
        // treansfer from helper to dest using src
        towerofhanoi(n-1, helper,  src, dest);
    }


    public static void substrings(String str, int idx,String newstr ){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char ch= str.charAt(idx);
        substrings(str, idx+1, newstr+ch);
        substrings(str, idx+1, newstr);
    }



    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void keypadcombinations( String str, int i, String combination){
        if(i==str.length()){
            System.out.println(combination);
            return;
        }

        char ch= str.charAt(i);
        String map= keypad[ch-'0'];

        for(int j=0;j<map.length();j++){
            keypadcombinations(str, i+1, combination+map.charAt(j));
        }
    }

    public static int first,last= -1;
    public static void firstandlast(String str, int idx, char elenemt){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char ch= str.charAt(idx);
        if(ch==elenemt){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        firstandlast(str, idx+1, elenemt);
    }
    public static void main(String[] args) {
     firstandlast("aa", 0, 'a');
    
    }
    
}
