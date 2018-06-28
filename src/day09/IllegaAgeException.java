package day09;
/**
 * 自定义异常
 * 通常自定义异常常用来描述业务逻辑的异常
 * 
 *年龄不合法异常
 * @author nijunran
 *
 */
public class IllegaAgeException extends Exception {

	public IllegaAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegaAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegaAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegaAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegaAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
