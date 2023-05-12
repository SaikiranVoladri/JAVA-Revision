// import java.util.*;
// public class Intermediatecoding {


// //     // // Amstrong number 153(1^3 +5^3+3^3)power = no of digit (153)3 , (1324)4
// //     // public static boolean Amstrong(int n){
// //     //     int N=0;
     //     int original=n;
// //     //     int temp=n;
//     //     while(n>0){
 //     //         N++;        n=n/10;
// //     //     }
// //     //     int sum=0;
// //     //     while(temp!=0){
// //     //         int ld= temp%10;
           
// //     //         sum+=Math.pow(ld,N);
// //     //         temp=temp/10;   
// //     //     }
// //     //     // System.out.println(sum);
// //     //     // System.out.println(original);
// //     //     if(sum==original){
// //     //         return true;
// //     //     }
// //     //     return false;
// //     // }

// //     // // amstrong numbers in a range

// //     // public static void amstronginrange(){
// //     //     for(int i=150;i<10000;i++){
// //     //         if(Amstrong(i)){
// //     //             System.out.println(i);
// //     //         }
// //     //     }
// //     // }


// //     // // Prime factorization of a number


// //     // public static void primefactors(int n){
// //     //     for(int i=2;i<Math.sqrt(n);i++){
// //     //         while(n%i==0){
// //     //             System.out.print(i+" ");
// //     //             n=n/i;
// //     //         }

// //     //     }
// //     //     if(n>2){
// //     //         System.out.print(n);
// //     //     }
// //     // }


// //     // // HCF of two numbers 

// //     // public static void Hcf(int n1, int n2){
// //     //     int min= Math.min(n1,n2);
// //     //     int hcf=1;
// //     //     for(int i=1;i<min;i++){
// //     //         if(n1%i==0 && n2%i==0){
// //     //             hcf=i;
// //     //         }
// //     //     }
// //     //     System.out.print(hcf);
// //     // }


// //     // public static void hcfoptimized(int n1, int n2){// hcf -> finding using substraction method
      
// //     //     while(n1!=n2){
// //     //         if(n1>n2){
// //     //             n1-=n2;
// //     //         }
// //     //         else{
// //     //             n2-=n1;
// //     //         }
// //     //     }
// //     //     System.out.println(n1+" "+ n2);

// //     // }

// //     // lcm
// //     public static void Lcm(int n, int m){
        
// //         int max= n>m?n:m;
// //         int lcm=0;
// //         for(int i=max;i<(n*m);i++){// second method (lcm * hcf= n*m) if we know hcf we will get hcf and vice versa
           
// //             if(i%n==0 && i%m==0){
// //                lcm=i;
// //                 break;
               
// //             }
           
// //         }
// //         System.out.println(lcm);     
// //     }


// //     public static void llcm(int n, int m){
// //         int max= n>m?n:m;
// //         int temp=max;
// //         int lcm=0;
// //         while(true){
// //             if(max%n==0 && max%m==0){
// //                 lcm= max;
// //                 break;
// //             }
// //             max=max+temp;
// //         }
// //         System.out.println(lcm);
// //     }

// //     // octal to decimal conversion

// //     public static void octtodec(int n){
// //         int dec=0;
// //         int pow=0;
// //         while(n>0){
// //             int ld= n%10;
// //             dec+=ld* (int)Math.pow(8,pow);
// //             pow++;
// //             n=n/10;
// //         }
// //         System.out.println(dec);
// //     }

// //     // hexadecimal to decimal

// //     public static int hdctodec(String str){
// //         int n= str.length();
// //         int dec=0;
// //         int pow=0;
// //         for(int i=n-1;i>=0;i--){
// //             if(str.charAt(i)>='0' && str.charAt(i)<='9'){

// //                 int ld= str.charAt(i)-48;
// //                 dec+=ld*Math.pow(16,pow);
// //                 pow++;

// //             }
// //             else if(str.charAt(i)>='A'&& str.charAt(i)<='F'){
// //                 int ld= str.charAt(i)-55;
// //                 dec+=ld*Math.pow(16,pow);
// //                 pow++;
// //             }
// //             else{
// //                 System.out.println("invalid character");
// //                 break;
// //             }
// //         }
// //         return dec;
// //     }


// //     // decimal to hexadecimal

// //     public static void dectohex(int n){
// //         char hex[]= new char[100];

// //         int i=0;
// //         while(n!=0){
// //             int ld= n%16;
// //             if(ld<10){
// //                 hex[i]= (char)(ld+48);
// //                 i++;
// //             }
// //             else{
// //                 hex[i]=(char)(ld+55);
// //                 i++;
// //             }
// //             n=n/16;
// //         }
// //         for(int j=i;j>=0;j--){
// //             System.out.println(hex[j]);
// //         }
// //     }


// //  find second largest

// public static void seclar(int arr[]){
//     int first=Integer.MIN_VALUE;
//     int second= Integer.MIN_VALUE;

//     for(int i=0;i<arr.length;i++){
//         if(arr[i]>first){
//             first= arr[i];
//         }
//     }

//     for(int i=0;i<arr.length;i++){
//         if(arr[i]!=first && arr[i]>second){
//             second=arr[i];
//         }
//     }
//     System.out.println(first+" "+ second);

// }


// // find counting of n distinct numbers 

// public static int counting(int arr[]){
//     int count=0;
//     int temp[]=new int[arr.length];
//     for(int i=0;i<arr.length;i++){
//         if(temp[i]==0){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]==arr[i]){
//                     temp[j]=1;
//                     count++;                
//                 }
               
//             }
//             // count++;
//         }
//     }
//     return count;
// }

// //cound distint approach 2
// public static void countdist2(int arr[]){
//     int count=0;
//     for(int i=0;i<arr.length;i++){
//         int flag=0;
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i]==arr[j]){
//                 flag=1;
//                 break;
//             } 
//         }
//         if(flag==0){
//             count++;
//         }
      

//     }
//     System.out.println(count);
// }

// // find distinct count third aproach
// public static void dicsccount(int arr[]){
//     int count=0;
//     Arrays.sort(arr);
//     for(int i=0;i<arr.length;i++){

//         while(i<arr.length-1&&arr[i]==arr[i+1]){
//             i++;
//         }
//         count++;
        
//     }
//     System.out.println(count);
// }

// // find Kth smallest elment
// public static void ksmall(int arr[]){
//     int k=3,i;
//     Arrays.sort(arr);
//     for( i=0;i<arr.length;i++){
//         while(i<arr.length-1 && arr[i]==arr[i+1]){
//             i++;
//         }
//         k--;
//         if(k==0){
//             break;
//         }
//     }
//     System.out.println(arr[i]);

// }

// // cont distinct numbers 
// public static void countsdist(int arr[]){
    
//     for(int i=0;i<arr.length;i++){
//         int count=0;
//          int flag=0;
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i]==arr[j]){
//                 flag=1;
//                 break;
//             }
//         }
//         if(flag==1){
//             continue;   
//         }
//         for( int j=0;j<=i;j++ ){
//             if(arr[i]==arr[j]){
//                 count++;
//             }
            
//         }
//         System.out.println(arr[i]+" "+count);
        
//     }
// }

// public static void thirdapprach(int arr[]){
//     Arrays.sort(arr);
//     for(int i=0;i<arr.length;i++){
//         int count=1;
//         while(i<arr.length-1&& arr[i]==arr[i+1]){
//             i++;
//             count++;
//         }
//         System.out.println(arr[i]+" "+ count);
//     }
// }
//     public static void main(String[] args) {
//         int arr[]= {1,1,2,2,3,4,4};
//         thirdapprach(arr);
//     //    ksmall(arr);
//     //    int a= counting(arr);
//     //    System.out.println(a);
//         // System.out.println(Amstrong(153));    
//     //    primefactors(15);\
//     //    llcm( 60,36);
// //     octtodec(120);
// //     int base=8;
// //     Scanner sc= new Scanner(System.in);
// //    String octal = sc.nextLine();

// //     System.out.println(Integer.parseInt(octal,base));
// //    System.out.println(hdctodec("1DA83"));
//     //  dectohex(892);
//     }
// }
