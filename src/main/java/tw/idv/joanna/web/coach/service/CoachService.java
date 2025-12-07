package tw.idv.joanna. web.coach.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import tw.idv.joanna.web.coach.pojo.CoachAndUser;
import tw.idv.joanna.web.coach.pojo.CoachApplyUpdateRequest;
import tw.idv.joanna.web.coach.pojo.CoachCertificates;
import tw.idv.joanna.web.coach.pojo.CoachEducations;
import tw.idv.joanna.web.coach.pojo.CoachExperiences;
import tw.idv.joanna.web.coach.pojo.CoachProfiles;
import tw.idv.joanna.web.user.pojo.User;

public interface CoachService {
	
	List<CoachAndUser> findCoachAndUser();
	
	boolean inviteCoach(Integer userId) throws ParseException;
	
	CoachProfiles findProfile(Integer userId);
	
	CoachCertificates findCertificate(Integer coachId);
	
	CoachEducations findEducation(Integer coachId);
	
	CoachExperiences findExperience(Integer coachId);
	
	User findUser(Integer userId);
	
	boolean updateCoachData(CoachApplyUpdateRequest request) throws IOException;

	Boolean updateApprovalStatus(CoachProfiles profile);
}
