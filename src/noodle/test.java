package noodle;

public class test {

	public static void main(String[] args) {
	

		
		noodle  n1 = new noodlecool();
		n1 = new pig(n1);
		
		System.out.println(n1.getDescription()+ " $ = "+ n1.cost() );
		
		noodle  n2 = new big();
		n2 = new pig(n2);
		System.out.println(n2.getDescription()+ " $ = "+ n2.cost() );
		
		noodle  n3 = new small();
		n3 = new pig(n3);
		System.out.println(n3.getDescription()+ " $ = "+ n3.cost() );
		
		
	}

}