public class Student extends Person{
    private int credits;

    Student(String name, String address) {
        super(name, address);
    }

    public void study() {
        this.credits++;
    }

    @Override
    public String toString() {
        return getName() + "\n  " + getAddress() + "\n  " + "Study credits " + this.credits;
    }

}
