
public class trees {


    static class Node {
        int data;
        Node left;
        Node right;

      Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }


    static class Binarytree{
         int idx= -1;
        public   Node BuildTree(int nodes[]){
                idx++;
                if(idx>=nodes.length){
                    return null;
                }
                if(nodes[idx]== -1){
                    return null;
                }

                Node newnode = new Node(nodes[idx]);
                newnode.left= BuildTree(nodes);
                newnode.right= BuildTree(nodes);

                return newnode;
        }
    }


    public static void preorder(Node root){
        if(root== null){
            System.out.print("-1 ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root== null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public  static void postorder(Node root){
        if(root== null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
       
    }
        public static void main(String[] args) {

            int  nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Binarytree t= new Binarytree();
            Node root= t.BuildTree(nodes);
            // System.out.println(root.data);
            // preorder(root);
            // inorder(root);
           postorder(root);

            
            
        }
}
