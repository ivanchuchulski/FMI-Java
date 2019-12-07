public class Student {
    private int facNumber;
    private String name;

    public Student() {
        setFacNumber(123);
        setName(null);
    }

    public Student(Student other) {
        setFacNumber(other.getFacNumber());
        setName(other.getName());
    }


    public Student(int facNumber, String name) {
        setFacNumber(facNumber);
        setName(name);
    }

    public void setFacNumber(int facNumber) {
        this.facNumber = facNumber;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "Default name";
        }
        else {
        this.name = name;
        }
    }

    public int getFacNumber() {
        return facNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("num : %s name : %s", this.facNumber, this.name);
    }
}
