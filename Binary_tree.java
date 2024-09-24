package Binary_Tree;
class Node
{
    int val;
    Node left;
    Node right;
    Node(int val)
    {
        this.val=val;
    }
}
public class treesofnode {
    public static void display(Node root)
    {
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    public static int sum(Node root)
    {
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int product(Node root)
    {
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static int max(Node root)
    {
        if(root==null) return 0;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    public static int size(Node root)
    {
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int level(Node root)
    {
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void main(String[] args)
    {
        Node a=new Node(5); //root
        Node b=new Node(1);
        Node c=new Node(10);
        Node d=new Node(2);
        Node e=new Node(15);
        a.left=b;a.right=c;
        b.right=d;c.left=e;
        display(a);
        System.out.print("\n"+sum(a));
        System.out.print("\n"+product(a));
        System.out.print("\n"+max(a));
        System.out.print("\n"+size(a));
        System.out.print("\n"+level(a));

    }
}
