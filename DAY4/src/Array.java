public class Array {
    int[] num = new int[5];   //instance variable
    public Array() {

        num[0] = 4;
        num[1] = 5;
        num[2] = 6;
        num[3] = 7;
    }
    public void DisplayArray()
    {
        for (int i = 0; i <= 3; i++) {
            System.out.println(num[i]);
        }
    }


}