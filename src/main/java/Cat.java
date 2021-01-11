public class Cat {

    String name;
    int age;

    static int count = 0;

    public static void main(String[] args) {
        Cat smudge = new Cat();
        smudge.age = 3;
        smudge.name = "Smudge";
        count++;

        Cat fluffy = new Cat();
        fluffy.age = 5;
        fluffy.name = "Fluffy";
        count++;

        System.out.println("We created a cat named " + smudge.name + ". His age is " + smudge.age);
        System.out.println("We created a cat named " + fluffy.name + ". His age is " + fluffy.age);

        System.out.println("Total number of cats = " + count);
    }
}