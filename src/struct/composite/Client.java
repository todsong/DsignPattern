package struct.composite;

public class Client
{
    public static void main(String[] args)
    {
        Leaf f1 = new Leaf("A");
        Leaf f2 = new Leaf("B");
        Leaf f3 = new Leaf("C");
        Leaf f4 = new Leaf("D");
        Composite c0 = new Composite("0");
        Composite c1 = new Composite("1");
        c0.add(f1);
        c0.add(f2);
        c1.add(f3);
        c1.add(f4);
        c0.add(c1);
        c0.operation();
        c1.operation();
    }
}
