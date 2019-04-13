package merci.api.domain.bean.news;

import java.util.List;

public class NewsListBean {

	/** 記事情報 */
	private List<NewsInfoBean> newsList;

	public List<NewsInfoBean> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<NewsInfoBean> newsList) {
		this.newsList = newsList;
	}

}