public class employee {
    String emp_name;
    int ep_id;      //declaring variables
   double salary;


    //initializing method
    employee(String n , int i, double s){
        this.emp_name = n;
        this.ep_id = i;
        this.salary = s;

    }
    void display(){
        System.out.println("Employee_id: " + this.ep_id);
        System.out.println("Employee Name: " + this.emp_name );
        System.out.println("Salary: " + this.salary);
    }

}
