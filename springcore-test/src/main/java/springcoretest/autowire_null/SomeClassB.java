package springcoretest.autowire_null;

import java.util.Map;

public class SomeClassB {

    private Map<String, Float> accounts;

    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setAccounts(Map<String, Float> accounts) {
        this.accounts = accounts;
    }
}
