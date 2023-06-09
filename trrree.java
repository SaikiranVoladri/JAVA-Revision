import java.util.*;


public class trrree {



    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lheight= height(root.left);
        int rheight= height(root.right);
        return Math.max(lheight,rheight)+1;
    }

    public static int diam(Node root){
        if(root==null){
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);
        int ld= diam(root.left);
        int rd= diam(root.right);
        int sd= lh+rh+1;
        return Math.max(sd,Math.max(rd, ld));

    }

    static class Info{
        int d,h;
        Info(int d, int h){
                this.d= d;
                this.h= h;
        }

    }

    public static Info dd(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info ld= dd(root.left);
        Info rd= dd(root.right);
        int d= Math.max(Math.max(ld.d,rd.d), ld.h+rd.h+1);
        int h= Math.max(ld.h, rd.h)+1;
        return new Info(d, h);
    }

    public static boolean issame(Node root, Node subroot){
        if(root== null && subroot==null){
            return true;
        }else if(root== null || subroot==null || root.data!= subroot.data){
            return false;
        }
        if(!issame(root.left, subroot.left)){
            return false;
        }
        if(!issame(root.right, subroot.right)){
            return false;
        }

        return true;
       
    }
    public static boolean isexists(Node root, Node subroot){
        if(root== null){
            return false;
        }

        if(root.data==subroot.data){
            if(issame(root, subroot)){
                return true ; 
            }
           
        }

        
        
        return  isexists(root.left, subroot)||isexists(root.right, subroot);
    }


    public static void kth(Node root, int level , int k){
        if(root==null){
            return;
        }

        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        kth(root.left, level+1, k);
        kth(root.right, level+1, k);
    }

    public static boolean getpath(Node root , int n, ArrayList<Node>path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundleft = getpath(root.left, n, path);
        boolean foundright= getpath(root.right, n, path);

        if(foundleft || foundright){
            return true;
        }
        path.remove(path.size()-1);

        return false;


    }

    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1= new ArrayList<>();
        ArrayList<Node> path2= new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root,n2, path2);
        int i=0;
        for( i=0;i<path1.size() && i< path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;

    }
    public static Node lca2(Node root, int n1, int n2){
        if(root==null){
            return root;
        }
        if(root.data== n1 || root.data==n2){
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        if(leftlca ==null){
            return rightlca;
        }
        if(rightlca ==null){
            return leftlca;
        }
        return root;
    }

    public static int  getdist(Node root, int n){
        if(root== null){
            return -1;
        }
        if(root.data== n){
            return 0;
        }
      int l=  getdist(root.left, n);
      int r=  getdist(root.right, n);
        int v= Math.max(l,r);
        if(v>-1){
            return v+1;
        }
        return -1;
    }
    public static int mindist(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int d1= getdist(lca ,n1);
        int d2= getdist(lca, n2);
        return d1+d2;
    }

    

    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        
    }
   
    public static void main(String[] args) {
            //123456

            Node root= new Node(1);
            root.left= new Node(2);
            root.right= new Node(3);
            root.left.left= new Node(4);
            root .left.right= new Node(5);
            root.right.left= new Node(6);
      
    }
}
