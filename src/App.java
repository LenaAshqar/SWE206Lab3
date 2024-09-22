public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello Nermin");
        System.out.println("Hello Leena");
    }

    
    public static void readStudents(String[] students) {
        for (int i = 0; i < students.length ; i++) {
            System.out.println(students[i]);
        }
    }

    public static String[] createRandomStudents() {
        int length = (int) (Math.random()*10);
        String[] students = new String[length];
        for (int i=0; i < length ; i++) {
            students[i] = "Student " + (int) (Math.random()*200);
        }
        return students;
    }
}
