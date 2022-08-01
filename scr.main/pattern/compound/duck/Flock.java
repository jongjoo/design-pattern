package pattern.compound.duck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 반복자
 */
public class Flock implements Quackable {

    List<Quackable> quackables = new ArrayList<>();

    public void add(Quackable quackable) {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterable = quackables.iterator();
        while (iterable.hasNext()) {
            Quackable quackable = iterable.next();
            quackable.quack();
        }
    }
}
