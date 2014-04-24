package behav.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject
{
    private List<Observer> obList;
    public Subject()
    {
        obList = new ArrayList<Observer>();
    }
    
    public void attach(Observer ob)
    {
        obList.add(ob);
    }
    public void dettach(Observer ob)
    {
        obList.remove(ob);
    }
    public void notifx()
    {
        Iterator<Observer> it = obList.iterator();
        while(it.hasNext())
        {
            it.next().update();
        }
    }
}
