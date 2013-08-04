import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: farhan
 * Date: 2013-08-03
 * Time: 8:14 PM
 */
public class MainClass {
    public static void main(String argv[])
    {
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<Runnable>(5);
        TheThreadPoolExecutor theThreadPoolExecutor = new TheThreadPoolExecutor(3,3,10, TimeUnit.SECONDS,blockingQueue);
        theThreadPoolExecutor.allowCoreThreadTimeOut(true);
        theThreadPoolExecutor.execute(new TheTask("mytask1"));
        theThreadPoolExecutor.execute(new TheTask("mytask2"));
        theThreadPoolExecutor.execute(new TheTask("mytask3"));
        theThreadPoolExecutor.execute(new TheTask("mytask4"));
    }
}
