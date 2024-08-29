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
        return messageDAO.creatMessage(message);
    }

    public List<Message> getAllMessages(){
        return messageDAO.getAllMessages();
    }

    public Message getMessageByMessageID(Message message){
        return messageDAO.getMessageByMessageID(message.getMessage_id());
    }

    public Message deleteMessageByMessageID(Message message){
        return messageDAO.deleteMessageByMessageID(message.getMessage_id());
    }

    public Message updateMessageByMessageID(Message message){
        return messageDAO.updateMessageByMessageID(message.getMessage_id(), message.getMessage_text());
    }

    public List<Message> getAllMessagesByUser(Message message) {
        return messageDAO.getAllMessagesByUser(message.getPosted_by());
    }
}
