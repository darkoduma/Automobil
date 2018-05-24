
public class Car {

    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    String licences = "ABC - 123";
    char condition = 'A';
    double currentPrice = 3000;
    int mileagePassed = 50000;

    String model;
    int maxFuel;
    int cuurentFuel;
    int consumption;

    public Car() {
        this.model = "default";
        this.cuurentFuel = 0;
        this.maxFuel = 100;
    }

    public Car(int maxSpeed, int minSpeed, double weight, boolean isTheCarOn, String licences, char condition, double currentPrice, int mileagePassed) {

        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.weight = weight;
        this.isTheCarOn = isTheCarOn;
        this.licences = licences;
        this.condition = condition;
        this.currentPrice = currentPrice;
        this.mileagePassed = mileagePassed;
    }

    public void printMainAttributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Trenutno gorivo: " + this.cuurentFuel);
        System.out.println("Predjena kilometraza: " + this.mileagePassed);
        System.out.println();

    }

    public void printAttributes() {
        System.out.println("Maksimalna brzina je: " + this.maxSpeed);
        System.out.println("Maksimalna brzina je: " + this.minSpeed);
        System.out.println("Registracioni broj je: " + this.licences);
        System.out.println("Tezina: " + this.weight);
        System.out.println("Predjena kilometraza: ");
        System.out.println("Trenutne cena: " + this.currentPrice);

    }

    public void changeModel(String customModel) {
        this.model = customModel;
    }

    public void changeMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;

    }

    public void fuelUp() {
        this.cuurentFuel = this.maxFuel;
    }

    public void changeConsumption(int customConsumption) {
        this.consumption = customConsumption;

    }

    public void travel(int distance) {

        if (this.cuurentFuel > distance * this.consumption) {
            this.mileagePassed = this.mileagePassed + distance;
            this.cuurentFuel = this.cuurentFuel - distance * this.consumption;

        } else {
            System.out.println("Nema dovoljno goriva");
        }

    }

}
