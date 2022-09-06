public class Main
{
    public static void main(String[] args)
    {
        String text = "Какой-то текст с блоком <который нужно заменить>!";
        String replacedTxt = searchAndReplaceDiamonds(text,"XXX");
        System.out.println(replacedTxt);
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder)
    {
        String newText = text.replaceAll("<.+?>",placeholder);
        return newText;
    }
}
