package merci.api.domain.service.news;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import merci.api.domain.bean.news.NewsInfoBean;
import merci.api.domain.bean.news.NewsListBean;
import merci.api.domain.service.AbstractService;

/**
 * 記事一覧取得サービスクラス
 */
public class NewsListGetService extends AbstractService {

	public NewsListBean execute() throws IllegalArgumentException, FeedException, IOException {
		String url = "https://news.yahoo.co.jp/pickup/rss.xml";
		SyndFeed feed = getNewsFeed(url);

		NewsListBean listBean = new NewsListBean();
		listBean.setNewsList(convertNewsInfoBean(feed));

		return listBean;
	}

	/**
	 *  urlを元にフィードを取得する。
	 *
	 * @param url RSSのURL
	 * @return {@link SyndFeed}
	 * @throws IllegalArgumentException
	 * @throws FeedException
	 * @throws IOException
	 */
	private SyndFeed getNewsFeed(String url) throws IllegalArgumentException, FeedException, IOException {
		URL feedUrl = new URL(url);
		SyndFeedInput input = new SyndFeedInput();
		return input.build(new XmlReader(feedUrl));
	}

	/**
	 * フィードの情報を{@link NewsInfoBean}のリストに詰め替える。
	 *
	 * @param {@link SyndFeed}
	 * @return {@link NewsInfoBean}のリスト
	 */
	private List<NewsInfoBean> convertNewsInfoBean(SyndFeed feed) {
		List<NewsInfoBean> newsList = new ArrayList<>();
		List<SyndEntry> entrys = feed.getEntries();
		entrys.forEach(e -> {
			NewsInfoBean news = new NewsInfoBean();
			news.setSiteName(feed.getTitle());
			news.setSiteUrl(feed.getLink());
			news.setTitle(e.getTitle());
			news.setUrl(e.getLink());
			news.setPublishedDate(e.getPublishedDate());
			if(Objects.nonNull(e.getDescription())) {
				news.setDescription(e.getDescription().getValue());
			}
			newsList.add(news);
		});
		return newsList;
	}
}
