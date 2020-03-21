package pers.pgb.design_pattern.behavior.observer;

public class ConcreteSubject extends Subject {
    @Override
    public void noticeObserver() {
        for (Observer observer : observers) {
            observer.notice();
        }
    }
}
