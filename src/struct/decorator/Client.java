package struct.decorator;

public class Client
{
    public static void main(String[] args)
    {
        Decoratee ee = new Decoratee();
        DecoratorA a = new DecoratorA(ee);
        a.operation();
        
        DecoratorB b = new DecoratorB(ee);
        b.operation();
    }
}
