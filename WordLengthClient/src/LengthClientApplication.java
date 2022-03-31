import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/**
 * This method launch the frame and manage the connection to the server.
 * 
 * @author firzanahuda
 *
 */

public class LengthClientApplication {

	public static void main(String[] args) throws  IOException {

		// Launch client-side frame
		LengthClientFrame clientTextFrame = new LengthClientFrame();
		clientTextFrame.setVisible(true);

		// Connect to the server @ localhost, port 2340
		Socket socket = new Socket(InetAddress.getLocalHost(), 2340);

		// Update the status of the connection
		clientTextFrame.updateConnectionStatus(socket.isConnected());

		// Read from network
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));

		// Display the current date
		String wordCount = bufferedReader.readLine();
		clientTextFrame.updateWordCount(wordCount);

		// Close everything
		bufferedReader.close();
		socket.close();

	}

}
