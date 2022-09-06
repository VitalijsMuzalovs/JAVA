public class piektais {
    public static void main(String[] args ){
        int viens=25, divi=4;
        float dala=viens/divi;

        int atl=viens%divi;

        System.out.println(atl) ;

        viens+=3;
        System.out.println(viens) ;

        viens-=3;
        System.out.println(viens) ;

        viens++;
        System.out.println(viens) ;

        viens--;
        System.out.println(viens) ;

        viens^=5;
        System.out.println("A"+viens) ;

        int x=2;
        x>>=1;
        System.out.println(x) ;
    }
}
