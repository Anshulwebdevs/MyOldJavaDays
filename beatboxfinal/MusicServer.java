import java.io.*;
import java.net.*;
import java.util.*;
public class MusicServer{
	ArrayList<ObjectOutputStream> clientOutputStreams;
		public static void main (String[] args){
			new MusicServer().go();
		}
		public class ClientHandler implements Runnable{
		ObjectInputStream in;
		Socket clientSocket;
		public ClientHandler(Socket socket){
			try{
				clientSocket = socket;
	in = new ObjectInputStream(clientSocket.getInputStream());
			}catch(Exception e){e.printStackTrace();}
		}
		public void run() {
		Object b = null;
		Object a = null;
		try{
			while ((a = in.readObject())!= null){
				b = in.readObject();
			System.out.println("read two objects");
			tellEveryone(a,b);
			}
		}catch(Exception e){e.printStackTrace();}
		}
		}
		public void go(){
		clientOutputStreams = new ArrayList<ObjectOutputStream>();
		try{
			ServerSocket serverSock = new ServerSocket(5000);
		while (true){
			Socket clientSocket = serverSock.accept();
			ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
			clientOutputStreams.add(out);
			Thread t = new Thread(new ClientHandler(clientSocket));
			t.start() ;
			System.out.println("qot a connection");
			}
			}catch(Exception e){e.printStackTrace();}
			}
		public void tellEveryone(Object one ,Object two){
			Iterator it = clientOutputStreams.iterator();
			while(it.hasNext()){
			try{
				ObjectOutputStream out = (ObjectOutputStream) it.next();
out.writeObject(one) ;
out.writeObject(two) ;
}catch(Exception ex) {ex.printStackTrace();
			}
		}
		}
}