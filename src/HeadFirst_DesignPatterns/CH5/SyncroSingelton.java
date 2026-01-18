package HeadFirst_DesignPatterns.CH5;


public class SyncroSingelton {

    private static SyncroSingelton instance;

    private SyncroSingelton(){}

    // Here the issue of dual instance during the fast call issue is resolved which can happen due to multi thread.
    private static synchronized SyncroSingelton getInstance(){
        if (instance == null){
            instance = new SyncroSingelton();
        }
        return instance;
    }
}
