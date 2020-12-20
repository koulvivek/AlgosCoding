public class MathTeacher extends Teacher {

    int favouriteNumber;
    public MathTeacher(int numberOfStudents,String school,int favouriteNumber){
        super(numberOfStudents, school);
        this.favouriteNumber=favouriteNumber;
    }
}
