package kodlama.io.Devops.WebApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devops.Business.Abstract.TecnologyService;
import kodlama.io.Devops.Business.requests.CreateTecnologyRequest;
import kodlama.io.Devops.Business.requests.DeleteTecnologiesReq;
import kodlama.io.Devops.Business.requests.UpdateTconulogyReq;
import kodlama.io.Devops.Business.response.GetAllTecnologyResponse;

@RestController
@RequestMapping("/api/tecnologies")
public class TecnologiesController {
	private TecnologyService tecnologyService;

	public TecnologiesController(TecnologyService tecnologyService) {
		
		this.tecnologyService = tecnologyService;
	}
	@PostMapping("/addTecnology")
	public void add(CreateTecnologyRequest t1) {
		tecnologyService.add(t1);
	}
	@GetMapping("/getallTecnologies")
	public List<GetAllTecnologyResponse> getAll(){
		return tecnologyService.getAll();
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteTecnologiesReq t1) {
		tecnologyService.delete(t1);
	}
	@PutMapping("/update")
	public void update(UpdateTconulogyReq t1) {
		tecnologyService.update(t1);
	}

}
