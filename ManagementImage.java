package model; 

public class ManagementImage extends Game{

	private HasMap<Integer,Image> imageElements;
	
	private HasMap<String,Image> imageEntities;
	
	private HasMap<String,Image> imagesParticules;
	
	private HasMap<String,InputStream> ressources;
	
	private HasMap<String,String> sound;
	
	public void ManagerImage(BDD bdd) {
		this.imageElements = imageElements;
		this.imageEntities = imageEntities;
		this.imageParticules = imageParticules;
		this.ressources = ressources;
		this.sound = sound;
		
	}
	
	private void initRessource() {
		
	}
	
	private void initParticule() {
		
	}
	
	private void initElement() {
		
	}
	
	private void initEntitie() {
		
	}
	
	public HasMap<Integer,Image> getImageElements(){
		return this.imageElements;
	}
	
	public HasMap<String,Image> getImageEntities(){
		return this.imageEntities;
	}
	
	public HasMap<String,Image> getImageParticules(){
		return this.imageParticules;
	}
	
	public HasMap<String,InputStream> getRessource(){
		return this.ressources;
	}
	
	public HasMap<String,String> getSound(){
		return this.sound;
	}
	
}
