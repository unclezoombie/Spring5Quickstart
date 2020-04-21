package hello;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    MessageService service;

    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter started!");
    }

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
