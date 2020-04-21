package hello;

public class MessagePrinter {

    MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
