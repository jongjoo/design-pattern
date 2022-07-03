package pattern.iterator.refact;


import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class PancakeHouseIterator implements Iterator<MenuItem> {

    List<MenuItem> items;
    int position = 0;



    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("기능 없음");
    }


    @Override
    public void forEachRemaining(Consumer<? super MenuItem> action) {
        Iterator.super.forEachRemaining(action);
    }
}
