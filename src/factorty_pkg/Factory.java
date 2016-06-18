package factorty_pkg;

public class Factory {
	public Product createProduct() {
		
		return new Concrete_product();
		
	}

}
