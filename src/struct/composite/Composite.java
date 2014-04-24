package struct.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite extends Component
{
    private List<Component> cLst;
    
    public Composite(String name)
    {
        super(name);
        cLst = new ArrayList<Component>();
    }
    
    @Override
    public void add(Component c)
    {
        cLst.add(c);
    }

    @Override
    public void remove(Component c)
    {
        cLst.remove(c);
    }

    @Override
    public void operation()
    {
        System.out.println("in composite "+getName());
        Iterator<Component> iter = cLst.iterator();
        while(iter.hasNext())
        {
            iter.next().operation();
        }
    }
}
