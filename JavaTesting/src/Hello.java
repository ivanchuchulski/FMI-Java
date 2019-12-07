public class Hello {
    public static void main(String[] args) {
        int value = 0;

        for (int i = 0; i < 10; i++) {
            value = AddValue(value, i);

            System.out.println("value is " + value);
        }

        System.out.println("value is : " + value);

        Student ivan4o = new Student(621321, "Ivan4o");
        ivan4o.PrintStudent();

        Student iv2 = ivan4o;

        iv2.SetFacNum(132);

        ivan4o.PrintStudent();

        Student daniel4o = new Student(ivan4o);
        daniel4o.SetName("daniel4o");
        daniel4o.PrintStudent();

        Student viktor4o;

        viktor4o = new Student(daniel4o);
        viktor4o.SetName("viktor4o");
        viktor4o.PrintStudent();
    }

    public static int AddValue(int value, int addition) {
        return value + addition;
    }

}
