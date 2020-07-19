
package main.factory_new;

public class NewCar {
    private String model;
    private int buldYear;
    private String color;
    private int maxSpeed;
    private int ccm;
    private int consumption;
    private int mileage;
    
    public NewCar() {
        this.model = "";
        this.buldYear = -1;
        this.color = "undefined";
        this.maxSpeed = -1;
        this.ccm = -1;
        this.consumption = 0;
        this.mileage = 0;
    }
    
    public NewCar(String customModel, int customBuildYear, String customColor, int customMaxSpeed, int customCcm) {
        this.model = customModel;
        this.buldYear = customBuildYear;
        this.color = customColor;
        this.maxSpeed = customMaxSpeed;
        this.ccm = customCcm;
    }

    public NewCar(String model, int buldYear, String color, int maxSpeed, int ccm, int consumption, int mileage) {
        this.model = model;
        this.buldYear = buldYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.ccm = ccm;
        this.consumption = consumption;
        this.mileage = mileage;
    }
    
    
    public String getModel() {
        return this.model;
    }
    public void setModel(String customModel) {
        this.model = customModel;
    }
    
    public int getBuildYear() {
        return this.buldYear;
    }
    
    public void setBuildYear(int customBuildYear) {
        this.buldYear = customBuildYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    

    public void printAttributes() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Ccm: " + this.getCcm());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Kilometraza: " + this.getMileage());
        System.out.println("Maksimalna brzina: " + this.getMaxSpeed());
        System.out.println();
    }
    
    public void goToTravel(int distance) {
        this.setMileage(this.getMileage() + distance);
        
    }
}
