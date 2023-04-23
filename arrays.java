import java.util.*;
public class arrays {

    public static void update(int arr[], int n){
        n=5;
        for(int i=0;i<arr.length;i++){
            arr[i]+=1;

        }   
    }

    //Linear search
    public static int lsearch(int arr[], int n){
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return 0;
    }


    // largest in an array
    public static int largest(int arr[]){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }

    // binary search 

    public static int bsearch(int arr[], int key){

        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else{
                if(arr[mid]>key){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }return 1;
       
    }


    // reverse an array
    public static void rev(int arr[]){
        int n= arr.length;

        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]= arr[n-i-1];
            arr[n-i-1]= temp;

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // pairs in an array
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
           int curr=arr[i];
           for(int j=i+1;j<arr.length;j++){
            System.out.print(curr +","+ arr[j]+ ' ');
           }System.out.println();
            
        }
    }

    // total sub arrays 

    public static void sub(int arr[]){
        for(int i=0;i<arr.length;i++){
            int st=i;
            for(int j=i;j<arr.length;j++){
                int ed=j;

                for(int k=st;k<=ed;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    // max subarray sum
    public static void maxsubsum(int arr[]){
        int currsum=0; 
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int s=i;
            for(int j=i+1;j<arr.length;j++){
                int e=j;
                currsum=0;
               for(int k=s;k<=e;k++){
                currsum+=arr[k];
               
               }
               System.out.print(currsum+" ");
               if(currsum>maxsum){
                maxsum=currsum;
               }
            }System.out.println();
        }
        System.out.println(maxsum);

    }


    // maximum sub array sum using Kadanes method

    public static void Kadanes(int arr[]){
        int maxsum= Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
                currsum+=arr[i];
                if(maxsum>currsum){
                    currsum=0;

                }
                maxsum= Math.max(currsum, maxsum);

        }
        System.out.println(maxsum);
    }

    public static int trappingrainwater(int arr[]){
        int n= arr.length;
        //left max height
        int leftmax[]= new int[n];
        leftmax[0]= arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]= Math.max(arr[i], leftmax[i-1]);
        }
        // right max height

        int rightmax[]= new int[n];
        rightmax[n-1]= arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]= Math.max(arr[i], rightmax[i+1]);

        }

        // traped water = waterlvl - arr[i]
        int trapedwater=0;
        for(int i=0;i<n;i++){
            int waterlvl= Math.min(leftmax[i], rightmax[i]);
            trapedwater+= waterlvl-arr[i];
        }
        return trapedwater;


    }

    public static int buyandsell(int arr[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<arr.length;i++){
        if(buyprice<arr[i]){
           int  profit= arr[i]-buyprice;
           maxprofit= Math.max(maxprofit, profit);

        }else{
            buyprice=arr[i];
        }


    }
    return maxprofit;
    }

    public static boolean istwice(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,4,1};
     
      System.out.println(istwice(arr));



        // // Array -> array is a data structure which is used to store elemnts of same type in congigious memory locations
        // int arr[]=new int[3];
        // int n=10;
        // Scanner sc= new Scanner(System.in);
        // arr[0]=sc.nextInt();
        // arr[1]= sc.nextInt();
        // arr[2]= sc.nextInt();
        // update(arr,n);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print (arr[i]+ " ");
        // }
        // System.out.println(n);
        
    }
    
}
