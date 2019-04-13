package merci.api.exception;

/**
 * 独自例外の基底クラス
 */
public class BaseApiException extends Exception {
	/**
	 * デフォルトコンストラクタ
	 */
	public BaseApiException() {
		super();
	}

	/**
	 * コンストラクタ
	 *
	 * @param cause
	 */
	public BaseApiException(Throwable cause) {
		super(cause);
	}

	/**
	 * コンストラクタ
	 *
	 * @param message
	 */
	public BaseApiException(String message) {
		super(message);
	}
}
