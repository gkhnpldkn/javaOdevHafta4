package kodlama.io.Devops.Business.Abstract;

import java.util.List;

import kodlama.io.Devops.Business.requests.CreateLanguageRequest;
import kodlama.io.Devops.Business.requests.DeleteLanguageReq;
import kodlama.io.Devops.Business.requests.UpdateLanguageReq;
import kodlama.io.Devops.Business.response.GetAllLanguageResponse;

public interface PlsService {
	void add(CreateLanguageRequest languageRequest);
List<GetAllLanguageResponse> getAll();
GetAllLanguageResponse getById(int id);
void delete(DeleteLanguageReq languageRequest);
void update(UpdateLanguageReq languageRequest);
}
