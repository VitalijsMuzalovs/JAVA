// aprekinat vidējo vertību,izmantojot masīvu
public class masivs{
    public static void main(String[] args) {
        double[] aka={45.3,36.6,12.3,25.5};
        double sum=0.0;  

        for (double num:aka){
            sum+=num;
        }
        double vid=sum/aka.length;
        System.out.format("Vidēja vertība: %.3f",vid);
    }
}