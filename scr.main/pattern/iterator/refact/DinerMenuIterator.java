package pattern.iterator.refact;


import java.util.Iterator;
import java.util.function.Consumer;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
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
