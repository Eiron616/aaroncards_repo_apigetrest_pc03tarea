package com.aaroncards.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "paquetecarta")
public class Paquetecarta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codpaquecart")
	private Integer codpaquecart;
	
	private String nompaquecart;
	private String descpaquecart;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fchregpaquecart;
	
	private double preciopaquecart;

	public Integer getCodpaquecart() {
		return codpaquecart;
	}

	public void setCodpaquecart(Integer codpaquecart) {
		this.codpaquecart = codpaquecart;
	}

	public String getNompaquecart() {
		return nompaquecart;
	}

	public void setNompaquecart(String nompaquecart) {
		this.nompaquecart = nompaquecart;
	}

	public String getDescpaquecart() {
		return descpaquecart;
	}

	public void setDescpaquecart(String descpaquecart) {
		this.descpaquecart = descpaquecart;
	}

	public Date getFchregpaquecart() {
		return fchregpaquecart;
	}

	public void setFchregpaquecart(Date fchregpaquecart) {
		this.fchregpaquecart = fchregpaquecart;
	}

	public double getPreciopaquecart() {
		return preciopaquecart;
	}

	public void setPreciopaquecart(double preciopaquecart) {
		this.preciopaquecart = preciopaquecart;
	}
	
	
}
