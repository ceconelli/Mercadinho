package exceptions;

public class ProductDAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProductDAOException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDAOException(String message) {
		super("Erro em ProductDAO "+message);
		// TODO Auto-generated constructor stub
	}

}
