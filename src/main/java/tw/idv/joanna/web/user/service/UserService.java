package tw.idv.joanna.web.user.service;

import java.io.IOException;
import java.util.List;

import tw.idv.joanna.core.service.CoreService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.AddressException;
import tw.idv.joanna.web.user.pojo.Country;
import tw.idv.joanna.web.user.pojo.District;
import tw.idv.joanna.web.user.pojo.User;

public interface UserService extends CoreService {

	User login(User user);

	User register(User user) throws IOException;

	User edit(User user) throws IOException;

	List<District> findDist();

	List<Country> findCountry();

	User updateCode(User user) throws AddressException, MessagingException;

	String generateCode();

	int updateCodeAgain(User user) throws AddressException, MessagingException;

	boolean checkRestCode(User user);

	boolean changePassword(User user);

	void sendCodeByEmail(User user) throws AddressException, MessagingException;

}
