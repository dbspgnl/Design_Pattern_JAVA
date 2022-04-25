package Template_Method;

public class Application {
    
    public static void main(String[] args) {

        String id = "admin";
        String password = "1234";

		GameConnect connect = new GameConnect();
        connect.requestConnection(id, password);
    }

}
