package springcoretest.generic_collection;

import java.util.Map;

public class SomeClass {

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
