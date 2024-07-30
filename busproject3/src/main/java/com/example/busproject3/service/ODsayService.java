import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ODsayService {

    @Value("${odsay.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getExpressBusTerminals() {
        String url = "https://api.odsay.com/v1/api/expressBusTerminals?lang=0&apiKey=" + apiKey;
        return restTemplate.getForObject(url, String.class);
    }
}
