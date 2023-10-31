package uninorte.simpleobserver;

public class ConcreateObserver extends Observer{

    private int state;
    private ConcreteSubject subject;


    public ConcreateObserver(ConcreteSubject subject) {
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
