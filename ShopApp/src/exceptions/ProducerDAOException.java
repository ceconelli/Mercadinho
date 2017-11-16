package exceptions;

public class ProducerDAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProducerDAOException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProducerDAOException(String message) {
		super("Erro em ProducerDAO "+message);
		// TODO Auto-generated constructor stub
	}

}
