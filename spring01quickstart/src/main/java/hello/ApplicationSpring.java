/**
 * Created by Erick 2020.04.16:15:28
 */
package hello;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

@ComponentScan
public class ApplicationSpring {
    public static void main(String[] args) {
//        MessagePrinter printer = new MessagePrinter();
//        MessageService service = new MessageService();
//        printer.setService(service);
//        printer.printMessage();

        System.out.println("Application starting...");
        // Initialize Spring ioc container
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
    }
}


