import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

class GetBankDetails {
    void getDetails(){
        try{
            Scanner scanner = new Scanner(System.in);
            println('Enter IFSC code')
            String s = scanner.nextLine()
            if (s.length()!=11){
                println('Invalid IFSC code')
                System.exit(0)
            }
            else {
                s = s.toUpperCase()
                FileInputStream fileInputStream= new FileInputStream(new File('D:\\rbi_provided_ifsc.xlsx'))
                XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream)
                XSSFSheet sheet
                println(s)
                if (s.startsWith('NUC'))
                    sheet = workbook.getSheetAt(1)
                else
                    sheet = workbook.getSheetAt(0)
                for (int i=0; i<sheet.getPhysicalNumberOfRows();i++){
                    Row row = sheet.getRow(i)
                    Cell cell = row.getCell(1)
                    String temp = cell.toString()
                    if (temp.equalsIgnoreCase(s)){
                        print('The Name of the Bank is ' + row.getCell(0))
                        print(', Branch name is ' + row.getCell(3))
                        print(' and the address is ' + row.getCell(4))
                    }
                }
            }
        }
        catch (Exception e){
            println(e)
        }
    }
}