package tw.idv.joanna.web.promotions.service;

import java.io.IOException;
import java.util.List;

import tw.idv.joanna.core.service.CoreService;
import tw.idv.joanna.web.course.pojo.Course;
import tw.idv.joanna.web.promotions.pojo.CoursePromo;

public interface PromotionsService extends CoreService {

	List<CoursePromo> selectAll();

	CoursePromo apply(CoursePromo coursePromo) throws IOException;

	List<Course> findCourseAndPromotionAll();

	int delete(CoursePromo coursePromo);

}
