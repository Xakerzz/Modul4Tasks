public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik",6,"Orange",3000);
        Cat bigCat = new Cat("Kuzya",2,"White",5500);
        Cat smallCat = new Cat();



        barsik.meow();
        barsik.eat();
        barsik.eat();
        System.out.println(barsik.getAge() + " " + barsik.getWeight() + " " + barsik.getName() + " " + barsik.getColor());

    }
}
