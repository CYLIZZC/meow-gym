package tw.idv.joanna. web.course.pojo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SESSION_USERS")
@IdClass(SessionUsersId.class)
public class SessionUsers {
	@Id
	@Column(name = "SESSION_ID")
	private Integer sessionId;
	@Id
	@Column(name = "USER_ID")
	private Integer userId;
}
