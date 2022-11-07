package kodlama.io.Devops.Business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTecnologyRequest {
	private String name;
	private int id;
}
