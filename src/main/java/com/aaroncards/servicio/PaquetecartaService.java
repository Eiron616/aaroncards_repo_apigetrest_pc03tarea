package com.aaroncards.servicio;

import java.util.List;
import java.util.Optional;

import com.aaroncards.entidad.Paquetecarta;

public interface PaquetecartaService {
public abstract List<Paquetecarta>listaPaquetecarta();
public abstract Paquetecarta insertaActualizaPaquetecarta(Paquetecarta obj);
public abstract Optional<Paquetecarta> obtienePorId(int codpaquecart);
public abstract void eliminaPaquetecarta(int id);
public abstract List<Paquetecarta> listaPaquetecartaPorNombreLike(String filtro);
}
