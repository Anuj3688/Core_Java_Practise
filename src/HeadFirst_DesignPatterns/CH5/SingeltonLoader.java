package HeadFirst_DesignPatterns.CH5;

public class SingeltonLoader {

    // Defining it when the App goes up
    // No headache for instace setup
    // Only issue the class is getting an instance before even it is getting used
    private static SingeltonLoader instance = new SingeltonLoader();

    private SingeltonLoader() {}
    public static SingeltonLoader getInstance() {
        return instance;
    }
}
