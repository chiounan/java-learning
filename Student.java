// Example of array of objects

public class Student {
    public int roll_id;
    public String name;
    Student(int roll_id, String name) {
        this.roll_id = roll_id;
        this.name = name;
    }

    public static void main(String args[]) {
        Student stdarray[] = new Student[5];

        stdarray[0] = new Student(1, "aman");
        stdarray[1] = new Student(2, "bill");
        stdarray[2] = new Student(3, "ccli");
        stdarray[3] = new Student(4, "duke");
        stdarray[4] = new Student(5, "elln");

        for (int i = 0; i < stdarray.length; i++) {
            System.out.println("Element at " + i + " : " + stdarray[i].roll_id + " " + stdarray[i].name);
        }
    }
}