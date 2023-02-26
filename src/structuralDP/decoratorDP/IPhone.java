package structuralDP.decoratorDP;

public class IPhone implements Phone{
    @Override
    public String getName() {
        return "IPhone";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public double getprice() {
        return 599.9;
    }
}
