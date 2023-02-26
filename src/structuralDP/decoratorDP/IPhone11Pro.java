package structuralDP.decoratorDP;

public class IPhone11Pro extends IPhoneDecorator{
    public IPhone11Pro(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"11Pro";

    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+1;
    }

    @Override
    public double getprice() {
        return super.getprice()+100;
    }
}
