import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class day1 {

	
        public static void main(String[] args) throws EncryptedDocumentException, IOException {
	

		
        String path = "C:\\Users\\admin\\Desktop\\Book3.xltx";
		
		FileInputStream file = new FileInputStream(path);
		
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
		System.out.println(data);

	
		System.out.println("hello");
		
		
		
		
		
		
		
	}
}
