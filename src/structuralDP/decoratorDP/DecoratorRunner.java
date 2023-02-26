package structuralDP.decoratorDP;

public class DecoratorRunner {
    public static void main(String[] args) {
        Phone iPhoneProMax=new IPhone11ProMax(new IPhone());
        System.out.println(iPhoneProMax.getName());
        System.out.println(iPhoneProMax.getprice());
        System.out.println(iPhoneProMax.cameraCount());


        //task
    }
}
