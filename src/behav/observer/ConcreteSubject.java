package behav.observer;

public class ConcreteSubject extends Subject
{
    private int subjectStatus;

    public int getSubjectStatus()
    {
        return subjectStatus;
    }

    public void setSubjectStatus(int subjectStatus)
    {
        this.subjectStatus = subjectStatus;
        super.notifx();
    }
}
