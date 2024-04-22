package pl.comarch.szkolenia.car.rent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.comarch.szkolenia.car.rent.configuration.AppConfiguration;
import pl.comarch.szkolenia.car.rent.core.Core;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        Core core = context.getBean(Core.class);
        core.start();
    }
}
