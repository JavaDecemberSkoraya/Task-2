import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        boolean comporator = bean==bean2;
        System.out.println(comporator);

                Cat catBean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean1.getCatMssage());

        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean2.getCatMssage());


        boolean comporator2 = catBean1==catBean2;
        System.out.println(comporator2);
    }
}