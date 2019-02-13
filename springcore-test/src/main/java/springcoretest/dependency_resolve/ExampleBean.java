package springcoretest.dependency_resolve;

public class ExampleBean {

    private AnotherBean beanOne;
    private int i;

    public ExampleBean(AnotherBean beanOne) {
        this.beanOne = beanOne;
        System.out.println("call parent  constructor");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
        System.out.println("set parent property ");
    }
}
