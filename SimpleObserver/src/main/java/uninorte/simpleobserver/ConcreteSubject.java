package uninorte.simpleobserver;

public class ConcreteSubject extends Subject{
    private int state;

    public ConcreteSubject() {
        state = 0;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }


}
