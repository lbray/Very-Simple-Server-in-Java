// HTTP web server
// only listens to and reads client request...does not respond

import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HTTPServerListen {
	public static void main(String[] args) throws Exception {
		//create network socket listening on port 8080
		ServerSocket server = new ServerSocket(8080);
		System.out.println("Listening for connection on port 8080...");
		while (true){
			//accept and read client request
			Socket client = server.accept();
			InputStreamReader readStream =  new InputStreamReader(client.getInputStream());
			BufferedReader reader = new BufferedReader(readStream);
			String line = reader.readLine();            
			while (!line.isEmpty()) {
				System.out.println(line);
				line = reader.readLine();
			}
		}
	}
}
