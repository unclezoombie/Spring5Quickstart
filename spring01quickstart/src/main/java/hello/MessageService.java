package hello;

import org.springframework.stereotype.Component;

/**
 * Created by Erick 2020.04.16:15:28
 */
@Component
public class MessageService {
    public MessageService() {
        super();
        System.out.println("MessageService started!");
    }

    /**
     * Print out message
     * @return the string which needs to be printed.
     */
    public String getMessage(){
        return "Hello World!";
    }
}
