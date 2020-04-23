/**
 * Created by Erick 2020.04.16:15:28
 */
package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpring {
    public static void main(String[] args) {

        System.out.println("Application starting...");
        // Initialize Spring ioc container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get MessagePrinter from IOC container
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        // Get MessageService from IOC container
//        MessageService service = context.getBean(MessageService.class);

//        System.out.println(printer);
//        System.out.println(service);

//        printer.setService(service);
        printer.printMessage();
    }
}


