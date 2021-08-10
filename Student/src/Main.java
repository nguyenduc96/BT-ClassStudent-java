public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Default : ");
        System.out.println("Name : " + student.getName());
        System.out.println("Class : " + student.getClasses() + "\n");
        System.out.println("Update : ");
        student.setName("John Wick");
        student.setClasses("C02");
        System.out.println("Name : " + student.getName());
        System.out.println("Class : " + student.getClasses() + "\n");
    }
}
