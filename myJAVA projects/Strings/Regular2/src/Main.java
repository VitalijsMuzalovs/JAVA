public class Main
{
    public static void main(String[] args)
    {
        String text = "Russian natural gas supplies to Germany via the Baltic Sea pipeline Nord Stream 1 have been halted for 10 days for annual maintenance work.\n" +
                "\n" +
                "But German Economy Minister Robert Habeck warned that EU countries had to be prepared in case gas shipments did not resume.\n" +
                "\n" +
                "He has accused the Kremlin of using gas \"as a weapon\" in response to EU sanctions over the war in Ukraine.\n" +
                "\n" +
                "Mr Habeck admitted Germany had become too dependent on Russian gas.\n" +
                "\n" +
                "He described that as \"a grave political mistake as we can see today, which we are trying to remedy as quickly as we possibly can\".\n" +
                "\n" +
                "He said two floating terminals for deliveries of liquefied natural gas (LNG) would be ready by the end of the year.\n" +
                "\n" +
                "In mid-June Russia's state gas firm Gazprom cut gas flows through Nord Stream 1 to just 40% of the pipeline's capacity. It blamed a delay in the return of equipment being serviced by Germany's Siemens Energy.\n" +
                "\n" +
                "The Canadian government says it will now return a repaired Siemens turbine to Germany for the pipeline. That move angered the Ukrainian government, which accused Canada of adjusting the sanctions imposed on Moscow \"to the whims of Russia\".";
        String[] splitedTxt = text.replaceAll("\\n"," ").split("\\s+");
        for (String words : splitedTxt)
        {
            System.out.println(words.replaceAll("[.,()\"]",""));
        }
    }
}
