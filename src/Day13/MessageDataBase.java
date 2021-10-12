package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDataBase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text){
        messages.add(new Message(sender, receiver, text));
    }

    public static void showDialog(User ul, User u2){
        for (Message message : messages){
            if (message.getSender() == ul && message.getReceiver() == u2
                    || message.getSender() == u2 && message.getReceiver() == u2) {

                System.out.println(message.getSender()+ ": " + message.getText());

            }
        }
    }
}
