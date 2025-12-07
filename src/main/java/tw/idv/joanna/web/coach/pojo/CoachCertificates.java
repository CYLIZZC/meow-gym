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
@Table(name = "COACH_CERTIFICATES")
public class CoachCertificates {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CERT_ID")
	private Integer certId;
	@Column(name = "COACH_ID")
	private Integer coachId; 
	@Column(name = "NAME")
	private String name; 
	@Column(name = "FILE_URL")
	private String fileUrl; 
}
