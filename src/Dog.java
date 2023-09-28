class Dog {
    private String breed;
    private String size;
    private int age;
    private float weight;

    Dog(String breed, String size, int age, float weight) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.weight = weight;
    }

    void getInfo() {
        System.out.println("breed:" + breed + ", size:" + size + ", age:" + age);
    }

    int eat(int carbohydrates, int proteins, int fats) {
        carbohydrates *= 4;
        proteins *= 4;
        fats *= 9;
        int sum = carbohydrates + proteins + fats;
        return sum;

    }

    String checkCalories(int calories) {
        float norm = (535 / 10) * weight;
        if (norm - 30 > calories) {
            System.out.println("bad");
        } else if (norm + 30 < calories) {
            System.out.println("overate");
        } else {
            System.out.println("good");
        }
        return String.valueOf(calories);
    }
}


