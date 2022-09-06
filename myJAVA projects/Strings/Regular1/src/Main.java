public class Main
{
    public static void main(String[] args) {
        String text = "Вася заработал 50.500 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String[] splitText = text.split(" ");
        float sum = 0.0f;
        for (String words:splitText)
        {
            if (words.matches("[0-9]+[\\.]?[0-9]*"))
            {
                System.out.println(words);
                sum+= Float.parseFloat(words);
            }
        }
        System.out.println("========");
        System.out.println("Sum: " + sum + " rub.");
    }
}
