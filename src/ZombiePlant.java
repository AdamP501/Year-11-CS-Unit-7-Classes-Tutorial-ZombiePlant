public class ZombiePlant {
    private int potency;
    private int treatments;

    public ZombiePlant(int potency, int treatments)
    {
        this.potency = potency;
        this.treatments = treatments;
    }
    public int getPotency()
    {
        return potency;
    }

    public int treatmentsNeeded()
    {
        return treatments;
    }

    public void treat(int treatment){

        if (treatments == 0 && treatment > potency)
        {
            treatments += 1;
        }
        else if (treatments > 0 && treatment <= potency && treatment > 0)
        {
            treatments--;
        }
        else if (treatments > 0  && treatment > 0 && treatment > potency)
        {
            treatments++;
        }
    }

    public boolean isDangerous()
    {
        if (treatments > 0)
        {
            return true;
        }
        return false;
    }




}
