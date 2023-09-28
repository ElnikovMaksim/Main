public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Mastif", "big", 4, 16.5f );

        Dog dog2 = new Dog("lapdog", "small", 3, 2.5f );
        dog1.getInfo();

        int calories;
        String result;
        calories = dog1.eat(40,50,30);
        result = dog1.checkCalories(calories);

        System.out.println(result);

        calories = dog2.eat(6,6,8);
        result = dog2.checkCalories(calories);

        System.out.println(result);

    }
}