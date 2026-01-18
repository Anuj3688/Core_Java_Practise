package HeadFirst_DesignPatterns.CH5;

public class SubSyncroSingelton {

    private static SubSyncroSingelton instance;

    private SubSyncroSingelton(){}

    // Double Checking lock.
    // Just to reduce the time of locking when the instance is already created
    private static synchronized SubSyncroSingelton getInstance(){
        if (instance == null){
            synchronized (SubSyncroSingelton.class){
                if (instance == null){
                    instance = new SubSyncroSingelton();
                }
            }
        }
        return instance;
    }
}
