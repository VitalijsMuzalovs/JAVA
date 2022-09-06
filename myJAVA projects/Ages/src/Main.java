public class Main
{
    public static void main(String[] args)
    {
        int Vasya = 25;
        int Katya = 32;
        int Misha = 24;

        int min=-1;
        int middle = -1;
        int max = -1;

        if (Vasya > Katya && Vasya > Misha)
            max = Vasya;
        else if (Katya > Vasya && Katya > Misha)
            max = Katya;
        else
            max = Misha;

        if (Vasya < Katya && Vasya < Misha)
            min = Vasya;
        else if (Katya < Vasya && Katya < Misha)
            min = Katya;
        else
            min = Misha;

        if (Vasya < Katya && Vasya > Misha)
            middle = Vasya;
        else if (Katya < Vasya && Katya > Misha)
            middle = Katya;
        else
            middle = Misha;

        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        System.out.println("Middle:" + middle);
    }
}
