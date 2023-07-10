
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ClassToken{
    private String student_name;
    private int id;
    private String classTaken;
    private String grade;

    ClassToken(String student_name, int id, String classTaken, String grade) {
        this.student_name = student_name;
        this.id = id;
        this.classesTaken = new HashMap<>();
        this.grade = grade;
    }

    String getStudent_name() {
        return student_name;
    }

    int getId() {
        return id;
    }

    String getClassTaken() {
        return classTaken;
    }

    String getGrade() {
        return grade;
    }

    void adding() {

    }

    void dropping() {

    }

    public double calculateGPA() {
        if (classesTaken.isEmpty()) {
            return 0.0;
        }

        double sumGrades = 0;
        int totalClasses = 0;

        for (int grade : classesTaken.values()) {
            sumGrades += grade;
            totalClasses++;
        }

        return sumGrades / totalClasses;
    }

    private static Map<Integer, ClassToken> studentsMap;

    public static void main(String[] args) {
        studentsMap = new HashMap<>();
        studentsMap.put(1, new ClassToken("John Doe", 05, "Software Engineering", "A"));
        studentsMap.put(2, new ClassToken("Jane Doe", 011, "Computer Science", "B"));
        studentsMap.put(3, new ClassToken("Peter Smith", 02, "Electrical Engineering", "C"));
        studentsMap.put(4, new ClassToken("Sarah Jones", 03, "Mechanical Engineering", "D"));
        studentsMap.put(5, new ClassToken("Michael Brown", 04, "Civil Engineering", "F"));

        // Print the hash map
        for (int key : studentsMap.keySet())
        System.out.println(studentsMap.get(key).getId()+","
        +" "+studentsMap.get(key).getClassTaken()+" - Grade: "+
        studentsMap.get(key).getGrade());

    }
}
