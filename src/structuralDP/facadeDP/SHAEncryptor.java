package structuralDP.facadeDP;

public class SHAEncryptor {
    public void encrypt(String text,String security,boolean type){
        if(type)
          System.out.println("<SHA>"+text+security+type+ "<SHA>");
        else
           System.out.println("<SHA>"+type+security+text+ "<SHA>");
    }
}
