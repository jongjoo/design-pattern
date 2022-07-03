package pattern.iterator.refact;


public interface Iterator<M> {
    boolean hasNext();

    MenuItem next();
}
