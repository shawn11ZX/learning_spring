package springcoretest.lookup;

import org.springframework.context.annotation.Bean;

import java.util.concurrent.atomic.AtomicInteger;

public class Command {

    public static AtomicInteger gid = new AtomicInteger();

    final public int id;
    public Command() {
        id = gid.incrementAndGet();
    }


    
    public int getId() {
        return id;
    }
}
