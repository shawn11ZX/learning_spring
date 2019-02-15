package springcoretest.autowire_null;

import org.springframework.beans.factory.annotation.Required;

import java.util.Map;

public class SomeClass {


    private SomeClassB b;

    public SomeClassB getB() {
        return b;
    }

    @Required
    public void setB(SomeClassB b) {
        this.b = b;
    }
}
