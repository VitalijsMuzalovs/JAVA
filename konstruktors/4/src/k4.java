// Override - pārslodze
class k4 {
    String valoda;

    k4(){
        this.valoda="Java";
    }

    k4(String valoda){
        this.valoda= valoda;
    }

    public void getName(){
        System.out.println("Programmēšanas valoda ir: " + this.valoda);
    }

    public static void main(String[] args) {
        k4 obj = new k4();
        k4 obj2 = new k4("Python");

        obj.getName();
        obj2.getName();
    }
}
