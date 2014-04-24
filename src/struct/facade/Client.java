package struct.facade;

public class Client
{
    public static void main(String[] args)
    {
        Facade f = new Facade();
        f.serviceOne();
        f.serviceTwo();
    }
}
