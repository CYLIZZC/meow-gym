package tw.idv.joanna. web.blacklist.dao;

import java.util.List;

import tw.idv.joanna.web.user.pojo.User;

public interface BlockListDao {

	int updateBlockState(User user);
	
	List<User> selectAllBlock();

}
