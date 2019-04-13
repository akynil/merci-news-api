package merci.api.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {
	/**
	 * Beanの情報をJSON文字列に変換する。
	 *
	 * @param bean 変換対象のBean
	 * @return JSON文字列
	 * @throws JsonProcessingException JSON処理時の例外
	 */
	public static String convertToJson(Object bean) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writer().writeValueAsString(bean);
		} catch (JsonProcessingException e) {
			throw e;
		}
	}
}

