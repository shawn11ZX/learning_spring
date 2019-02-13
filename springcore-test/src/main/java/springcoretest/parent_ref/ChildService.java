package springcoretest.parent_ref;

public class ChildService {
    private SimpleAccountService target;

    public void setTarget(SimpleAccountService target) {
        this.target = target;
    }

    public SimpleAccountService getTarget() {
        return target;
    }
}
