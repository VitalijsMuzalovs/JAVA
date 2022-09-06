public class Main
{
    public static void main(String[] args)
    {
        int cargoCarCapacity = 12;
        int containerCapacity = 27;
        int totalBoxes = 619;

        int i=1;
        int m = 1;
        int k = 1;


        for (i = 1; i <= totalBoxes; i++)
        {
            if (i % (containerCapacity * cargoCarCapacity) == 1 || i == 1)
            {
                System.out.println(m + ".TRUCK");
                System.out.println("\t" + k + ".container");
                System.out.println("\t\t" + i + ".box");
                k++;
                m++;
            }else
                {
                    if(i % containerCapacity == 1 || i == 1)
                    {
                        System.out.println("\t" + k + ".container");
                        System.out.println("\t\t" + i + ".box");
                        k++;
                    }else
                    {
                        System.out.println("\t\t" + i + ".box");
                    }
                }

        }
    }
}
