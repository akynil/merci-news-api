package merci.api.common.constant;

public class CommonConst {
    /**
     * HTTPステータスコード
     */
    public enum HttpStatusCode {
    	/** 200:OK */
        CODE_200(200);

        private int httpStatusCode;

        HttpStatusCode(int httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
        }

        public int getValue() {
            return this.httpStatusCode;
        }
    }
}
