import java.io.*;
class gui{
	public static void main(String[] args){
		try{
			FileReader file=new FileReader("foo.txt");
			BufferedReader read = new BufferedReader(file);
			String s;
			while((s=read.readLine())!=null)
			{
				
				System.out.println(""+s+s);
			}
			read.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}