package application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
	@FXML private TextField txtMessage, txtKey, txtResult;
	@FXML private Button btn1,btn2;
	

	public void Encryption(Event e) {
	    String encryptedMessage = "";
		char ch;
		String message = txtMessage.getText();
		int key = Integer.parseInt(txtKey.getText());
 
		for(int i = 0; i < message.length(); ++i){
			ch = message.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch + key);
	            
	            if(ch > 'z'){
	                ch = (char)(ch - 'z' + 'a' - 1);
	            }
	            
	            encryptedMessage += ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch + key);
	            
	            if(ch > 'Z'){
	                ch = (char)(ch - 'Z' + 'A' - 1);
	            }
	            
	            encryptedMessage += ch;
	        }
	        else {
	        	encryptedMessage += ch;
	        }
		}
		txtResult.setText(encryptedMessage);
	}
	

	public void Decryption(Event e) {
		String decryptedMessage = "";
		char ch;
		String message = txtMessage.getText();
		int key = Integer.parseInt(txtKey.getText());
		
		for(int i = 0; i < message.length(); ++i){
			ch = message.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch - key);
	            
	            if(ch < 'a'){
	                ch = (char)(ch + 'z' - 'a' + 1);
	            }
	            
	            decryptedMessage += ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch - key);
	            
	            if(ch < 'A'){
	                ch = (char)(ch + 'Z' - 'A' + 1);
	            }
	            
	            decryptedMessage += ch;
	        }
	        else {
	        	decryptedMessage += ch;
	        }
		}
		
	
		txtResult.setText(decryptedMessage);
	}
}
	
	

	

