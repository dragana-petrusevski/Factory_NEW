
package main.factory_new;

public class NewMain {

    
    public static void main(String[] args) {
        System.out.println("Pocetak");
        
        NewCar audi8 = new NewCar();
        audi8.printAttributes();
        
        audi8.setModel("Audi broj 8");
        audi8.setBuildYear(2003);
        audi8.setCcm(2000);
        
        audi8.printAttributes();
        
        
        NewCar fiatPunto = new NewCar();
        fiatPunto.setModel("Fiat");
        fiatPunto.setBuildYear(2019);
        
        fiatPunto.printAttributes();
        
        NewCar lada = new NewCar("Lada Niva", 1900, "green", 120, 50);
        lada.setMileage(50);
        lada.goToTravel(100);
        lada.printAttributes();
        
        NewCar opel = new NewCar("Opel", 2002, "blue", 200, 1300, 7, 150000);
        opel.printAttributes();
        
        //prvo putovanje
        opel.setMaxFuel(40);
        opel.setFuel(0);
        opel.setConsumption(10);
        opel.FuelUp(29);
        opel.FuelUp(21);
        opel.goToTravel(300);
        opel.printAttributes();
        
        //drugo putovanje
        
        opel.goToTravel(50);
        opel.printAttributes();
    }
    
}
