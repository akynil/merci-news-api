package merci.api.app.resource.news;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import merci.api.app.resource.AbstractResource;
import merci.api.common.util.JsonConverter;
import merci.api.domain.bean.news.NewsListBean;
import merci.api.domain.service.news.NewsListGetService;

/**
 * ニュースリスト取得API
 */
@Path("/news")
public class NewsListGetResource extends AbstractResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
    public String getNewsList() throws Exception {

    	NewsListGetService service = new NewsListGetService();
		NewsListBean bean = service.execute();
        return JsonConverter.convertToJson(bean);
    }
}
