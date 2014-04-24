package struct.decorator;

public class DecoratorB extends Decorator
{
    public DecoratorB(Component c)
    {
        super(c);
    }
    public void operation()
    {
        super.operation();
        System.out.println("in decorterB");
    }
}