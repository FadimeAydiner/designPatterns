package creationalDP.protoTypeDP;

public class ProtoTypeDemo {
    public static void main(String[] args) {
        Soldier availableSoldier=new Soldier(100,45,20,30,10,30,"Sward",true);

        //****************bad scenerio*****************
        //i need to set all fields except for the last field to be able to create soldier who is not available for fight
        Soldier unavailableSoldier1=new Soldier(100,45,20,30,10,30,"Sward",false);


        //****************use clone**********

        Soldier unavailableSoldier2=availableSoldier.clone();
        unavailableSoldier2.setAvaliableForWar(false);

        unavailableSoldier1.showSoldierInfo();
        unavailableSoldier2.showSoldierInfo();
    }
}
