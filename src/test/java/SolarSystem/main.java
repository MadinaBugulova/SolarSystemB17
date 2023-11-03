package SolarSystem;

public class main {

    public static void main(String[] args) {
        solarSystemBasics solarsys= new solarSystemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";


        FeatureSun Sun=new FeatureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.temp="-1223124kelvin";



        Planet2 xaros=new Planet2();
        xaros.name="nehaio";
        xaros.color="blue";
        xaros.size="13456789567890km";
        
    }
}
