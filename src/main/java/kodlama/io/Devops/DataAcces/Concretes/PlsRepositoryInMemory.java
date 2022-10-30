package kodlama.io.Devops.DataAcces.Concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devops.DataAcces.Abstracts.PlsRepository;
import kodlama.io.Devops.Entities.Concretes.ProgrammingLanguages;
@Repository
public class PlsRepositoryInMemory implements PlsRepository {

List<ProgrammingLanguages> languages;
	public PlsRepositoryInMemory() {
		languages = new ArrayList<ProgrammingLanguages>();
		languages.add(new ProgrammingLanguages(1,"java"));
		languages.add(new ProgrammingLanguages(2,"c++"));
		languages.add(new ProgrammingLanguages(3,"kotlin"));
		languages.add(new ProgrammingLanguages(4,"flutter"));
	
}
	@Override
	public void add(ProgrammingLanguages language) {
		languages.add(language);
		System.out.println("yeni dil eklendi");
		
	}
	@Override
	public List<ProgrammingLanguages> getAll() {
		
		return languages;
	}
	@Override
	public ProgrammingLanguages getById(int id) {
		for (ProgrammingLanguages l1 : languages) {
			if (l1.getId()== id) {
				return l1;
			}
		}
		return null;
	}
	@Override
	public void delete(ProgrammingLanguages language) {
		languages.remove(language);
		System.out.println(language.getName()+ " programlama dili silindi");
		
	}
	@Override
	public void update(ProgrammingLanguages l1,String yeni) {
		l1.setName(yeni);
		System.out.println(l1+ " güncellendi");
		
	}



}
