public class Immutablestring {
    public static void main(String[] args){

        String name = " Pramila";  //String in java is class
        name = name + " Khadka";

        System.out.println("Hey," + name);

        String s1 = "pramila";
        String s2 = "pramila";

        System.out.println(s1 == s2);
    }
}
