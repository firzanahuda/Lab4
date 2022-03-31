import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * This method launch the frame and manage the connection to the server.
 * 
 * @author firzanahuda
 *
 */

public class ClientLanguageApplication {

	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		
		// Launch client-side frame
		ClientLanguageFrame clientLengthFrame = new ClientLanguageFrame();
		clientLengthFrame.setVisible(true);
		
		// Connect to the server @ localhost, port 2440
		Socket socket = new Socket(InetAddress.getLocalHost(), 2440);
		
		// Update the status of the connection
		clientLengthFrame.updateConnectionStatus(socket.isConnected());
		
		// Read from network
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		
		// Display the current date
		String wordsLength = bufferedReader.readLine();
		clientLengthFrame.updateServerDate(wordsLength);
		
		// Close everything
		bufferedReader.close();
		socket.close();

	}

}