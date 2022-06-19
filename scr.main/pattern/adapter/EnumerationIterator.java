package pattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class EnumerationIterator implements Iterable<Object>{

    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext(){
        return enumeration.hasMoreElements();
    }

    public Object next(){
        return enumeration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }


    @Override
    public Iterator<Object> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Object> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Object> spliterator() {
        return Iterable.super.spliterator();
    }
}
