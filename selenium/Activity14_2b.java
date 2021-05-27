package SeleniumActivites;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity14_2b {
	
	public List<List<String>> readExcel(String filePath) {
		
        List<List<String>> data = new ArrayList<List<String>>();
	
        try {
	
            FileInputStream file = new FileInputStream(filePath);
	
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            
            XSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();
	
            while(rowIterator.hasNext()) {

                List<String> rowData = new ArrayList<String>();
	
                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();
	
                while (cellIterator.hasNext()) {
	
                    Cell cell = cellIterator.next();
	
                    if(row.getLastCellNum() == 5) {

                        rowData.add(cell.getStringCellValue());
	
                    }
	
                }
                data.add(rowData);
	
            }
	
            file.close();
	
            workbook.close();
	
        }
	
        catch (Exception e) {
	
            e.printStackTrace();
	
        }
	
        return data;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}