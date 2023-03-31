import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getName());
        Cat cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getName());


        System.out.println("Сравниваю хэллоу: " + (bean == beanHelloWorld) +
                "\nСравниваю котов: " + (cat1 == cat2));
    }
}