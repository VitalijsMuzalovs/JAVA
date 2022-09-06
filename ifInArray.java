// atstarpju noņemšana no virknes

public class ifInArray{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        int myNum = 5;
        boolean flag=false;
        
        for (int elements:array){
            if (elements==myNum){
                flag=true;
                break;
            }
        }

        if (flag){
            System.out.println(myNum+" in array!");
        }else{
            System.out.println(myNum+" NOT in array!");
        }
    }
}