//noteikt, vai gads ir garais

public class tresais {
/*     public static void main(String[] args) {
        int gads=2022;
        if (gads % 4 == 0 && gads % 400 == 0){
            System.out.println(gads+".gads ir GARAIS!");
        }
        else{
            System.out.println(gads+".gads ir ĪSS!");
        }
    }
*/

    public static void main(String[] args) {
        int gads=1600;
        boolean garais=false;

        if (gads % 4 == 0){
            if(gads % 100 == 0){
                if(gads%400==0)
                    garais=true;
                else
                    garais=false;
            }
            else
                garais = true;
        }
        else
            garais=false;
        
            if(garais)
                System.out.println(gads+" ir garais gads");
            else
                System.out.println(gads+" nav garais gads");
    }
}
