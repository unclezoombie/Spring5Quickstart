/**
 * Created by Erick 2020.04.16:15:28
 */
package hello;

public class MessagePrinter {

    private MessageService service;

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
