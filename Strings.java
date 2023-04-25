
// import java.util.*;
// public class Strings {

//     // palindrome
//     public static boolean ispdrome(String str){
//         for(int i=0;i<str.length()/2;i++){
//             if(str.charAt(i)!=str.charAt(str.length()-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }

//   // Shortest path

//   public static float getspath(String str){
//     int x=0,y=0;

//     for(int i=0;i<str.length();i++){
//         char dir=str.charAt(i);
//         if(dir=='S'){
//             y--;

//         }
//         else if(dir =='N'){
//             y++;
//         }
//         else if(dir=='E'){
//             x++;
//         }
//         else{
//             x--;
//         }
//     }
//     double xsq= x*x;
//     double  ysq= y*y;
//     return  (float)Math.sqrt(xsq+ysq);

//   }

//   public static String subs(String str , int si , int ei){
//     String sub="";
//     for(int i=si;i<ei;i++){
//         sub+=str.charAt(i);
//     }
//     return sub;
//   }


//   // largest string in array
//   public static String largest(String str[]){
//     String largest=str[0];
//     for(int i=0;i<str.length;i++){
//         if(largest.compareTo(str[i])<0){
//             largest=str[i];
//         }
//     }
//     return largest;

//   }


//   // String builder append
// public static void sbuilder(StringBuilder sb){
//     for(char ch='a';ch<='z';ch++){
//         sb.append(ch);
//     }
//     System.out.println(sb);
// }


// // Wap to convert first letter to Uppercase
// public static String toupper(String str){
//     StringBuilder sb= new StringBuilder("");
//     char ch= Character.toUpperCase(str.charAt(0));
//     sb.append(ch);
//     for(int i=1;i<str.length();i++){
//         if(str.charAt(i)==' ' && i<str.length()-1){
//             sb.append(str.charAt(i));
//             i++;
//             sb.append(Character.toUpperCase(str.charAt(i)));
//         }else{
//             sb.append(str.charAt(i));
//         }
//     }
//     return sb.toString();

// }



// // String Compression
// public static String scompression(String str){
//     Integer count=0;
//     StringBuilder sb= new StringBuilder("");
//     for(int i=0;i<str.length();i++){
//         count=1;
//         while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
//             count++;
//             i++;
//         }
//         sb.append(str.charAt(i));
//         if(count>1){
//             sb.append(count.toString());
//         }
//     }
//     return sb.toString();
// }

// public static boolean anagram(String str1, String str2){
//     if(str1.length()==str2.length()){
//         char arr1[]= str1.toCharArray();
//         char arr2[]=str2.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         if(Arrays.equals(arr1, arr2)){
//             return true;
//         }


//     }
//     return false;
// }
//     public static void main(String[] args) { 
//         System.out.println(anagram("race", "cares"));                      

//         // String str="sskk";
//         // int count=0;
//         // for(int i=0;i<str.length();i++){
//         //     if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
//         //         count++;
//         //     }
//         // }
//         // System.out.println(count);
//         // System.out.println(scompression("abcd"));
//         // System.out.println(toupper("hi my name is sai kir "));
  

//         // StringBuilder sb= new StringBuilder("");
//         // sbuilder(sb);
//         // String str[]={"abc","man","xyz"};
//         // System.out.println(largest(str));
//         // System.out.println(subs("helloworls", 0, 5));

//         // System.out.println(getspath("WNEENESENNN"));
//         // String str= "Sai";
//         // String str2= new String("ssaa");
//     //     Scanner sc= new Scanner(System.in);
//     //    String name= sc.nextLine();
//                 // System.out.println(name);
//                 // System.out.println(name.length());
//                 // String fn="sai";
//                 // String sn= "kiran";
//                 // System.out.println(fn+sn);

//                 // String str= "Saikiran";
//                 // for(int i=0;i<str.length();i++){
//                 //     System.out.print(str.charAt(i)+" ");
//                 // }

        
//     }
    
// }
