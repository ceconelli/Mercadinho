package exceptions;

public class SaleDAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public SaleDAOException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaleDAOException(String message) {
		super("Erro em SaleDAO "+message);
		// TODO Auto-generated constructor stub
	}

}
