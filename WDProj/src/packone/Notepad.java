package packone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Notepad {

	public static void main(String[] args) throws Exception{
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Value");
		int a=s.nextInt();
		System.out.println("Enter B Value");
		int b=s.nextInt();
		System.out.println(a*b);
		
		WebDriver driver=new FirefoxDriver();
		System.out.println("Enter URL");
		String u=s.next();
		driver.get(u);
		System.out.println("Enter Email Value");
		String emailvalue=s.next();
		driver.findElement(By.id("email")).sendKeys(emailvalue);
		System.out.println("Enter Password Value");
		String passwordvalue=s.next();
		driver.findElement(By.id("pass")).sendKeys(passwordvalue);
		
		
		
		/*FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\WD8Nov\\1222.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi This is Kishore");
		bw.newLine();
		bw.write("This is Selenium");
		bw.close();*/
		
		/*FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\WD8Nov\\123.txt");
		
		BufferedReader b=new BufferedReader(f);
		
		String s;
		
		while((s=b.readLine())!=null){
			String[] c=s.split(" ");
			System.out.println(c[2]);
		}*/
		
		
		//System.out.println(b.readLine());

	}

}
