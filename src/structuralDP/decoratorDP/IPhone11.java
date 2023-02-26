package structuralDP.decoratorDP;

public class IPhone11 extends IPhoneDecorator{
    public IPhone11(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"11";
    }

    //if iphone11 is 2 cameras we dont need to get and change cameraCount


}
