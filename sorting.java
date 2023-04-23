import java.util.*;
public class sorting {

    public static void bubble(int arr[]){
        int swap=0;
        for(int i=0;i<arr.length-1;i++){
            
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    swap++;

                }
            }
            if(swap==0){
                System.out.println("already sorted");
                return ;
            }
        }
       

        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minposition=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    minposition=j;
                }
            }
            int temp= arr[minposition];
            arr[minposition]= arr[i];
            arr[i]= temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr= arr[i];
            int prev= i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]= curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }


   // countingsort
   public static void countingsort(int arr[]){
    int max= Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        max= Math.max(max, arr[i]);
    }

    int count[]= new int[max+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
    }

    int j=0;
    for(int i=0;i<count.length;i++){
    while(count[i]>0){
        arr[j]=i;
        j++;
        count[i]--;
        System.out.print(i+" ");
    }
    }

    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+ " ");
    // }
   }

    // inbuilt sorts 
    public static void main(String[] args) {
       int arr[]= {3,5,4,5,2,1};
        countingsort(arr);
       
        
    }
    
}
