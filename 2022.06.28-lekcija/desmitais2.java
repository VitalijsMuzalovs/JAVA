// noteikt vai skaitlis ir Armstronga skaitlis
// 153=1*1*1+5*5*5+3*3*3

public class desmitais2 {
    public static void main(String[] args) {
        int skaitlis=371,originals,atlikums,rez=0;
        originals=skaitlis;

        while(){
            atlikums=originals%10;
            rez+=Math.pow(atlikums,3);
            originals/=10;
        }

        if (rez==skaitlis){
            System.out.println(skaitlis+" ir Armstronga skaitlis!");
        }
        else{
            System.out.println(skaitlis+" nav Armstronga skaitlis!");
        }
    }
}
