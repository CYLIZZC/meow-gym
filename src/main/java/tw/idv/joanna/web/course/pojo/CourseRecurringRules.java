package tw.idv.joanna. web.course.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import tw.idv.joanna.core.pojo.Core;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COURSE_RECURRING_RULES")
public class CourseRecurringRules extends Core {
	private static final long serialVersionUID = 2656068127653219211L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RULE_ID")
	private Integer ruleId;
	@Column(name = "COURSE_ID")
	private Integer courseId;
	@Column(name = "WEEKDAY")
	private Integer weekday;
	@Column(name = "TIME_SLOT")
	private Integer timeSlot;
}
