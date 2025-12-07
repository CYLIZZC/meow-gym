package tw.idv.joanna.web.coach.pojo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "COACH_EDUCATIONS")
public class CoachEducations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EDU_ID")
	private Integer eduId;
	@Column(name = "COACH_ID")
	private Integer coachId; 
	@Column(name = "SCHOOL")
	private String school; 
	@Column(name = "DEGREE")
	private String degree; 
}
