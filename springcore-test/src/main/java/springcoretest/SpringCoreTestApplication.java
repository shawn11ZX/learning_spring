package springcoretest;

import springcoretest.generic_collection.SomeClass;
import springcoretest.lookup.CommandManager;
import springcoretest.parent_ref.ChildService;
import springcoretest.dependency_resolve.ExampleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreTestApplication {
    public static void main(String[] args) {
        testAutowireNull();

    }

    private static void testAutowireNull() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/springcoretest/autowire_null/application.xml");
        springcoretest.autowire_null.SomeClass c = context.getBean(springcoretest.autowire_null.SomeClass.class);
        System.out.print(c.getB());
    }

    private static void testBeanPostProcessor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/springcoretest/beanpostprocessor/application.xml");

    }

    private static void testLifeCycle() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/springcoretest/lifecycle/application.xml");
        context.getBean(springcoretest.lifecycle.LifeCycleExample.class);
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();

    }

    private static void testLookup() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/springcoretest/lookup/application.xml");
        CommandManager c = context.getBean(CommandManager.class);
        System.out.println("id= " + c.process());
        System.out.println("id= " + c.process());
    }

    private static void testGenericCollection() {

        ApplicationContext context = new ClassPathXmlApplicationContext("/springcoretest/generic_collection/application.xml");
        SomeClass c = context.getBean(SomeClass.class);
        System.out.println("size = " + c.getSize());
    }

    private static void testParentRef() {
        ApplicationContext parent = new ClassPathXmlApplicationContext("/springcoretest/parent_ref/parent.xml");
        ApplicationContext child = new ClassPathXmlApplicationContext(new String[] {"/springcoretest/parent_ref/child.xml"}, parent);
        ChildService c = child.getBean(ChildService.class);
    }

    private static void testDependencyResolve() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/springcoretest/dependency_resolve/application.xml");
        ExampleBean e = context.getBean(ExampleBean.class);
        System.out.println("get parent property " + e.getI());
    }
}
