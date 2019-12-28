package packone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelCon {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\DELL\\Desktop\\WD8Nov\\output.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Result1", 1);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		
       List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int i;		
		for(i=0; i<links.size(); i++){
			Label l=new Label(0, i, links.get(i).getText());
			ws.addCell(l);
			
		}
		
		
		
		
		wwb.write();wwb.close();
		
		
		
		/*WritableSheet ws1=wwb.createSheet("Result2", 0);
		
		int a=30; int b=50;
		int c=a*b; int d=b-a;
		
		Label l=new Label(0, 0, "C Value is " + c);
		ws.addCell(l);
		Label l1=new Label(0, 5, "D Value is " + d);
		ws1.addCell(l1);*/
		
		
		
		
		
		/*// Creating object to identify the location of excel
		FileInputStream filepath=new FileInputStream("C:\\Users\\DELL\\Desktop\\WD8Nov\\data.xls");
		
		// Open Indentified excel
		Workbook workbookObj=Workbook.getWorkbook(filepath);
		
		// Open Sheet in Opened excel
		Sheet sheetref=workbookObj.getSheet("Sheet1");
		
		int i; int j;
		
		int c=sheetref.getColumns(); int r=sheetref.getRows();
		
		for(i=0; i<c; i++){
			for(j=0; j<r; j++){
				String val=sheetref.getCell(i, j).getContents();
				if(val.equals("kumar")==true)
					System.out.println(i + "-" + j);
			}
		}
		*/
		/*int c=sheetref.getColumns();
		int j;
		for(j=0; j<c; j++){
			System.out.println(sheetref.getCell(j, 0).getContents());
		}*/
		
		/*int r=sheetref.getRows();
		int i;
		
		for(i=0; i<r; i++){
			System.out.println(sheetref.getCell(0, i).getContents());
			
		}*/
		
		
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get(sheetref.getCell(0, 0).getContents());
		driver.manage().window().maximize();
		
		driver.findElement(By.id(sheetref.getCell(0, 1).getContents())).sendKeys(sheetref.getCell(0, 2).getContents());
		driver.findElement(By.id(sheetref.getCell(0, 3).getContents())).sendKeys(sheetref.getCell(0, 4).getContents());*/
		
		
		
		
		
		
		
		
		
		/*// Identify cell in opened sheet and read data from identified cell
		System.out.println(sheetref.getCell(0, 0).getContents());
		System.out.println(sheetref.getCell("B1").getContents());*/
		

	}

}
