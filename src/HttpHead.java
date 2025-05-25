import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpHead {
    private String apiKey = "e8621a74c8b2f8be781bf2b5/";
    private String type1 = "latest/";
    private String type2 = "pair/";
    private String url = "https://v6.exchangerate-api.com/v6/"+ apiKey + type1 + "BRL";

    public HttpHead requester() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Exchange.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("something went wrong, read carefully");

        }
    }
}
