package struct.decorator;

public class Decoratee implements Component
{

    @Override
    public void operation()
    {
        System.out.println("in decoratee");
    }

}
