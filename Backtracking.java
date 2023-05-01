public class Backtracking {

    public static void updatearr(int arr[], int val, int n){
        if(n==arr.length){
         printarr(arr);
            return;
        }
        arr[n]=val;
      updatearr(arr, val+1, n+1);
      arr[n]= arr[n]-2;
 
    }


    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

             static int count=0;

    public static void substrings(String str, String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return ;
        }
        // yes
        substrings(str, ans+str.charAt(i), i+1);
        // no
        substrings(str, ans, i+1);
    }

    public static void permutations(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
        }
        //recursion

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
           String newstr= str.substring(0, i)+str.substring(i+1);
           permutations(newstr, ans+ch);
        }
    }


    public static boolean issafe(char board[][], int row, int col){
        // up
        for(int i=row-1,j=col;i>=0&& j>=0 ;i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }


        // diag left
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j-- ){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // dig right

        for(int i=row-1, j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }


    public static boolean nqueens(char board[][], int row){
        // base case
        if(row==board.length){
            printboard(board);
           count++;
            return true;
        }

        // filling in row

        for(int i=0;i<board.length;i++){
           if(issafe(board, row, i)){
            board[row][i]='Q';
            if( nqueens(board, row+1)){
                return true;
            }
           
            board[row][i]='X';
            
           }
        }
        return false;
    }

    public static void printboard(char board[][]){
       
        for(int i=0;i<board.length;i++){
            
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
          
            
        }
        System.out.println("--------");
       
    }

    public static int gridways(int i, int j, int n, int m){
        if(i==n-1&& j==n-1){
            return 1;
        }
        else if(i==n || j==n){
            return 0;
        }

        int w1= gridways(i+1, j, n, m);
        int w2= gridways(i, j+1, n, m);
        return w1+w2;
    }

    public static void main(String[] args) {
        int n=3,m=3;
       int ways= gridways(0, 0, n, m);
       System.out.println(ways);
        
        // int n=2;
        // char board[][]= new char[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         board[i][j]='X';
        //     }
        // }
        // nqueens(board, 0);
        // System.out.println(count);
        // permutations("abc", "");

        // substrings("abc", "", 0);
        
        //int arr[]= new int[5];
        // updatearr(arr, 1, 0);
        // System.out.println();
        // printarr(arr);
        
    }
}
