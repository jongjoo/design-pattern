package pattern.iterator.refact;


import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
