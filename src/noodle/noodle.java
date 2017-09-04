package noodle;

public abstract class noodle{

	String description = "Unknow noodle";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
