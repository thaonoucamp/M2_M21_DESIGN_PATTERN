package builder;

public class Person {
    private String name;
    private int id;
    private int age;
    private String add;

    public Person() {
    }

    private Person(BuilderPattern builderPattern) {
        this.name = builderPattern.name;
        this.id = builderPattern.id;
        this.age = builderPattern.age;
        this.add = builderPattern.add;
    }

    private Person(String name, int id, int age, String add) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    private void setAdd(String add) {
        this.add = add;
    }

    public static class BuilderPattern {
        private String name;
        private int id;
        private int age;
        private String add;

        public BuilderPattern(String name, int id) {
            this.name = name;
            this.id = id;
        }


        public BuilderPattern builderAge(int age) {
            this.age = age;
            return this;
        }

        public BuilderPattern builderAdd(String add) {
            this.add = add;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

        @Override
        public String toString() {
            return "BuilderPattern{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", age=" + age +
                    ", add='" + add + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", add='" + add + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person
                .BuilderPattern("Thao", 1)
                .builderAge(31)
                .builderAdd("Ha Tay")
                .build();

        System.out.println(person);

    }
}
