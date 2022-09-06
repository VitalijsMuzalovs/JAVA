// masīvi
import java.util.Arrays;

public class copy_masivs{
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6,7};
        int[] array2={7,6,5,4,3,2,1};

        int len1=array1.length;
        int len2=array2.length;

        int[] rez=new int[len1+len2];
        
        System.arraycopy(array1, 0, rez, 0, len1);
        System.arraycopy(array2, 0, rez, len1, len2);
        System.out.println(Arrays.toString(rez));

        // for (int elements:rez){
        //     System.out.println(elements);
        // }
    }
}