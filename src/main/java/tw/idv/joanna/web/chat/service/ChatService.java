package tw.idv.joanna. web.chat.service;

import tw.idv.joanna.web.chat.pojo.Chats;

public interface ChatService {
	 //copy the saveAndLoad method from DAO to Service layer.
	Chats saveAndLoad(Chats chats);
}
