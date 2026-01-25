package HeadFirst_DesignPatterns.CH8;

public abstract class BreweryTemplate {

    //Here below method is a Template Pattern which consist of two methods which sub class needs to mandatorily implement
    public final void prepareBrewery(){
        boilWater();
        brew();
        putInACup();
        addOintments();
        hook();
    }

    public void hook() {
    }

    public abstract void addOintments();

    void putInACup() {
        System.out.println("Placing in a cup!");
    }

    public abstract void brew() ;

    void boilWater() {
        System.out.println("Boiling Water!!!");
    }
}
