import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static class  Node<T extends Comparable<T>> {

        public final T value;
        public Node<T> next;

        public Node(T value) {
            this(value, null);
        }

        public Node(T value, Node<T> next) {
            if (value == null) {
                throw new IllegalArgumentException("The value cannot be null.");
            }
            this.value = value;
            this.next = next;
        }
    }

    public static class MergeSort {

        public static Node sort(Node head) {
            if(head == null || head.next == null) return head;
            Node middleNode = getMiddle(head);
            Node nextToMiddle = middleNode.next;
            middleNode.next = null;
            Node left = MergeSort.sort(head);
            Node right = MergeSort.sort(nextToMiddle);
            Node sortedList = sortedMerge(left,right);
            return sortedList;
        }

        private static Node sortedMerge(Node left, Node right) {
            Node result = null;
            if(left == null){
                return right;
            }
            if(right == null)
                return left;
            if(left.value.compareTo(right.value) <= 0){
                result = left;
                result.next = sortedMerge(left.next,right);
            }
            else{
                result = right;
                result.next = sortedMerge(left,right.next);
            }
            return result;
        }

        public static Node getMiddle(Node head){
            if(head == null) return head;
            Node fast = head.next;
            Node slow = head;
            while(fast != null){
                fast = fast.next;
                if(fast!=null){
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            return slow;
        }

    }




    public static void main(String[] args){
        Node<Integer> head = new Node<Integer>(6);
        Node<Integer> node1 = new Node<Integer>(5,head);
        Node<Integer> node2 = new Node<Integer>(1,node1);
        Node<Integer> node3 = new Node<Integer>(2,node2);
        Node<Integer> node4 = new Node<Integer>(6,node3);
        Node<Integer> node5 = new Node<Integer>(4,node4);
        Node it = node5;
        System.out.println(node4.value.compareTo(head.value));
        while(it!=null){
            System.out.print(it.value + " ");
            it = it.next;
        }
        it = MergeSort.sort(node5);
        System.out.println();
        //it = node5;
        while(it!=null){
            System.out.print(it.value + " ");
            it = it.next;
        }
    }
}
