import javax.management.StringValueExp;

public class Main
{
    public static void main(String[] args)
    {
        String[] phones = {"+7 909 123-45-67",
                "+7 (909) 1234567",
                "8-905-1234567",
                "9-453-1234567",
                "8-905-123",
                "905-1234567",
                "8-905-12345672342"};
        for (String phone : phones)
        {
            String myPhone = phone.replaceAll("[^0-9]","");
            int firstChar =  Integer.parseInt(String.valueOf( myPhone.charAt(0)));
            if (myPhone.length() == 11) {
                if (firstChar == 7) System.out.println(phone + ":\t" + myPhone + "\t" + myPhone.length() + " chars \tOK");
                if (firstChar == 8) System.out.println(phone + ":\t" + myPhone.replaceFirst("8", "7") + "\t" + myPhone.length() + " chars \tOK");
                if (firstChar == 9 & firstChar != 7 & firstChar != 8)System.out.println(phone+":\t"+myPhone+ " chars \tWRONG NUMBER");
            }
            else if (myPhone.length() == 10 )
            {
                myPhone = "7"+myPhone;
                System.out.println(phone+":\t"+myPhone+"\t"+myPhone.length()+"\tOK");
            }
            else
            {
                System.out.println(phone+":\t"+myPhone+"\t("+myPhone.length()+" chars) \tWRONG NUMBER");
            }

        }
    }
}
