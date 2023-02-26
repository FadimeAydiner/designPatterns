package structuralDP.facadeDP;

public class CustomEncryptor {
    public static void main(String[] args) {
        String text="content";

        //*****bad scenario****
        AESEncryptor aesEncryptor=new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor=new MD5Encryptor();
        md5Encryptor.encrypt(text,"SecurityKey");

        SHAEncryptor shaEncryptor=new SHAEncryptor();
        shaEncryptor.encrypt(text,"SecurityKey",true);


        //******good scenario*****
        FacadeEncryptor facadeEncryptor=new FacadeEncryptor();
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.SHA);
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.AES);

    }
}
