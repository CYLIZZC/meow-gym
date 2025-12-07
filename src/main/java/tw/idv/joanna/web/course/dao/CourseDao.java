package tw.idv.joanna.web.course.dao;

import java.util.List;

import tw.idv.joanna.core.dao.CoreDao;
import tw.idv.joanna.web.coach.pojo.CoachProfiles;
import tw.idv.joanna.web.course.pojo.ClassSessions;
import tw.idv.joanna.web.course.pojo.Course;
import tw.idv.joanna.web.course.pojo.CourseRecurringRules;
import tw.idv.joanna.web.course.pojo.SessionUsers;
import tw.idv.joanna.web.order.pojo.Orderitems;
import tw.idv.joanna.web.order.pojo.Orders;
import tw.idv.joanna.web.promotions.pojo.CoursePromo;
import tw.idv.joanna.web.user.pojo.User;

public interface CourseDao extends CoreDao<Course, Integer>{
	
	int insert (Course course);
	
	int insert (CourseRecurringRules courseRecurringRules);
	
	int insert (ClassSessions classSessions);
	
	int insert (SessionUsers sessionUsers);
	
	CoachProfiles selectByCoachId (Integer id);
	
	User selectByUserId (Integer id);
	
	List<CourseRecurringRules> selectByCourseId (Integer id);
	
	List<Orders> selectOrderByUserId (Integer id);
	
	List<Integer> selectCourseIdByOrderId (Integer id);
	
	List<ClassSessions> selectClassSessionBycourseID (Integer id);

	SessionUsers selectBySessionIdUserID (Integer sessionId, Integer userId);

	Long selectCntBySessionId (Integer sessionId);
	
	Long selectCntFromSessionUserById (Integer sessionId, Integer userId);
	
	int deleteById (SessionUsers sessionUsers);
	
	List<Course> selectApprovalCourse();
	
	List<Orderitems> selectOrderItemByCourseId(Integer courseId);
	
	Orders selectOrderByOrderId(Integer orderId);
	
	List<CoursePromo> selectByCoursId(Integer courseId);
	
	List<Course> selectCourseByCoachId (Integer coachId);
	
	int updateChkAt (ClassSessions classSessions);
	
	int updateChkOut (ClassSessions classSessions);
}
