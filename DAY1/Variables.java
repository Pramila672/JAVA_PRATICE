public class Variables{
    public static void main(String[] args){
        int num = 10;
        String text = "Pramila";
        boolean myBool = true;
        float numbers = 5.45f; 
        char letter = 'B';
        //Final
        final int constantnum = 20; 
        //constantnum = 40;  // This will cause a compilation error beacuse the final variables
        //has already been set to 40 and rechanging it is not allowed
        System.out.println(num);
        System.out.println(text);
        System.out.println(constantnum);
        System.out.println(myBool);
        System.out.println(numbers);
        System.out.println(letter);
        }
}
