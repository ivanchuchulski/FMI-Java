public class Main {
    public static void main(String[] args) {
        Student s2 = new Student();
        {
            Student s1 = new Student(62220, "s1");

            System.out.printf("s2 : %s\n", s2);

            s2 = new Student(s1);
            s2.setFacNumber(1000);
            s2.setName("s2");

            System.out.printf("s1 : %s\n", s1);
            System.out.printf("s2 : %s\n", s2);
        }

        System.out.printf("s2 : %s\n", s2);
    }

}
