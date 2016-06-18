package factorty_pkg;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory ff=new Factory();
		Product pp=ff.createProduct();
		pp.doSomething();
	}

}
