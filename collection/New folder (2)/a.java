import java.io.*;

 public class a {
 public static void main(String[] arguments) {
 try (
 FileInputStream file = new
 FileInputStream("aaa")
 ) {

 boolean eof = false;
 int count = 0;
 while (!eof) {
 int input = file.read();
 if(input==0){
	 input=1;
 }
 System.out.print(input + " ");
 if (input == -1)
 eof = true;
 else
 count++;
 }
 file.close();
 System.out.println("\nBytes read: " + count);
 } catch (IOException e) {
 System.out.println("Error � " + e.toString());
 }
 }
 }