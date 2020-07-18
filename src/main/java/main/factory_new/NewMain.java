
package main.factory_new;

public class NewMain {

    
    public static void main(String[] args) {
        System.out.println("Pocetak");
        
        NewCar auto1 = new NewCar();
        auto1.model = "Audi";
        auto1.buldYear = 2003;
        auto1.ccm = 2000;
        
        System.out.println("Model automobila 1 je " + auto1.model);
        
        
        
        NewCar auto2 = new NewCar();
        auto2.model = "Fiat";
        auto2.buldYear = 2019;
        
        System.out.println("Model automobila 2 je " + auto2.model);
        
        
        
    }
    
}
