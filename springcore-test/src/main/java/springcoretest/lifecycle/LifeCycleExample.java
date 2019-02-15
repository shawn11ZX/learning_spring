package springcoretest.lifecycle;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;

import java.util.concurrent.atomic.AtomicBoolean;

public class LifeCycleExample implements SmartLifecycle {
    class MyRunnable implements Runnable {
        public final AtomicBoolean running = new AtomicBoolean(true);
        @Override
        public void run() {

            System.out.println("start thread");
            while(running.get())
            {
                try {
                    Thread.sleep(500);
                    System.out.println("thread sleep");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("stop thread");
        }
    }

    Thread _thread;
    MyRunnable _myRunnable;
    @Override
    public void start() {
        _myRunnable = new MyRunnable();
        _thread = new Thread(_myRunnable);
        _thread.setDaemon(true);
        _thread.start();
    }

    @Override
    public void stop() {
        if (isRunning()) {
            _myRunnable.running.set(false);

            try {
                _thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void destroy() {
        stop();
    }
    @Override
    public boolean isRunning() {
        return _thread != null && _thread.isAlive();
    }
}
