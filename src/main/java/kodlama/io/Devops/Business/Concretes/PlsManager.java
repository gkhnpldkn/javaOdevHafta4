package kodlama.io.Devops.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devops.Business.Abstract.PlsService;
import kodlama.io.Devops.DataAcces.Abstracts.PlsRepository;
import kodlama.io.Devops.Entities.Concretes.ProgrammingLanguages;

@Service
public class PlsManager implements PlsService {
	private PlsRepository plsRepository;

	@Autowired
	public PlsManager(PlsRepository plsRepository) {

		this.plsRepository = plsRepository;
	}

	@Override
	public void add(ProgrammingLanguages language) {

		if (language.getName() != null) {
			plsRepository.add(language);
		} else {
			System.out.println("lütfen ad kısmını boş bırakmayınız");
		}

	}

	@Override
	public List<ProgrammingLanguages> getAll() {
		// TODO Auto-generated method stub
		return plsRepository.getAll();

	}

	@Override
	public ProgrammingLanguages getById(int id) {
		// TODO Auto-generated method stub
		return plsRepository.getById(id);
	}

	@Override
	public void delete(ProgrammingLanguages language) {
		System.out.println(language.getName() + " silindi");

	}

	@Override
	public void update(ProgrammingLanguages l1, String yeni) {
		System.out.println(l1.getName() + " güncellendi");

	}

}
