package creationalDP.singletonDP;

public class SingletonObject {
    String message="Hello";

    private static SingletonObject instance=new SingletonObject();

    private SingletonObject() {
    }

    public static SingletonObject getInstance(){
        return instance;
    }

    public void changeMessage(){
        this.message=this.message+" Batch 110-111";
    }
}
