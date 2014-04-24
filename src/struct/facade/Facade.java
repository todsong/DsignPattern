package struct.facade;

public class Facade
{
    private A a;
    private B b;
    private C c;
    public Facade()
    {
        a = new A();
        b = new B();
        c = new C();
    }
    public void serviceOne()
    {
        System.out.println("service one----");
        a.print();
        b.print();
    }
    
    public void serviceTwo()
    {
        System.out.println("service two----");
        a.print();
        b.print();
    }
}
