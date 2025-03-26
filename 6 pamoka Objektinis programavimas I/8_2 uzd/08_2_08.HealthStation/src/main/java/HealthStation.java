
public class HealthStation {
    private int countWeighings;

    public int weigh(Person person) {
        countWeighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
//        int personWeight = (person.getWeight());
//        personWeight += 1;
//        person.setWeight(personWeight);
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return countWeighings;
    }

}
