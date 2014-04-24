package struct.decorator;

public class Decorator implements Component
{
    private Component c;
    public Decorator(Component c)
    {
        this.c = c;
    }
    public void operation()
    {
        c.operation();
    }
}
