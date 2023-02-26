package structuralDP.decoratorDP;

public class IPhoneDecorator implements Phone{

    protected Phone basicPhone;//we use interface becuse like that all changes not affect the IPhone class

    public IPhoneDecorator(IPhone basicPhone) {
        this.basicPhone = basicPhone;
    }

    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount();
    }

    @Override
    public double getprice() {
        return basicPhone.getprice();
    }
}
