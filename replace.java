// atstarpju noņemšana no virknes

public class replace{
    public static void main(String[] args) {
        String teikums="Kaste  ir   kas  te.";
        String org=teikums;
        teikums=teikums.replaceAll("\\s", "");
        System.out.println("Original:"+org);
        System.out.println("Current:"+teikums);
    }
}