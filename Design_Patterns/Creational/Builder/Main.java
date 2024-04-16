package Design_Patterns.Creational.Builder;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Message m = Message.builder()      // Step 3 Method chaining
                .setContent("Hii")
                .setReceiver("User3")
                .setSender("User1")
                .build();

        System.out.println(m.getContent());
        System.out.println(m.getTimeStamp());
        System.out.println(m.getSender());
        System.out.println(m.getReceiver());
        System.out.println(m.getIsDelivered());

    }
}
