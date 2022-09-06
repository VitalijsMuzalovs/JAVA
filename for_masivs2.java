// atstarpju noņemšana no virknes

public class for_masivs2{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        double sum=0.0;
        
        for (int elements:array){
            sum+=elements;
            System.out.println(elements);
        }

        double avg = sum/array.length;
        System.out.format("Vidēja vertība: %.4f",avg);
    }
}