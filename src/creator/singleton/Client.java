package creator.singleton;

public class Client
{
    public static void main(String[] args)
    {
        EagerSingleton e = EagerSingleton.getInstance();
        LazySingleton l = LazySingleton.getInstance();
    }
}
