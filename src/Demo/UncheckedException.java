package Demo;

public class UncheckedException {
    public static void main(String args[]) {
        int[] arr = {1, 2, 4};
        try{
            for (int i = 0; i < 4; i++ ){
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
