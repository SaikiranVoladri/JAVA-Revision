import java.util.*;


public class Arraylist {


     public static int water(ArrayList<Integer> al){

    //     int maxwater=0;
       
    // //     int totwat=0;

    // //     for(int i=0;i<al.size();i++){
    // //         for(int j=i+1;j<al.size();j++){
    // //             int height= Math.min(al.get(i), al.get(j));
    // //             System.out.print("("+al.get(i)+" "+al.get(j)+")");
    // //             int width= j-i;//3
    // //              totwat= height*width;
    // //              System.out.print(totwat + "");
    // //              maxwater= Math.max(totwat, maxwater);
    // //              System.out.print(","+maxwater+" ");
    // //         }
    // //         System.out.println();
           
            
           
          
    // //     }
    // //     return maxwater;
    // // }


    // // max water two pointer approach 

    // public static int maxwater(ArrayList<Integer> al){
    //     int lp=0;
    //     int rp= al.size()-1;
    //     int maxwatter=0;

    //     while(lp<rp){
    //         int ht= Math.min(al.get(lp),al.get(rp));
    //         int width= -(lp-rp);
    //         int currwater= ht*width;
    //         maxwatter= Math.max(maxwatter, currwater);

    //         if(al.get(lp)<al.get(rp)){
    //             lp++;
    //         }else{
    //             rp--;
    //         }
    //     }
    //     return maxwatter;
    // }

    public static boolean pairsum(ArrayList<Integer> al, int target){

        for(int i=0;i<al.size();i++){
            for(int j=i+1;j<al.size();j++){
                if((al.get(i)+al.get(j))==target){
                    return true;
                }
            }
        }
        return false;

    }

//     public static boolean pairsum2(ArrayList<Integer> al, int target){
//         int lp=0;
//         int rp= al.size()-1;
//        while(lp<rp){
//         if(al.get(lp)+al.get(rp)==target){
//             return true;
//         }
//         if(al.get(lp)<=al.get(rp)){
//             lp++;
//         }else{
//             rp--;
//         }
//        }
//        return false;
//     }


    public static boolean pairsum3(ArrayList<Integer>al, int target){
        int lp=0;
        int rp=0;
        int n= al.size();
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>al.get(i+1)){
               lp=i+1;
                rp=i;
            }
        }

        while(lp!=rp){
            if(al.get(lp)+al.get(rp)==target){
                return true;
            }
            if(al.get(lp)+al.get(rp)<target){
               lp= (lp+1)%n;
            }else{
                rp= (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> al= new ArrayList<>();
        al.add(11);
        al.add(15);
        al.add(6);
        al.add(8);
        al.add(9);
        al.add(10);
        System.out.println(pairsum3(al, 16));
     



;
    }


}
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> al= new ArrayList<>();
//         ArrayList<Integer> l1= new ArrayList<>();
//         ArrayList<Integer> l2= new ArrayList<>();
//         ArrayList<Integer> l3= new ArrayList<>();

//         for(int i=1;i<=10;i++){
//             l1.add(i*2);
//             l2.add(i*3);
//             l3.add(i*5);
//         }
//         al.add(l1);
//         al.add(l2);
//         al.add(l3);

//         for(int i=0;i<al.size();i++){
//             ArrayList<Integer> curr= al.get(i);
//             for(int j=0; j<curr.size();j++){
//                 System.out.print(curr.get(j)+" ");
//             }
//             System.out.println();

//         }
       




//         // al.add(1);
//         // al.add(2);
//         // al.add(3);
//         // al.add(4);
//         // al.add(5);
//         // int i=1;
//         // int j=3;
       
//         // int temp= al.get(i);
//         // int temp2= al.get(j);
//         // al.set(i,temp2);
//         // al.set(j,temp);

//         // System.out.println(al);
        

//         // int max=0;
//         // for(int i=0;i<al.size();i++){
//         //     if(max<al.get(i)){
//         //         max= al.get(i);
//         //     }
//         // }
//         // System.out.println(max);
//         // System.out.println(al.size());
//         // for(int i=0;i<al.size();i++){
//         //     System.out.print(al.get(i)+" ");
//         // }
//         // System.out.println();
//         // for(int i=al.size()-1;i>=0;i--){
//         //     System.out.print(al.get(i)+" ");
//         // }


//         // System.out.println(al);
//         // // System.out.println(al.get(0));
//         // // System.out.println(al.remove(2));
//         // // System.out.println(al);
//         // System.out.println(al.contains(1));
//         // al.add(0,10);
//         // System.out.println(al);
//     }
    
// }
