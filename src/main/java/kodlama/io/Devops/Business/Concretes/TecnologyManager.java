package kodlama.io.Devops.Business.Concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Devops.Business.Abstract.TecnologyService;
import kodlama.io.Devops.Business.requests.CreateTecnologyRequest;
import kodlama.io.Devops.Business.requests.DeleteTecnologiesReq;
import kodlama.io.Devops.Business.requests.UpdateTconulogyReq;
import kodlama.io.Devops.Business.response.GetAllTecnologyResponse;
import kodlama.io.Devops.DataAcces.Abstracts.PlsRepository;
import kodlama.io.Devops.DataAcces.Abstracts.TechRepository;
import kodlama.io.Devops.Entities.Concretes.ProgrammingLanguages;
import kodlama.io.Devops.Entities.Concretes.Tecnology;

@Service
public class TecnologyManager implements TecnologyService {
	private TechRepository techRepository;
private PlsRepository plsRepository;
	

	public TecnologyManager(TechRepository techRepository, PlsRepository plsRepository) {
	
	this.techRepository = techRepository;
	this.plsRepository = plsRepository;
}

	@Override
	public void add(CreateTecnologyRequest tecnologyRequest) {
		Tecnology tecnology = new Tecnology();
		ProgrammingLanguages language= this.plsRepository.findById(tecnologyRequest.getId()).get();
		tecnology.setTecName(tecnologyRequest.getName());
		tecnology.setProgrammingLanguage(language);
	}

	@Override
	public List<GetAllTecnologyResponse> getAll() {
		List<Tecnology> tecnologies= this.techRepository.findAll();
		 List<GetAllTecnologyResponse> getAllTechnologyResponses=new ArrayList<GetAllTecnologyResponse>();
		 for (Tecnology tecnology : tecnologies) {
			GetAllTecnologyResponse tecnologyResponse = new GetAllTecnologyResponse();
			tecnologyResponse.setName(tecnology.getTecName());
			tecnologyResponse.setId(tecnology.getId());
			getAllTechnologyResponses.add(tecnologyResponse);
			
		}
		return getAllTechnologyResponses;
	}

	

	@Override
	public void delete(DeleteTecnologiesReq deleteTecnologRequest) {
		for (GetAllTecnologyResponse tecnology :getAll() ) {
			if (deleteTecnologRequest.getId()== tecnology.getId()) {
				this.techRepository.deleteById(tecnology.getId());
			}
			else {
				System.out.println("teknoloji bulunamadı");
			}
		}

	}

	@Override
	public void update(UpdateTconulogyReq tecnologRequest) {
		// TODO Auto-generated method stub

	}

}
