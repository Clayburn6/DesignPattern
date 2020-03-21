package pers.pgb.design_pattern.behavior.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        subject.register(observer1);
        subject.register(observer2);

        subject.noticeObserver();
    }
}
