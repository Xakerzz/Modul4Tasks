public class Cat {
    private String name;
    private int age;
    private String color;
    private double weight;
    private static int catCount;

    public Cat(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        catCount++;
    }

    public Cat() {
        this("Murka",1,"Grey",3000);

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public void meow() {
        System.out.println("Meow meow");
    }

    private void pee() {
        setWeight(getWeight() - 20);
    }

    public void eat() {
        setWeight(getWeight() + 50);
        if (50/getWeight()>.01)
            pee();
    }
}
