package tw.idv.joanna.web.coach.pojo;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COACH_PROFILES")
public class CoachProfiles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COACH_ID")
	private Integer coachId;
	@Column(name = "USER_ID")
	private Integer userId;
	@Column(name = "BIO")
	private String bio;
	@Column(name = "APPROVAL_STATUS")
	private String approvalStatus; 
	@Column(name = "APPROVED_AT")
	private Timestamp approvedAt;
	@Transient
	private String coachName;
	@Transient
	private String avatarUrl;
}
