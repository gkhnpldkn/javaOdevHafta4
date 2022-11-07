package kodlama.io.Devops.Business.Abstract;

import java.util.List;

import kodlama.io.Devops.Business.requests.CreateTecnologyRequest;
import kodlama.io.Devops.Business.requests.DeleteTecnologiesReq;
import kodlama.io.Devops.Business.requests.UpdateTconulogyReq;
import kodlama.io.Devops.Business.response.GetAllTecnologyResponse;

public interface TecnologyService {
	void add(CreateTecnologyRequest tecnologyRequest);
	List<GetAllTecnologyResponse> getAll();
	
	void delete(DeleteTecnologiesReq deleteTecnologRequest);
	void update(UpdateTconulogyReq tecnologRequest );

}
