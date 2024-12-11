
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message1 = new Message("michel", "Hello!");
        Message message2 = new Message("miguel", "Hola!");
        
        MessagingService messages = new MessagingService();
        
        messages.add(message1);
        messages.add(message2);
        
        System.out.println(messages.getMessages());
    }
}
