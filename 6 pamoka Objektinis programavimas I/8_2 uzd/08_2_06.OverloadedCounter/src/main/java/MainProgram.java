
public class MainProgram {

    public static void main(String[] args) {
        Counter value1 = new Counter(10);
        Counter value2 = new Counter();

        value1.decrease();
        value1.decrease();
//        System.out.println(value1.toString());
        System.out.println(value1.value());

        value2.increase();
        value2.increase();
//        System.out.println(value2.toString());
        System.out.println(value2.value());

        value1.increase(10);
        System.out.println(value1.value());

        value2.decrease(10);
        System.out.println(value2.value());

    }
}
