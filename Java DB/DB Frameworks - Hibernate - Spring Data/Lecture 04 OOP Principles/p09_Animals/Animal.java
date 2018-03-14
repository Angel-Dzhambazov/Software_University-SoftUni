package hw04_OOPPrinciples.p09_Animals;

class Animal {
    private static final String INVALID_INPUT = "Invalid input!";

    private String name;
    private int age;
    private String gender;

    Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    protected String produceSound() {
        return ("Not implemented!");
    }

    private void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(INVALID_INPUT);
        } else {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(INVALID_INPUT);
        } else {
            this.age = age;
        }
    }

    private void setGender(String gender) {
        if (gender == null || gender.isEmpty()) {
            throw new IllegalArgumentException(INVALID_INPUT);
        } else {
            this.gender = gender;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %d %s", this.name, this.age, this.gender)).append(System.lineSeparator());
        sb.append(produceSound());
        return sb.toString().trim();
    }

    protected String getName() {
        return this.name;
    }

    protected int getAge() {
        return this.age;
    }
}
