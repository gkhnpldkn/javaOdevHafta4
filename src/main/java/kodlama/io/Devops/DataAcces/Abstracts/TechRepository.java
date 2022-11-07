package kodlama.io.Devops.DataAcces.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Devops.Entities.Concretes.Tecnology;

public interface TechRepository extends JpaRepository<Tecnology, Integer> {

}
