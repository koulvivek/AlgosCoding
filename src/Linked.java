import java.util.LinkedList;

public class Linked {

    public static void main(String [] args){

        //create a LinkedList
       LinkedList<String> students = new LinkedList<>();
        students.add("Charlie");
        students.add("Sally");
        students.add("Morgan");
        students.add("Taylor");
        students.add("Jamie");

        students.addFirst("Sarah");
        students.addLast("Hailey");
        students.add(2,"Tara");

        String firstStudent=students.getFirst();
        String lastStudent=students.getLast();

        System.out.println("first student"+firstStudent+ "Last student"+lastStudent);
        System.out.println(students.size());
        System.out.println(students);
        System.out.println(students.get(1));
        System.out.println(students.indexOf("Taylor"));
        students.removeFirst();
        students.removeLast();
        students.remove(3);
        System.out.println(students);
        boolean taylor= students.contains("Vivek");
        System.out.println(taylor);

        students.clear();
        System.out.println(students);
    }
}
