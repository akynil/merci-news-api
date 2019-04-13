package merci.api.exception;

/**
 * システム例外クラス
 */
public class ApiSystemException extends BaseApiException {
	/**
	 * デフォルトコンストラクタ
	 */
	public ApiSystemException() {
		super();
	}

	/**
	 * コンストラクタ
	 *
	 * @param cause
	 */
	public ApiSystemException(Throwable cause) {
		super(cause);
	}

	/**
	 * コンストラクタ
	 *
	 * @param message
	 */
	public ApiSystemException(String message) {
		super(message);
	}
}
