package behav.strategy;

public class Client
{
    public static void main(String[] args)
    {
        Context c = new Context(new ConcreteAgoA());
        c.operation();
        c = new Context(new ConcreteAgoB());
        c.operation();
    }
}