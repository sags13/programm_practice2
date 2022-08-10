package src.testPack;


//cls for excel sheet value getting in code with this exception handleing
public class expt {
	public static String excelSheet() {
		try
		{
			data= getStringCellValue();
		}
		
		catch(xyz e)
		{
			double value= getNumericCellValue();
			data = double to String
		}
		catch (Exception z)
		{
			System.out.println("general error");
			
		}
		return data;
	}

}
