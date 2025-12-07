package tw.idv.joanna.web.blacklist.service;

import java.util.List;

import tw.idv.joanna.web.user.pojo.User;

public interface BlockListService {

	List<User> selectAllBlockService();

	int updateBlockStateService(User user);

	int updateUnlockStateService(User user);
}
