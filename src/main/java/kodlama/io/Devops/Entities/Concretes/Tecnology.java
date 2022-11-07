package kodlama.io.Devops.Entities.Concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tecnologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tecnology {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "tecName")
	private String tecName;
	@ManyToOne
	@JoinColumn(name = "tecnologyId")
	private ProgrammingLanguages programmingLanguage;
}
