package com.aspose.cells.examples.worksheets.security.protecting;

import com.aspose.cells.*;

import com.aspose.cells.examples.Utils;

public class ProtectingWorksheet {

	public static void main(String[] args) throws Exception {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ProtectingWorksheet.class);

		// Instantiating a Excel object by excel file path
		Workbook excel = new Workbook(dataDir + "book1.xls");

		// Accessing the first worksheet in the Excel file
		WorksheetCollection worksheets = excel.getWorksheets();
		Worksheet worksheet = worksheets.get(0);

		Protection protection = worksheet.getProtection();

		// The following 3 methods are only for Excel 2000 and earlier formats
		protection.setAllowEditingContent(false);
		protection.setAllowEditingObject(false);
		protection.setAllowEditingScenario(false);

		// Protects the first worksheet with a password "1234"
		protection.setPassword("1234");

		// Saving the modified Excel file in default format
		excel.save(dataDir + "output.xls");

		// Print Message
		System.out.println("Sheet protected successfully.");
		// ExEnd:1
	}
}
