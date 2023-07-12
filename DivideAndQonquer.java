public class DivideAndQonquer{
    public static void merges(int arr[], int si, int mid, int ei){
        int temp[]= new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++;k++;
            }
            else{
                temp[k]=arr[j];
               j++;k++;
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0 ,i=si;k<temp.length;k++,i++){
                arr[i]=temp[k];

        }

    }

    public static void mergesort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid= si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merges(arr, si, mid, ei);
    }


    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static int  partition(int arr[], int si, int ei){
        int pivot= arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=arr[ei]){
                i++;
                int temp= arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
            }
        }
        i++;
        int temp= arr[ei];
        arr[ei]=arr[i];
        arr[i]= temp;

        return i;
    }

    public static void Quicksort(int arr[], int si, int ei){
        if(si>ei){
            return;
        }

        int pid= partition(arr, si, ei);
        Quicksort(arr, si, pid-1);
        Quicksort(arr, pid+1, ei);
    }


    public static int search(int arr[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }

        int mid= (si+ei)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(arr[si]<= arr[mid]){
        if(arr[si]<=target && target <=arr[mid]){
            // left 
           return  search(arr, target, mid-1, ei);
        }else{
            return search(arr, target, mid+1, ei);
        }
       }else{
        if(target>=arr[mid]&& target<=arr[ei]){
            return search(arr, target, mid+1, ei);
        }else{
            return search(arr, target, si, mid-1);
        }
       }

    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,1,2,3,4};
        System.out.println(search(arr, 4, 0, arr.length-1));
       
    }
}
