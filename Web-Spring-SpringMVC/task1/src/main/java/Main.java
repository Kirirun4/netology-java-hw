public class Main {
    public static void main(String[] args) {
        Server server = new Server(64, 5555);
        server.start();
    }
}