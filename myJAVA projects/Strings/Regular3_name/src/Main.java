import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//        Scanner reader = new Scanner(system.in);
        String name = "Виталий Александрaвич Музалёв";
        String[] splitedName = name.split(" ");
        for (String words : splitedName)
        {
            System.out.println(words.replaceAll("[^а-яА-Я]",""));
        }
    }
}
