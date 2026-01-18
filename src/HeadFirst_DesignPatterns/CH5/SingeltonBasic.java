package HeadFirst_DesignPatterns.CH5;

public class SingeltonBasic {

    private static SingeltonBasic uniqueSingeltonInstance = null;

    private SingeltonBasic() {
        //NO ONE APART FROM THIS CLASS CAN HIT IT
    }

    // Just using a static method to return instace open for all methods
    public static SingeltonBasic getInstance(){
        if (uniqueSingeltonInstance == null){
            uniqueSingeltonInstance = new SingeltonBasic();
        }
        return uniqueSingeltonInstance;
    }

}
