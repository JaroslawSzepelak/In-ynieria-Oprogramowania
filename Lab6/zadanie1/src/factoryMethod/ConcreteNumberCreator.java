package factoryMethod;

public class ConcreteNumberCreator extends NumberCreator {

    @Override
    public NumberProduct createNumber(String number) {
        try {
            if (number.contains(".")) {
                return new DoubleProduct(Double.parseDouble(number));
            } else {
                return new IntegerProduct(Integer.parseInt(number));
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format: " + number);
        }
    }
}
