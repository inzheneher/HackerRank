import java.util.Comparator;

public class Checker implements Comparator<Player>{
    //to change sort ordering - change > to < and vice versa
    @Override
    public int compare(Player a, Player b) {
        if ((a.score - b.score) == 0) {
            return a.name.compareTo(b.name);
        } else if ((a.score - b.score) > 0) {
            return -1;
        } else return 1;
    }
}
