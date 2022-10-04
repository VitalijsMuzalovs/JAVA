class CPU
{
    double price;

    class Processor
    {
        double cores;
        String manufacturer;

        double  getCache()
        {
            return 4.3;
        }
    }

    protected class RAM
    {
        double memory;
        String manufacturer;

        double getClockSpeed()
        {
            return 5.5;
        }
    }

}

public class poga
{
    public static void main(String[] args)
    {
        CPU cpu = new CPU();
        CPU.Processor myProc = cpu.new Processor();
        CPU.RAM myRam = cpu.new RAM();

        System.out.println("Processor cache: " + myProc.getCache());
        System.out.println("RAM: " + myRam.getClockSpeed());
    }
}