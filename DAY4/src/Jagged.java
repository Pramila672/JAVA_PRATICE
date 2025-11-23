public class Jagged {
    public static void main(String[] args){
        int [] []num = new int[4][]; //Jagged array--> the array where its internal elements are different/ have different array sizes within an array

        num[0] = new int[2];
        num[1] = new int[5];
        num[2] = new int[4];
        num[3] = new int[1];

        for(int i =0; i<num.length; i++){
            for(int j = 0; j<num[i].length; j++){
                num[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                System.out.print(num[i] [j]);
            }
            System.out.println();
        }
    }
}
