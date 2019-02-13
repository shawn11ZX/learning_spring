package springcoretest.dependency_resolve;

public class AnotherBean {
    private int id;

    public int getId() {
        return id;
    }

    public AnotherBean() {
        System.out.println("call child constructor");
    }

    public void setId(int id) {
        System.out.println("set child  property id");
        this.id = id;
    }
}
