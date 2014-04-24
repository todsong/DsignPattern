package behav.observer;

public class OB1 implements Observer
{
    private ConcreteSubject cs;
    private int ob1State;
    @Override
    public void update()
    {
        ob1State = cs.getSubjectStatus();
        System.out.println("state of ob1 is" + ob1State);
    }
    
    public OB1(ConcreteSubject cs)
    {
        this.cs = cs;
        ob1State = 0;
    }

}
