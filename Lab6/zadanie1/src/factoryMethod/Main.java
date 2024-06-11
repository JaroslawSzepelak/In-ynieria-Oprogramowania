package factoryMethod;

public class Main {
    public static void main(String[] args) {
        NumberCreator creator = new ConcreteNumberCreator();

        NumberProduct number1 = creator.createNumber("123");
        System.out.println("Created number: " + number1.getValue() + " of type " + number1.getValue().getClass().getSimpleName());

        NumberProduct number2 = creator.createNumber("123.45");
        System.out.println("Created number: " + number2.getValue() + " of type " + number2.getValue().getClass().getSimpleName());
    }
}
