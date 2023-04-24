import java.util.Scanner;

public class twodarrays {

    //2d array creation and printing

    public static void twodarray(){
        Scanner sc= new Scanner(System.in);
        int arr[][]= new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
          

        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j+=1){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        //searching for an element in an array
        int key=5;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j+=1){
               if(arr[i][j]==key){
                System.out.println(i+","+j);
               }
            }
            
        }
       
    }


    

    // Spiral Matrix 
    public static void spiral(int arr[][]){
        int sr=0;
        int sc=0;
        int er=arr.length-1;
        int ec= arr[0].length-1;


        while(sr<=er && sc<=ec){
            // top
            for(int j=sr;j<=ec;j++){
                System.out.print(arr[sr][j]+" ");
            }
            // right
            for(int i=sr+1;i<=er;i++){
                System.out.print(arr[i][ec]+" ");
            }
            //bottom
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                System.out.print(arr[er][j]+" ");
            }
           //left
           for(int i=er-1;i>=sr+1;i--){
            if(sc==ec){
                break;
            }
            System.out.print(arr[i][sc]+" ");
           }
           sr++;
           sc++;
           ec--;
           er--;
           System.out.println();
        }
    }
    // Diagonal Sum 
    public static void dsum(int arr[][]){
        int sum=0;
        // for(int i=0;i<arr.length;i+=1){
        //     for(int j=0; j<arr[0].length;j++){
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }
        //         if(i+j==arr.length-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }
        ////optimized 
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        System.out.println(sum);
    }


    // Stair case Search (Search in a sorted matrix)
    public static boolean staircase(int arr[][], int key){
        int row=arr.length-1; int col= 0;
        while(row<arr.length && col>=0){
            if(key==arr[row][col]){
                System.out.println(row +" , "+col);
                
                return true;
            }
            else if(key <arr[row][col]){
                row--;
            }else{
                col++;
            }
        }
        return false;
        
    }


    // transpose of matrix
    public static void transpose(int arr[][]){
        int col=4, row=4;
        int transpose[][]= new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        prints(transpose);

    }
    public static void prints(int transpose[][]){
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
          }

    }


    public static void main(String[] args) {
       int arr[][]={{10,20,30,40},
                    {15,26,37,38},
                    {29,30,38,42},
                    {43,44,45,56}};
                 transpose(arr);
                //  prints(arr);

                  
    }
    
}
