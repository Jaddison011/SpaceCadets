import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UidToName {
	//Get UserID
	public static void main(String[] args) throws IOException {
		BufferedReader buffread= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter User ID:\n");
		String uid;
		uid = buffread.readLine();
	//Constructing the URL
	URL profile = new URL("https://www.ecs.soton.ac.uk/people/"+uid);
	BufferedReader in = new BufferedReader( new InputStreamReader(profile.openStream()));
	String input;
	input = in.readLine();
	int start;
	int end;
	while(input != null) {
		input = in.readLine();
		start = input.indexOf("<title>");
		end = input.indexOf("|");
		if(start > 1){
			System.out.println(input.substring(start+7,end));
		}
	}
	in.close();
	}	
}
