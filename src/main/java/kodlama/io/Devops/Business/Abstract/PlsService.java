package kodlama.io.Devops.Business.Abstract;

import java.util.List;

import kodlama.io.Devops.Entities.Concretes.ProgrammingLanguages;

public interface PlsService {
	void add(ProgrammingLanguages language);
List<ProgrammingLanguages> getAll();
ProgrammingLanguages getById(int id);
void delete(ProgrammingLanguages language);
void update(ProgrammingLanguages l1,String yeni);
}
