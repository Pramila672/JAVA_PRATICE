class Students{
    String name;
    int marks;
}

public class Arrayofobject {
    public static void main(String[] args){
        Students s1 = new Students();
        s1.name = "Ram";
        s1.marks = 87;

        Students s2 = new Students();
        s2.name = "Sanisha";
        s2.marks = 78;

        Students s3 = new Students();
        s3.name = "Pramila";
        s3.marks = 89;

        Students[] students = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i <students.length; i++){
            System.out.println( students[i].name + " : " + students[i].marks) ;
        }

    }
}
