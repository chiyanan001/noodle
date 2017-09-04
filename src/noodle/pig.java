package noodle;

public class pig extends topping {
	noodle noodle;
	
	public pig(noodle noodle){
		 this.noodle = noodle;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  noodle.getDescription()+", pig";
	}
	public double cost(){
		return 15 + noodle.cost();
	
}
}