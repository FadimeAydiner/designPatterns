package creationalDP.singletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {
       // SingletonObject obj1=new SingletonObject();//we cannot use new keyword because our constructor is private

        SingletonObject obj1=SingletonObject.getInstance();
        System.out.println(obj1.message);//Hello
        obj1.changeMessage();
        System.out.println(obj1.message);
        SingletonObject obj2=SingletonObject.getInstance();
        System.out.println("Message for obj2");
        System.out.println(obj2.message);



          }
}
