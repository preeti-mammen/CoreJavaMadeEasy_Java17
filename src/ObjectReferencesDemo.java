
public class ObjectReferencesDemo {
	int x;

	ObjectReferencesDemo() {
	}

	public static void main(String[] args) {
		ObjectReferencesDemo obj = new ObjectReferencesDemo();  //This is Object Reference in non static context
		System.out.println(obj.x);
	}

}
