import java.util.*;
public class queue {

    public static class stack{
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty();
        }

        public void add(int data){
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }

        public int remove(){
            if(q1.isEmpty()){
                return -1;
            }
            return q1.remove();
        }
        public int peek(){
            if(q1.isEmpty()){
                return -1;
            }
            return q1.peek();
        }


    }


    // public static class Que{
    //     Stack<Integer> s1= new Stack<>();
    //     Stack<Integer> s2= new Stack<>();

    //     public  boolean isEmpty(){
    //         return s1.isEmpty();
    //     }


    //     // add
    //     public void add(int data){
    //         while(!s1.isEmpty()){
    //             s2.push(s1.pop());
    //         }
    //         s1.push(data);
    //         while(!s2.isEmpty()){
    //             s1.push(s2.pop());
    //         }
    //     }


    //     public int remove(){
    //         if(s1.isEmpty()){
    //             return -1;
    //         }
    //         return s1.pop();
    //     }

    //     public int peek(){
    //         if(s1.isEmpty()){
    //             return -1;
    //         }
    //         return s1.peek();
    //     }
    // }


    public static void first(String str){
        Queue<Character> q= new LinkedList<>();
        int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch -'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                
                    q.remove();
            }
                if(q.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(q.peek());
                }
            


        }
    }

    public static void interleave(Queue<Integer> q){
        int size= q.size();
        Queue<Integer> q1= new LinkedList<>();
        for(int i=0;i<size/2;i++){
            q1.add(q.remove());
        }
        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }
    }
    public static  class Stack{
        Deque<Integer> d= new LinkedList<>();
        public boolean isEmpty(){
            return d.isEmpty();
        }

        public  void push(int data){
            d.addLast(data);
        }
        public int pop(){
            return d.removeLast();
        }
        public  int peek(){
            return d.peekLast();
        }
    }
    public static void getbin(int n){
        Queue<String> q= new LinkedList<>();
        q.add("1");
        int i=1;
        while(i<=n){
            String s1= q.peek();
            q.remove();
            System.out.print(s1 +" ");
            String s2= s1;
            q.add(s2+"0");
            q.add(s2+"1");
            i++;
        }
    }
    public static void main(String[] args) {

      int n=5;
      getbin(n);

       
        
        
       
            
        
    }
}
