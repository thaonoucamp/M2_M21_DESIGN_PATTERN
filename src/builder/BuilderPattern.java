package builder;

public class BuilderPattern {

    interface IPersonBuilder{
        Person initName(String name);
        Person initId(int id);
        Person initAge(String birthday);
        Person initAdd(String add);
        Person builder();
    }

    public static void main(String[] args) {
        BuilderPattern builder = new BuilderPattern();
    }

}
