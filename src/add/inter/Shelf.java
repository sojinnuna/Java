package add.inter;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
}
    public int getCount(){
        return shelf.size();
    }


}
