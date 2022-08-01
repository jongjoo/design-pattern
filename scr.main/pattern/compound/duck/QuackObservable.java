package pattern.compound.duck;


public interface QuackObservable {

    void quack();
    void registerObserver(Observer observer);

    void notifyObservers();
}
