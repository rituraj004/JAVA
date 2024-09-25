package Binary_Tree;
class node {
    int val;
    node left;
    node right;

    node(int val) {
        this.val = val;
    }
}
public class traverse_tree {
    public static void preorder(node root)
    {
        if(root==null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void postorder(node root)
    {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    public static void main(String[] args)
    {
        node a=new node(1); //root
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        node f=new node(6);
        node g=new node(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        System.out.println("Preorder: ");
        preorder(a);
        System.out.println("\ninorder: ");
        inorder(a);
        System.out.println("\npostorder: ");
        postorder(a);

    }
}
