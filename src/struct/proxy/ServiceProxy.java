package struct.proxy;

public class ServiceProxy implements Service
{
    private Service real;
    public ServiceProxy(Service s)
    {
        super();
        this.real = s;
    }
    @Override
    public void reg()
    {
        //do something
        System.out.println("in proxy");
        real.reg();
    }

}
