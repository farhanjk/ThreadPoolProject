import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: farhan
 * Date: 2013-08-03
 * Time: 9:57 PM
 **/
public class TheThreadPoolExecutor extends ThreadPoolExecutor {

    @Override
    protected void afterExecute(Runnable runnable, Throwable throwable) {
        super.afterExecute(runnable, throwable);
        System.out.println("After execute " + ((TheTask)runnable).getName());
    }

    @Override
    protected void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        System.out.println("Before execute " + ((TheTask)runnable).getName());
    }

    TheThreadPoolExecutor(int i, int i2, long l, TimeUnit timeUnit, BlockingQueue<Runnable> runnables) {
        super(i, i2, l, timeUnit, runnables);
    }
}
