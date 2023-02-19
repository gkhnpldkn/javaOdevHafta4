package kodlama.io.Devops.Business.Concretes;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devops.Business.Abstract.PlsService;
import kodlama.io.Devops.Business.requests.CreateLanguageRequest;
import kodlama.io.Devops.Business.requests.DeleteLanguageReq;
import kodlama.io.Devops.Business.requests.UpdateLanguageReq;
import kodlama.io.Devops.Business.response.GetAllLanguageResponse;
import kodlama.io.Devops.DataAcces.Abstracts.PlsRepository;
import kodlama.io.Devops.Entities.Concretes.ProgrammingLanguages;

@Service
@RequiredArgsConstructor
public class PlsManager implements PlsService {
	private final PlsRepository plsRepository;

	@Override
	public void add(CreateLanguageRequest languageRequest) {
		ProgrammingLanguages language = ProgrammingLanguages.builder()
				.name(languageRequest.getName())
				.build();

		if (language.getName()== null) {
			System.out.println("ad kısmı boş bırakılamaz");
		}else {
			this.plsRepository.save(language);
		}
		
		
	}

	@Override
	public List<GetAllLanguageResponse> getAll() {
		
		List<ProgrammingLanguages> languages= plsRepository.findAll();
		List<GetAllLanguageResponse> responses = new ArrayList<>();
		for (ProgrammingLanguages language : languages) {
			GetAllLanguageResponse rsp = new GetAllLanguageResponse();
			rsp.setName(language.getName());
			rsp.setId(language.getId());
			responses.add(rsp);
		}
		return responses;
	}

	@Override
	public GetAllLanguageResponse getById(int id) {
		GetAllLanguageResponse response ;
		for (GetAllLanguageResponse languageResponse : getAll()) {
			if (languageResponse.getId()== id) {
				  ProgrammingLanguages language = this.plsRepository.findById(id).get();
	               response = new GetAllLanguageResponse();
	               response.setName(language.getName());
	               return response;
			}
			
		}
		return null;
		
	}

	@Override
	public void delete(DeleteLanguageReq languageRequest) {
	for (GetAllLanguageResponse  getAllLanguageResponse : getAll()) {
		if (languageRequest.getName()==getAllLanguageResponse.getName()) {
			this.plsRepository.deleteById(languageRequest.getId());
		}else {
			System.out.println("dil algıalnamadı");
		}
	}
		
	}

	@Override
	public void update(UpdateLanguageReq languageRequest) {
		ProgrammingLanguages language;
		for (GetAllLanguageResponse languageResponse : getAll()) {
			if (languageRequest.getName()== languageResponse.getName()) {
				language= new ProgrammingLanguages();
				language.setName(languageRequest.getName());
			}else {
				System.out.println("dil algılanamadı");
			}
		}
		
	}



	
}
