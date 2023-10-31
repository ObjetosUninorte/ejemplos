package uninorte.simpleobserver;

public class ConcreteObserver extends Observer{

    private int state;
    private ConcreteSubject subject;


    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        state = subject.getState();
        increaseCount();
        System.out.println("Observer: " + state);
    }
    
}
