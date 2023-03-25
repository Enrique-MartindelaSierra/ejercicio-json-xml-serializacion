package com.enrique.ejercicio_json_xml_serializacion.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Nave {

	private  String name;
	private  String model;
	private  String manufacturer;
	private  double cost_in_credits;
	private  double length;
	private  double max_atmosphering_speed;
	private  String crew;
	private  double passengers;
	private  double cargo_capacity;
	private  String consumables;
	private  double hyperdrive_rating;
	private  double MGLT;
	private  String starship_class;
	private  List<String> pilots;
	private  List<String> films;
	private  String created;
	private  String edited;
	private  String url;
	
	
	public Nave() {
		this.pilots= new ArrayList<String>();		
		this.films= new ArrayList<String>();
	}


	public Nave(String name, String model, String manufacturer, double cost_in_credits, double length,
			double max_atmosphering_speed, String crew, double passengers, double cargo_capacity, String consumables,
			double hyperdrive_rating, double mGLT, String starship_class, List<String> pilots, List<String> films,
			String created, String edited, String url) {
		super();
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.cost_in_credits = cost_in_credits;
		this.length = length;
		this.max_atmosphering_speed = max_atmosphering_speed;
		this.crew = crew;
		this.passengers = passengers;
		this.cargo_capacity = cargo_capacity;
		this.consumables = consumables;
		this.hyperdrive_rating = hyperdrive_rating;
		MGLT = mGLT;
		this.starship_class = starship_class;
		this.pilots = pilots;
		this.films = films;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public double getCost_in_credits() {
		return cost_in_credits;
	}


	public void setCost_in_credits(double cost_in_credits) {
		this.cost_in_credits = cost_in_credits;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getMax_atmosphering_speed() {
		return max_atmosphering_speed;
	}


	public void setMax_atmosphering_speed(double max_atmosphering_speed) {
		this.max_atmosphering_speed = max_atmosphering_speed;
	}


	public String getCrew() {
		return crew;
	}


	public void setCrew(String crew) {
		this.crew = crew;
	}


	public double getPassengers() {
		return passengers;
	}


	public void setPassengers(double passengers) {
		this.passengers = passengers;
	}


	public double getCargo_capacity() {
		return cargo_capacity;
	}


	public void setCargo_capacity(double cargo_capacity) {
		this.cargo_capacity = cargo_capacity;
	}


	public String getConsumables() {
		return consumables;
	}


	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}


	public double getHyperdrive_rating() {
		return hyperdrive_rating;
	}


	public void setHyperdrive_rating(double hyperdrive_rating) {
		this.hyperdrive_rating = hyperdrive_rating;
	}


	public double getMGLT() {
		return MGLT;
	}


	public void setMGLT(double mGLT) {
		MGLT = mGLT;
	}


	public String getStarship_class() {
		return starship_class;
	}


	public void setStarship_class(String starship_class) {
		this.starship_class = starship_class;
	}


	public List<String> getPilots() {
		return pilots;
	}


	public void setPilots(List<String> pilots) {
		this.pilots = pilots;
	}


	public List<String> getFilms() {
		return films;
	}


	public void setFilms(List<String> films) {
		this.films = films;
	}


	public String getCreated() {
		return created;
	}


	public void setCreated(String created) {
		this.created = created;
	}


	public String getEdited() {
		return edited;
	}


	public void setEdited(String edited) {
		this.edited = edited;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "Nave [name=" + name + ", model=" + model + ", manufacturer=" + manufacturer + ", cost_in_credits="
				+ cost_in_credits + ", length=" + length + ", max_atmosphering_speed=" + max_atmosphering_speed
				+ ", crew=" + crew + ", passengers=" + passengers + ", cargo_capacity=" + cargo_capacity
				+ ", consumables=" + consumables + ", hyperdrive_rating=" + hyperdrive_rating + ", MGLT=" + MGLT
				+ ", starship_class=" + starship_class + ", pilots=" + pilots + ", films=" + films + ", created="
				+ created + ", edited=" + edited + ", url=" + url + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(model, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nave other = (Nave) obj;
		return Objects.equals(model, other.model) && Objects.equals(name, other.name);
	}
	
	
	
	
}
