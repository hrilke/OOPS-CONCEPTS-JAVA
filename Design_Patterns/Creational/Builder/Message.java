package Design_Patterns.Creational.Builder;

import java.time.LocalDateTime;

public class Message {
    private String content;
    private String sender;
    private String receiver;
    private boolean isDelivered;
    private LocalDateTime timeStamp;


    private Message(MessageBuilder messageBuilder) {  // Step 2.1
        this.content = messageBuilder.content;
        this.sender = messageBuilder.sender;
        this.receiver = messageBuilder.receiver;
        this.isDelivered = true;
        this.timeStamp = LocalDateTime.now();
    }

    public static MessageBuilder builder(){         // Step 2.2
        return new MessageBuilder();
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public boolean getIsDelivered() {
        return isDelivered;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }


    public static class MessageBuilder{     // Step 1.1
        private String content;
        private String sender;
        private String receiver;


        public MessageBuilder setContent(String content) { // Step 1.2
            this.content = content;
            return this;
        }

        public MessageBuilder setSender(String sender) {  // Step 1.2
            this.sender = sender;
            return this;
        }

        public MessageBuilder setReceiver(String receiver) { // Step 1.2
            this.receiver = receiver;
            return this;
        }


        public Message build() {  // Step 1.4
            validate();
            return new Message(this);
        }

        private void validate() {   // Step 1.3
            if(this.content.length() == 0)
                throw new RuntimeException("Message Content must include at least 1 char");
        }
    }
}
