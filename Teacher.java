public class Teacher {
    String name;
    int age;
    public Teacher (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String args[]) {
        Teacher teacher = new Teacher("Sir", 42);
        System.out.println("Name: " + teacher.name + ", Age: " + teacher.age);
    }
}
