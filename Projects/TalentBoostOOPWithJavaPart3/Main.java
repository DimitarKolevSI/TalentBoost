import java.util.ArrayList;

public class Main {
    public static void main(String... args)
    {
        /*Matrix matrix = new Matrix(10,10);
        for(int i=1;i<=matrix.getRows();i++)
        {
            for(int j =1;j<=matrix.getColumns();j++)
            {
                matrix.matrix[i-1][j-1] = i*j;
            }
        }
        for(int i = 0;i<matrix.getRows();i++)
        {
            for(int j = 0;j<matrix.getColumns();j++)
            {
                System.out.printf("%3d",matrix.getElement(i,j));
            }
            System.out.println();
        }
        System.out.println(matrix.isSquare());*/
        /*MyMap<Integer, Integer> m = new MyMap<>();
        m.add(5,10);
        m.add(0,0);
        m.add(1,20);
        m.add(2,15);
        m.add(3,12);
        m.print();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(m.returnValues(list));*/
        /*BinaryTree<Integer> b = new BinaryTree<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        for(int i = 0;i<4;i++)
        {
            b.next();
        }
        */
        Deck d = new Deck();
        d.printDeck();
        d.getCard();
        d.getCard();
        d.addCard(new Card(4,13));
        d.addCard(new Card(4,13));
        d.addCard(new Card(4,13));
        d.addCard(new Card(4,13));
        System.out.println("Second print:");
        d.printDeck();
        d.shuffle();
        System.out.println("Third print:");
        d.printDeck();
        d.sortASC();
        System.out.println("\nFourth print:\n");
        d.printDeck();
    }
}
