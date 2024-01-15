public class SugarDecorator extends DecoratorBeverage {

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "sugar ";
    }
}
