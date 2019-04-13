package merci.api.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * 業務例外クラス
 */
public class ApiBusinessException extends BaseApiException {
	/** エラーメッセージのリスト */
	private List<String> errors = new ArrayList<>();

	/**
	 * デフォルトコンストラクタ
	 */
	public ApiBusinessException() {
		super();
	}

	/**
	 * コンストラクタ
	 *
	 * @param cause
	 */
	public ApiBusinessException(Throwable cause) {
		super(cause);
	}

	/**
	 * コンストラクタ
	 *
	 * @param message
	 */
	public ApiBusinessException(String message) {
		super(message);
	}

	/**
	 * エラー情報を追加する。
	 * @param message メッセージ
	 */
	public void addError(String message) {
		errors.add(message);
	}

	/**
	 * エラー情報のリストを取得する。
	 * @return errors
	 */
	public List<String> getErrors() {
		return errors;
	}
}
