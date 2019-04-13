package merci.api.app.resource;

import java.util.Objects;

import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;

import merci.api.common.constant.CommonConst.HttpStatusCode;
import merci.api.common.util.JsonConverter;

/**
 * リソースクラスの基底クラス
 */
public class AbstractResource {
	/** 空のJSON */
    private static final String EMPTY_JSON = "{}";

	/**
	 * HTTPステータス200でJSON文字列を返却する。
	 *
	 * @param response レスポンスとなるJSON文字列
	 * @return {@link Response}
	 */
	protected Response returnResponse(String response) {
		return Response.status(HttpStatusCode.CODE_200.getValue()).entity(response).build();
	}

	/**
	 * HTTPステータス200でJSON文字列を返却する。<br>
	 * 引数がObject型の場合は、JSON文字列に変換する。
	 *
	 * @param response 返却用オブジェクト
	 * @return {@link Response}
	 * @throws JsonProcessingException
	 */
	protected Response returnResponse(Object obj) throws JsonProcessingException {
		if (Objects.isNull(obj)) {
			return returnResponse();
		} else {
			return returnResponse(JsonConverter.convertToJson(obj));
		}
	}

	/**
	 * HTTPステータス200で空のJSON文字列を返却する。
	 *
	 * @return {@link Response}
	 */
	protected Response returnResponse() {
		return returnResponse(EMPTY_JSON);
	}
}
