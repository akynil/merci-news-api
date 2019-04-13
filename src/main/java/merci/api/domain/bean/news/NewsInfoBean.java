package merci.api.domain.bean.news;

import java.util.Date;

public class NewsInfoBean {

	/** サイト名 */
	private String siteName;

	/** サイトURL */
	private String siteUrl;

	/** 記事タイトル */
	private String title;

	/** 記事URL */
	private String url;

	/** 投稿日時 */
	private Date publishedDate;

	/** 記事詳細 */
	private String description;

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



}