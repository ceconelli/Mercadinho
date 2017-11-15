package exceptions;

public class EstadoDAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public EstadoDAOException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstadoDAOException(String message) {
		super("Erro em EstadoDAO "+message);
		// TODO Auto-generated constructor stub
	}

}
