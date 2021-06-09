package com.aaroncards.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aaroncards.entidad.Paquetecarta;
import com.aaroncards.servicio.PaquetecartaService;

@RestController
@RequestMapping("/rest/paquetecarta")
public class PaquetecartaController {
	
	@Autowired
	private PaquetecartaService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Paquetecarta>> listaPaquetecarta(){
		List<Paquetecarta> lista = service.listaPaquetecarta();
		return ResponseEntity.ok(lista);
	}
	
	@PutMapping
	public ResponseEntity<Paquetecarta> actualiza(@RequestBody Paquetecarta obj){
		System.out.println("se -> actualiza "+obj.getCodpaquecart());	
		Optional<Paquetecarta> optPaquetecarta = service.obtienePorId(obj.getCodpaquecart());
		if (optPaquetecarta.isPresent()) {
			Paquetecarta objSalida = service.insertaActualizaPaquetecarta(obj);
			if (objSalida != null) {
				return ResponseEntity.ok(objSalida);
			}else {
				return ResponseEntity.badRequest().build();
			}	
		}else {
			System.out.println("el -> actualiza no existe el cod : " + obj.getCodpaquecart());
			return ResponseEntity.badRequest().build();
		}		
	}
	
	@PostMapping
	public ResponseEntity<Paquetecarta> registra(@RequestBody Paquetecarta obj){
		System.out.println("se -> registra "+obj.getCodpaquecart());
		Paquetecarta objSalida = service.insertaActualizaPaquetecarta(obj);
		if (objSalida!= null) {
			return ResponseEntity.ok(objSalida);
			
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Paquetecarta> elimina(@PathVariable("id") int codpaquecart){
		System.out.println("se -> elimina " + codpaquecart);
		Optional<Paquetecarta> optPaquetecarta = service.obtienePorId(codpaquecart);
		if (optPaquetecarta.isPresent()) {
			service.eliminaPaquetecarta(codpaquecart);
			return ResponseEntity.ok(optPaquetecarta.get());
		}else {
			System.out.println("el -> elimina no existe el cod : " + codpaquecart);
			return ResponseEntity.badRequest().build();
		}
	}
	
	@GetMapping("/buscarPorNom/{nompaquecart}")
	public ResponseEntity<List<Paquetecarta>> buscar(@PathVariable("nompaquecart") String filtro) {
		System.out.println("se -> busca por nombre : " + filtro);
		List<Paquetecarta> lstPaquetecarta = service.listaPaquetecartaPorNombreLike(filtro);
		if (!CollectionUtils.isEmpty(lstPaquetecarta)) {
			return ResponseEntity.ok(lstPaquetecarta);
		} else {
			System.out.println(">>>> buscar por dni - no existen alumnos con ese dni : " + filtro);
			return ResponseEntity.badRequest().build();
		}
	}
	
}
