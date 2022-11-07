package kodlama.io.Devops.WebApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devops.Business.Abstract.PlsService;
import kodlama.io.Devops.Business.requests.CreateLanguageRequest;
import kodlama.io.Devops.Business.requests.DeleteLanguageReq;
import kodlama.io.Devops.Business.requests.UpdateLanguageReq;
import kodlama.io.Devops.Business.response.GetAllLanguageResponse;

@RestController 
@RequestMapping("/api/languages")
public class PlssController {
private PlsService plsService;

@Autowired
public PlssController(PlsService plsService) {
	
	this.plsService = plsService;
}
@PostMapping("/add")
public void add(CreateLanguageRequest l1) {
	plsService.add(l1);
}
@GetMapping("/getall")
public List<GetAllLanguageResponse> getAll(){
	return plsService.getAll();
}
@GetMapping("/getById")
public GetAllLanguageResponse getById(int id) {
	return plsService.getById(id);
}
@DeleteMapping("/delete")
public void delete(DeleteLanguageReq l1) {
	plsService.delete(l1);
}
@PutMapping("/update")
public void update(UpdateLanguageReq updaLanguageReq) {
	plsService.update(updaLanguageReq);
}

}
