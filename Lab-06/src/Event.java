public class Event
{
    private String numarEveniment;
    private int numarInvitati;
    private int pretEveniment;
    public static final int pretPerOaspeteMic()
    {
        int pretMic=32;
        return pretMic;
    }
    public static final int pretPerOaspeteMare()
    {
        int pretMare=35;
        return pretMare;
    }
    public static final int limitaEvenimentMare()
    {
        return 50;
    }
    public Event(String nrEveniment, int nrInvitati)
    {
        numarEveniment = nrEveniment;
        numarInvitati = nrInvitati;
    }
    public void setNumarEveniment(String x)
    {
        x = numarEveniment;
    }
    public String getNumarEveniment()
    {
        return numarEveniment;
    }
    public void setNumarInvitati(int y)
    {
        y = numarInvitati;
        if(y < 50)
            pretEveniment= y * pretPerOaspeteMic();
        else
            pretEveniment = y * pretPerOaspeteMare();
    }
    public int getNumarInvitati()
    {
        return numarInvitati;
    }
    public int getPretEveniment()
    {
        return pretEveniment;
    }
    public boolean isLargeEvent()
    {
        numarInvitati = getNumarInvitati();
        if(numarInvitati >= limitaEvenimentMare())
            return true;
        else
            return false;
    }

}
