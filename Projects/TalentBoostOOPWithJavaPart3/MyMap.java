import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyMap<K, V> {
    private ArrayList<K> keys;
    private ArrayList<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void add(K key, V value)
    {
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        }
    }

    public void print()
    {
        Iterator<K> keys = this.keys.iterator();
        System.out.print("Keys: ");
        while(keys.hasNext())
        {
            System.out.print(keys.next() + "  ");
        }
        System.out.println();
        Iterator<V> values = this.values.iterator();
        System.out.print("Values: ");
        while(values.hasNext())
        {
            System.out.print(values.next() + "  ");
        }
    }

    public void getKeyValue(ArrayList<K> newKeys, ArrayList<V> newValues) {
        for (int i = 0; i < newKeys.size(); i++) {
            if (!keys.contains(newKeys.get(i))) {
                keys.add(newKeys.get(i));
                values.add(newValues.get(i));
            }
        }
    }

    public String returnValues(ArrayList<K> givenKeys) {
        ArrayList<V> valuesToBeReturned = new ArrayList<>();
        for(int i = 0;i<givenKeys.size();i++)
        {
            Iterator<K>  keyIterator = keys.iterator();
            Iterator<V> valuesIterator = values.iterator();
            while(keyIterator.hasNext())
            {
                K key = keyIterator.next();
                V value = valuesIterator.next();
                if(givenKeys.get(i).equals(key)){
                    valuesToBeReturned.add(value);
                }
            }
        }
        return valuesToBeReturned.toString();
    }

}
