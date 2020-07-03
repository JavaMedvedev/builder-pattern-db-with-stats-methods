package DB;

public class Characteristics {

    Double height;
    Double weight;
    Diet diet;

    public Characteristics(double height, double weight, Diet diet) {
        this.height = height;
        this.weight = weight;
        this.diet = diet;
    }

    enum Diet {
        VEGETARIAN, NOT_SPECIFIED
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public Diet getDiet() {
        return diet;
    }

    @Override
    public String toString() {
        return "Characteristics{" +
                "height=" + height +
                ", weight=" + weight +
                ", diet=" + diet +
                '}';
    }

}
