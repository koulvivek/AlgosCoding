public class Main {

    public static void main(String[] args){

        /*Rectangle r= new Rectangle("purple",5,2);
        Circle c= new Circle("blue",4);

        System.out.println("Rectangle Area"+r.getArea());
        System.out.println("Circle Area"+c.getArea());

        System.out.println(r.draw());
        System.out.println(c.draw());

        Employee employee=new Employee("Vivek",25,100);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getId());  */

        MathTeacher mathTeacher=new MathTeacher(30,"LAUSD",5);
        System.out.println(mathTeacher.numberOfStudents);
        System.out.println(mathTeacher.school);
        System.out.println(mathTeacher.favouriteNumber);
        System.out.println(mathTeacher.getRole());
    }
}
