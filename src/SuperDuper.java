public class SuperDuper {

    public static void main(String[] args) {

        Cat myCat = new Cat(3, "George", "Purina One");
        myCat.makeNoise();
        myCat.eat();
        System.out.println(myCat.age + " " + myCat.name + " " + myCat.catFoodPreference);
    }
}
