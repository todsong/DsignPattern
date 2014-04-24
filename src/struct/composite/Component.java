package struct.composite;

public abstract class Component
{
    private String name;
    public Component(String name)
    {
        this.setName(name);
    }
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void operation();
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
