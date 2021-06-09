package com.aaroncards.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaroncards.entidad.Paquetecarta;
import com.aaroncards.repositorio.PaquetecartaRepository;

@Service
public class PaquetecartaServiceImpl implements PaquetecartaService {

	@Autowired
	private PaquetecartaRepository repository;
	
	@Override
	public List<Paquetecarta> listaPaquetecarta() {
		return repository.findAll();
	}

	@Override
	public Paquetecarta insertaActualizaPaquetecarta(Paquetecarta obj) {
		return repository.save(obj);
	}

	@Override
	public Optional<Paquetecarta> obtienePorId(int codpaquecart) {
		return repository.findById(codpaquecart);
	}

	@Override
	public void eliminaPaquetecarta(int id) {
		repository.deleteById(id);	
	}

	@Override
	public List<Paquetecarta> listaPaquetecartaPorNombreLike(String filtro) {
		return repository.listaPaquetecartaPorNombreLike(filtro);
	}

}
