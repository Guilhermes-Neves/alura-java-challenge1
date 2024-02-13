import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título de um livro: ");
        String bookTitle = scanner.nextLine();

        String apiKey = "AIzaSyDK4zKo1oGo2T2tT30MSjO47xnqMHGNezI";
        String address = "https://www.googleapis.com/books/v1/volumes?q=" + bookTitle.replace(" ", "") + "&key=" + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse response = client.send(request, BodyHandlers.ofString());
        System.out.println(response.body());


    }
}