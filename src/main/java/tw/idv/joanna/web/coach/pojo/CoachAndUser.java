package tw.idv.joanna.web.coach.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tw.idv.joanna.web.user.pojo.User;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CoachAndUser {
	private CoachProfiles coachProfiles;
	private User user;
}
