package struct.decorator;

public class DecoratorA extends Decorator
{
    public DecoratorA(Component c)
    {
        super(c);
    }
    public void operation()
    {
        super.operation();
        System.out.println("in decorterA");
    }
}
