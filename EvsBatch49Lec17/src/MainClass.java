import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// IO streams - input output

		File file = new File("input.txt");
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		// Buffered -> read + load ???
		// 2 types -> byte buffer -> byte 8 bits
		//         -> character buffer -> fastest // character 
		
		// buffer character read
//		char[] data = new char[(int)file.length()];
//		
//		try(BufferedReader read = new BufferedReader(new FileReader(file))){
//			read.read(data);
//			System.out.println(String.valueOf(data));
//		}  catch (IOException e) {
//			e.printStackTrace();
//		}
//		String data = "Hi there everyone!!! \n";
//		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
//		   writer.write(data.toCharArray());
//		   writer.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		//Byte buffer read
//		byte []data = new byte[(int)file.length()];
//		try(BufferedInputStream bufferedInputStream = 
//				new BufferedInputStream(new FileInputStream(file))){
//			bufferedInputStream.read(data);
//			for(byte d:data)
//				System.out.print((char)d);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// Byte buffer write
//		String data = "Hi there everyone !!!\n";
//		try(BufferedOutputStream outputStream =
//				new BufferedOutputStream(new FileOutputStream(file, true))) {
//			outputStream.write(data.getBytes());
//			outputStream.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		// Character stream 1 char 2 byte - 16 bits (one time 16 bits read)
//		char data [] = new char [(int) file.length()];
//		try(FileReader reader = new FileReader(file)) {
//			reader.read(data);
//			System.out.println(String.valueOf(data));
//		}  catch (IOException e) {
//			e.printStackTrace();
//		} 
//		String data = "Hi there everyone!!! \n";
//		try(FileWriter writer = new FileWriter(file, true)) {
//			writer.write(data.toCharArray());
//			writer.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		
		// byte streams -> byte data - 8bits
		// input
//		byte[] data = new byte[(int)file.length()];
//		try(FileInputStream inputStream = new FileInputStream(file)) {
//			inputStream.read(data);
//			for(byte d : data)
//				System.out.print((char)d);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		
		// write
//		String data = "Hi there everyone!!! \n";
//		
//		try(FileOutputStream outputStream = new FileOutputStream(file, true)) {
//			outputStream.write(data.getBytes());
//			outputStream.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		

		// standard IO streams
		// input

//		Scanner scanner = new Scanner(System.in);
//		// output
//		try {
//		System.out.print("Please Enter a number : ");
//		int number = scanner.nextInt();
//		System.out.println("The number you enter is = "+number);
//		} catch(InputMismatchException e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("closing scanner!!");
//			scanner.close();			
//		}
	}
}
