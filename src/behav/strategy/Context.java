package behav.strategy;

public class Context
{
    private Strategy s;
    public Context(Strategy s)
    {
        this.s = s;
    }
    public void operation()
    {
        s.AlgoSvr();
    }
}
