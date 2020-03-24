import java.util.Collection;

public class Card implements Comparable {
    int Color;
    int Rank;
    Card(String Color, String Rank)
    {
        switch(Color){
            case "Spades":
                this.Color = 4;
                break;
            case "Hearts":
                this.Color = 3;
                break;
            case "Diamonds":
                this.Color = 2;
                break;
            case "Clubs":
                this.Color = 1;
                break;
            default:this.Color = 0;
        }
        switch(Rank) {
            case "Ace":
                this.Rank = 13;
                break;
            case "King":
                this.Rank = 12;
                break;
            case "Queen":
                this.Rank = 11;
                break;
            case "Jack":
                this.Rank = 10;
                break;
            default:
                this.Rank = Integer.parseInt(Rank) - 1;
        }
    }
    Card(int Color, int Rank) {
        this.Color = Color;
        this.Rank = Rank;
    }
    int getValue()
    {
        return this.Color * this.Rank;
    }

    @Override
    public int compareTo(Object o) {
        int compareage=((Card)o).Rank;
        return this.Rank-compareage;
    }
}
