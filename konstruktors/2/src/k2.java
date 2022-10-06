//3 ...NO_Arg parametrizētais...noklusējuma....
class k2 {
    int i;

    private k2(){
        i=5;
        System.out.println("konstruktors");
    }

    public static void main(String[] args) {
        k2 obj=new k2();
        System.out.println("Some text: "+ obj.i);
    }
}