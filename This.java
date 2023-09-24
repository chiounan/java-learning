public class This {

    private String name;
    private int age;

    public void Teacher (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]) {
        Teacher teacher = new Teacher("王sir", 45);
        System.out.println("Name: " + teacher.name + " Age: " + teacher.age);        
    }
}
