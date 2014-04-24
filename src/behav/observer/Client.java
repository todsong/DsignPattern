package behav.observer;

public class Client
{
    public static void main(String[] args)
    {
        ConcreteSubject cs = new ConcreteSubject();
        OB1 ob = new OB1(cs);
        cs.attach(ob);
        cs.setSubjectStatus(100);
    }
}
