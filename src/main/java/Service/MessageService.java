package Service;

import DAO.MessageDAO;
import Model.Message;

import java.util.List;

public class MessageService {
    public MessageDAO messageDAO;

    public MessageService(){
        messageDAO = new MessageDAO();
    }

    public MessageService(MessageDAO messageDAO){
        this.messageDAO = messageDAO;
    }

    public Message creatMessage(Message message){
        if(message.getMessage_text() != "" && message.getMessage_text().length() < 255){
            return messageDAO.creatMessage(message);
        }
        return null;
    }

    public List<Message> getAllMessages(){
        return messageDAO.getAllMessages();
    }

    public Message getMessageByMessageID(int message_id){
        return messageDAO.getMessageByMessageID(message_id);
    }

    public Message deleteMessageByMessageID(int message_id){
        if (getMessageByMessageID(message_id) != null) {
            return messageDAO.deleteMessageByMessageID(message_id);
        }
        return null;
    }

    public Message updateMessageByMessageID(int message_id, Message message){
        if (getMessageByMessageID(message_id)!= null && message.getMessage_text().length() > 0 && message.getMessage_text().length() <255) {
            return messageDAO.updateMessageByMessageID(message_id, message);
        }
        return null;
    }

    public List<Message> getAllMessagesByUser(int posted_by) {
        return messageDAO.getAllMessagesByUser(posted_by);
    }
}
