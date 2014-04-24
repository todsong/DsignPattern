package struct.proxy;

public class Client
{
    public static void main(String[] args)
    {
        Registor r = new Registor();
        Service s = new ServiceProxy(r);
        s.reg();
    }

}
