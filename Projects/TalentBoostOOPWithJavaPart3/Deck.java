import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Deck {
    private Stack<Card> cards = new Stack<Card>();
    Deck()
    {
        for(int i=1;i<=4;i++)
        {
            for(int j= 1;j<=13;j++)
            {
                cards.add(new Card(i,j));
            }
        }
    }
    Card getCard()
    {
        return cards.pop();
    }
    void addCard(Card newCard)
    {
        cards.push(newCard);
    }
    Card findTheHighest()
    {
        ArrayList<Card> cards1 = new ArrayList<Card>(cards);
        int maxValue = 0;
        int maxIndex = -1;
        for(int i = 0;i<cards1.size();i++)
        {
            if(cards1.get(i).getValue()>maxValue)
            {
                maxValue = cards1.get(i).getValue();
                maxIndex = i;
            }
        }
        return cards1.get(maxIndex);
    }
    void printDeck()
    {
        ArrayList<Card> cards1 = new ArrayList<Card>(cards);
        for(Card card: cards1)
        {
            if(card.Rank == 13) System.out.print("Ace of ");
            else if(card.Rank == 12) System.out.print("King of ");
            else if(card.Rank == 11) System.out.print("Queen of ");
            else if(card.Rank == 10) System.out.print("Jack of ");
            else System.out.print(card.Rank+1 + " of ");
            if(card.Color==4) System.out.println("  Spades");
            else if (card.Color==3) System.out.println("  Hearts");
            else if (card.Color==2) System.out.println("  Diamonds");
            else System.out.println(" Clubs");
        }
    }
    void swap()
    {
        Stack<Card> newDeck = new Stack<>();
        while(!cards.isEmpty())
        {
            newDeck.push(cards.pop());
        }
        cards = newDeck;
    }
    void shuffle()
    {
        Stack<Card> newDeck1 = new Stack<>();
        Stack<Card> newDeck2 = new Stack<>();
        Stack<Card> newDeck3 = new Stack<>();
        Stack<Card> newDeck4 = new Stack<>();
        while(!cards.isEmpty())
        {
            if(!cards.isEmpty())newDeck1.push(cards.pop());
            if(!cards.isEmpty())newDeck2.push(cards.pop());
            if(!cards.isEmpty())newDeck3.push(cards.pop());
            if(!cards.isEmpty())newDeck4.push(cards.pop());
        }
        while(!newDeck1.isEmpty())
        {
            if(!newDeck1.isEmpty())cards.add(newDeck1.pop());
            if(!newDeck2.isEmpty())cards.add(newDeck2.pop());
            if(!newDeck3.isEmpty()) cards.add(newDeck3.pop());
            if(!newDeck4.isEmpty())cards.add(newDeck4.pop());
        }
    }
    void sortASC()
    {
        /*ArrayList<Card> list = new ArrayList<>(cards);
        for(int i = 0;i<list.size();i++)
        {
            boolean swapped = false;
            for (int j = 0; j < list.size()-i-1; j++)
            {
                if (list.get(j).getValue() > list.get(j+1).getValue())
                {
                    Collections.swap(list,j,j+1);
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        cards.removeAllElements();
        for(Card card: list)
        {
            cards.push(card);
        }*/
        ArrayList<Card> Spades = new ArrayList<Card>();
        ArrayList<Card> Hearts = new ArrayList<Card>();
        ArrayList<Card> Diamonds = new ArrayList<Card>();
        ArrayList<Card> Clubs = new ArrayList<Card>();
        while(!cards.isEmpty())
        {
            Card top = cards.pop();
            if(top.Color == 4) Spades.add(top);
            else if(top.Color == 3) Hearts.add(top);
            else if(top.Color == 2) Diamonds.add(top);
            else Clubs.add(top);
        }
        Collections.sort(Spades);
        Collections.sort(Hearts);
        Collections.sort(Diamonds);
        Collections.sort(Clubs);
        for(Card card: Spades) cards.push(card);
        for(Card card: Hearts) cards.push(card);
        for(Card card: Diamonds) cards.push(card);
        for(Card card: Clubs) cards.push(card);
    }
}
