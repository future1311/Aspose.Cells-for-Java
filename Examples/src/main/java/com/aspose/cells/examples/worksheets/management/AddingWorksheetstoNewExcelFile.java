package com.aspose.cells.examples.worksheets.management;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class AddingWorksheetstoNewExcelFile {

	public static void main(String[] args) throws Exception {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingWorksheetstoNewExcelFile.class);

		// Instantiating a Workbook object
		Workbook workbook = new Workbook();

		// Adding a new worksheet to the Workbook object
		WorksheetCollection worksheets = workbook.getWorksheets();

		int sheetIndex = worksheets.add();
		Worksheet worksheet = worksheets.get(sheetIndex);

		// Setting the name of the newly added worksheet
		worksheet.setName("My Worksheet");

		// Saving the Excel file
		workbook.save(dataDir + "output.xls");

		// Print Message
		System.out.println("Sheet added successfully.");
		// ExEnd:1
	}
}
