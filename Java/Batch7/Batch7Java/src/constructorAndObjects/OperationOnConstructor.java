package constructorAndObjects;

public class OperationOnConstructor {

	public static void main(String[] args) {
		ConceptOfConstructor obj = new ConceptOfConstructor();
		
		ConceptOfConstructor obj1 = new ConceptOfConstructor(10,20);
		
		
//		ConceptOfConstructor obj1 = new ConceptOfConstructor(10,20.11f);   //private constructor cannot be called & used to create object in foreign class
	}

}
