import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class BinaryTree<T extends Comparable<T>> {
    class Node<T>
    {
        T data;
        Node right;
        Node left;
        Node(T data)
        {
            this.data = data;
            right = null;
            left = null;
        }
    }
    class IteratorForBTS
    {
        int iterator;
        ArrayList<Node> Nodes = new ArrayList<>();
        Queue<Node> helping = new LinkedList<>();
        IteratorForBTS()
        {
            iterator = 0;
        }
        void fullTheArr(Node root)
        {
            if(root == null ) return;
            helping.add(root);
            while(!helping.isEmpty())
            {
                Node node = helping.remove();
                Nodes.add(node);
                if(root.left!=null) helping.add(node.left);
                if(root.right!=null) helping.add(node.right);
            }
        }
        Node next(Node root)
        {
            fullTheArr(root);
            Node returned = Nodes.get(iterator);
            iterator++;
            System.out.print(returned.data + "  ");
            return  returned;
        }
    }
    IteratorForBTS iterator = null;
    Node root = null;
    BinaryTree()
    {
        iterator = new IteratorForBTS();
        iterator.fullTheArr(root);
    }
    void add(Node<T> root, T newData)
    {
        if(root == null)
        {
            root = new Node(newData);
            return;
        }
        if(newData.compareTo(root.data) > 0) add(root.right,newData);
        if(newData.compareTo(root.data) < 0) add(root.left, newData);
        if(newData.compareTo(root.data) == 0) return;
    }
    void add(T newData)
    {
        add(this.root,newData);
    }
    Node next()
    {
        return iterator.next(this.root);
    }

}
