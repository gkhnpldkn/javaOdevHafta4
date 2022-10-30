package kodlama.io.Devops.WebApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devops.Business.Abstract.PlsService;
import kodlama.io.Devops.Entities.Concretes.ProgrammingLanguages;

@RestController 
@RequestMapping("/api/languages")
public class PlssController {
private PlsService plsService;

@Autowired
public PlssController(PlsService plsService) {
	
	this.plsService = plsService;
}
@GetMapping("/add")
public void add(ProgrammingLanguages l1) {
	plsService.add(l1);
}
@GetMapping("/getall")
public List<ProgrammingLanguages> getAll(){
	return plsService.getAll();
}
@GetMapping("/getById")
public ProgrammingLanguages getById(int id) {
	return plsService.getById(id);
}
@GetMapping("/delete")
public void delete(ProgrammingLanguages l1) {
	plsService.delete(l1);
}
@GetMapping("/update")
public void update(ProgrammingLanguages l1,String s) {
	plsService.update(l1, s);
}

}
