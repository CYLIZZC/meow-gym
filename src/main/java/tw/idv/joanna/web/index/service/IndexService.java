package tw.idv.joanna.web.index.service;

import java.util.List;

import tw.idv.joanna.web.coach.pojo.CoachProfiles;
import tw.idv.joanna.web.promotions.pojo.CoursePromo;
import tw.idv.joanna.web.user.pojo.User;

public interface IndexService {
	List<CoursePromo> findAllPromo();
	Boolean isOnSale (CoursePromo coursePromo);
	List<CoachProfiles> findAllCoach();
	Boolean coachApprovalStatus(User user);
}
