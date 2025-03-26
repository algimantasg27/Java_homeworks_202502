import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        this.items = new ArrayList<>();
        items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item a : this.items) {
            if (a.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }
}
