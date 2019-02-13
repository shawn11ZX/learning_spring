package springcoretest;

import springcoretest.parent_ref.ChildService;
import springcoretest.dependency_resolve.ExampleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreTestApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/springcoretest/dependency_resolve/application.xml");
        ExampleBean e = context.getBean(ExampleBean.class);
        System.out.println("get parent property " + e.getI());

        ApplicationContext parent = new ClassPathXmlApplicationContext("/springcoretest/parent_ref/parent.xml");
        ApplicationContext child = new ClassPathXmlApplicationContext(new String[] {"/springcoretest/parent_ref/child.xml"}, parent);
        ChildService c = child.getBean(ChildService.class);

    }
}
