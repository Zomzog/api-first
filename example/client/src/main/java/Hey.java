import bzh.zomzog.prez.apifirst.client.ApiClient;
import bzh.zomzog.prez.apifirst.client.api.DefaultApi;
import bzh.zomzog.prez.apifirst.domain.Pony;

public class Hey {

    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8080");
        Pony one = apiClient.buildClient(DefaultApi.class).getOne("1");
        System.out.println(one);
    }
}
