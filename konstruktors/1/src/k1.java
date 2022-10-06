
//3 ...NO_Arg parametrizētais...noklusējuma....
class k1 {
    private String name;

    k1(){
        System.out.println("konstruktors");
        name="pooooop";
    }

    public static void main(String[] args) {
        k1 obj=new k1();
        System.out.println("Some text: "+obj.name);
    }
}
