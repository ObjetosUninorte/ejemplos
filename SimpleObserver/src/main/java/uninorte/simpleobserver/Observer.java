package uninorte.simpleobserver;

abstract public class Observer {
    private int notifyCount;

    public Observer() {
        notifyCount = 0;
    }

    protected void increaseCount(){
        notifyCount += 1;
    }

    public int getNotifyCount() {
        return notifyCount;
    }

    abstract public void update();
}
