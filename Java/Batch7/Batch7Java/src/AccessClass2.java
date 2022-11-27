
import aceessInJava.AccessClass;
public class AccessClass2 {

	public static void main(String[] args) {
		AccessClass obj = new AccessClass();
		System.out.println(obj.i);
		System.out.println(AccessClass.j);
		obj.publicMethod();
		AccessClass.publicMethod1();

	}

}
