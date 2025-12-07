package tw.idv.joanna.web.promotions.pojo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Table(name = "course_promotions")
public class CoursePromo extends Core {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "promo_id")
	private Integer promoId;
	@Column(name = "course_id")
	private Integer courseId;
	@Column(name = "promo_price")
	private Integer promoPrice;
	@Column(name = "date_start")
	@JsonFormat(pattern = "yyyy/MM/dd", timezone = "GMT+8")
	private Date dateStart;
	@Column(name = "date_end")
	@JsonFormat(pattern = "yyyy/MM/dd", timezone = "GMT+8")
	private Date dateEnd;
	@Column(name = "img_url")
	private String imgUrl;
	@Transient
	private String imgBase64;
	@Transient
	private String filename;
}
