package tw.idv.joanna. web.index.dao;

import java.util.List;

import tw.idv.joanna.core.dao.CoreDao;
import tw.idv.joanna.web.coach.pojo.CoachProfiles;
import tw.idv.joanna.web.promotions.pojo.CoursePromo;
import tw.idv.joanna.web.user.pojo.User;

public interface IndexDao extends CoreDao<CoursePromo, Integer>{

	List<CoachProfiles> selectAllCoach();

	User selectUserById(Integer userId);

}
