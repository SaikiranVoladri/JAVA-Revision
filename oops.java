

public class oops {
    public static void main(String[] args) {
        sai s1= new sai();
        System.out.println(s1.color);
       
        
}
}

class student{
    String color;
    String name;
    int age;
    static String Schoolname;

    student(){
        System.out.println("n");
    }

    void setname(String name){
       this.name= name;
    }
    String  getname(){
        return this.name;
    }

}
class sai extends student {
    sai(){
        super.color="black";
        System.out.println("sai c");
    }
}

// interface carnivore{
//     void eatsflesh();
// }
// interface herbivore{
//     void eatsgraass();
// }

// class bear implements carnivore, herbivore{
//     public void eatsflesh(){
//         System.out.println("eats flesh");
//     }
//    public  void eatsgraass(){
//         System.out.println("eats grass");
//     }
// }


// interface chessplayer{
//     public abstract void moves();

// }
// class queen implements chessplayer{
//      public void moves(){
//         System.out.println("Queen moves ");
//     }
// }

// class King implements chessplayer{
//     public void moves(){
//        System.out.println("king moves ");
//    }
// }
// abstract class Animal{

//     Animal(){
//         System.out.println(":Animal constructer is acllecd");
//     }
//     void eats(){
//         System.out.println("animal eats");
       
//     }
//     abstract void walks();
// }
// class horse extends Animal{
//     horse(){
//         System.out.println("horse con    called");
//     }
//     void walks(){
//         System.out.println("walks with 4 legs");
//     }
// }

// class Animal {
//     void eats(){
//         System.out.println("A");
//     }
// }

// class Deer extends Animal{
//     void eats(){
//         System.out.println("B");
//     }
// }
// class calculator{
//     int sum(int a, int b){
//         return a+b;
//     }
//     int sum(int a, int b, int c){
//         return a+b+c;
//     }
// }




// SINGLE LEVEL INHERITANCE
// class Animal{
//     void eats(){
//         System.out.println("Animal eats");
//     }
//     void breathe(){
//         System.out.println("animal breathes");
//     }
// }
// class Mammal extends Animal{
//     int legs;

// }
// class bird extends Animal{
//     void swim(){
//         System.out.println("swims");
//     }
// }
// class Dog extends Mammal{
//     String breed;
// }
// class Fish extends Animal{
//     int fins;
//     void swims(){
//         System.out.println("fish swims");
//     }
// }
// class Student{
//     String name;
//     int age;
//     int marks[];
//     Student(int age , String name){
//         marks= new int[3];
//         this.age= age;
//         this.name=name;
        
      

//     }

//     Student(Student s1){
//         marks= new int[3];
//         this.age=s1.age;
//         this.name= s1.name;
//         for(int i=0;i<marks.length;i++){
//             this.marks[i]= s1.marks[i];
//         }
        
       
//     }
// }

// class Pen{
//      String color;
//     int tip;

//     Pen(String name){
//         this.color= name;
//         System.out.println(this.color);
//         System.out.println("constructer is called");
//     }

//     String getcolor(){
//         return this.color;
//     }
//     int gettip(){
//         return this.tip;
//     }


//     void setcolor(String color){
//         this.color= color;
//     }

//     void settip(int tip){
//         this.tip= tip;
//     }
// }
