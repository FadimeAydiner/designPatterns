package structuralDP.decoratorDP;

public class IPhone11ProMax extends IPhone11Pro{
    public IPhone11ProMax(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"Max";
    }

    @Override
    public double getprice() {
        return super.getprice()+100;
    }
}
