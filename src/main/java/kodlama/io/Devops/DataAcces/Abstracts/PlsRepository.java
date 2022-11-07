package kodlama.io.Devops.DataAcces.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Devops.Entities.Concretes.ProgrammingLanguages;


public interface PlsRepository extends JpaRepository<ProgrammingLanguages, Integer>{
	
}
