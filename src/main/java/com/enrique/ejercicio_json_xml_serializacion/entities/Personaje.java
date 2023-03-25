package com.enrique.ejercicio_json_xml_serializacion.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Personaje implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name; 
 	private double height; 
 	private double mass;
 	private String hair_color; 
 	private String skin_color; 
 	private String eye_color; 
 	private String birth_year; 
 	private String gender; 
 	private String homeworld; 
 	private List<String> films; 
 	private List<String> species; 
 	private List<String> vehicles; 
 	private List<String> starships; 
 	private String created;
 	private String edited;
 	private String url;





	public Personaje() {
		this.films= new ArrayList<String>();
		this.species= new ArrayList<String>();
		this.vehicles= new ArrayList<String>();
		this.starships= new ArrayList<String>();
	}





	public Personaje(String name, double height, double mass, String hair_color, String skin_color, String eye_color,
			String birth_year, String gender, String homeworld, List<String> films, List<String> species,
			List<String> vehicles, List<String> starships, String created, String edited, String url) {
		super();
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.hair_color = hair_color;
		this.skin_color = skin_color;
		this.eye_color = eye_color;
		this.birth_year = birth_year;
		this.gender = gender;
		this.homeworld = homeworld;
		this.films = films;
		this.species = species;
		this.vehicles = vehicles;
		this.starships = starships;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}





	public Personaje(Personaje p) {
		super();
		this.name = p.name;
		this.height = p.height;
		this.mass = p.mass;
		this.hair_color = p.hair_color;
		this.skin_color = p.skin_color;
		this.eye_color = p.eye_color;
		this.birth_year = p.birth_year;
		this.gender = p.gender;
		this.homeworld = p.homeworld;
		p.getFilms().forEach(f->this.films.add(f));
		p.getSpecies().forEach(sp->this.films.add(sp));
		p.getVehicles().forEach(v->this.films.add(v));
		p.getStarships().forEach(st->this.films.add(st));
		this.created = p.created;
		this.edited = p.edited;
		this.url = p.url;
	
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public double getHeight() {
		return height;
	}





	public void setHeight(double height) {
		this.height = height;
	}





	public double getMass() {
		return mass;
	}





	public void setMass(double mass) {
		this.mass = mass;
	}





	public String getHair_color() {
		return hair_color;
	}





	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}





	public String getSkin_color() {
		return skin_color;
	}





	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}





	public String getEye_color() {
		return eye_color;
	}





	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}





	public String getBirth_year() {
		return birth_year;
	}





	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getHomeworld() {
		return homeworld;
	}





	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}





	public List<String> getFilms() {
		return films;
	}





	public void setFilms(List<String> films) {
		this.films = films;
	}





	public List<String> getSpecies() {
		return species;
	}





	public void setSpecies(List<String> species) {
		this.species = species;
	}





	public List<String> getVehicles() {
		return vehicles;
	}





	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}





	public List<String> getStarships() {
		return starships;
	}





	public void setStarships(List<String> starships) {
		this.starships = starships;
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
		return "Personaje [name=" + name + ", height=" + height + ", mass=" + mass + ", hair_color=" + hair_color
				+ ", skin_color=" + skin_color + ", eye_color=" + eye_color + ", birth_year=" + birth_year + ", gender="
				+ gender + ", homeworld=" + homeworld + ", films=" + films + ", species=" + species + ", vehicles="
				+ vehicles + ", starships=" + starships + ", created=" + created + ", edited=" + edited + ", url=" + url
				+ "]";
	}





	@Override
	public int hashCode() {
		return Objects.hash(birth_year, gender, homeworld, name);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(birth_year, other.birth_year) && Objects.equals(gender, other.gender)
				&& Objects.equals(homeworld, other.homeworld) && Objects.equals(name, other.name);
	}

	
	
	
	
	
	
}
