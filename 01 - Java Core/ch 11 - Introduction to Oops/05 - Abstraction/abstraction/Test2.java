package prahar.oops.abstraction;

interface MessageService {
    void sendMessage(String msg);
}

class EmailService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("Email: " + msg);
    }
}

class WhatsAppService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("WhatsApp: " + msg);
    }
}

class Notification {
    private MessageService service;

    Notification(MessageService service) {
        this.service = service;
    }

    void notifyUser(String msg) {
        service.sendMessage(msg);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Notification n = new Notification(new WhatsAppService());
        n.notifyUser("Payment received");
    }
}

