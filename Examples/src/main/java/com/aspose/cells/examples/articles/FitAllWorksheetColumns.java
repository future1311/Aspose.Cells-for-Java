package com.aspose.cells.examples.articles;

import com.aspose.cells.PdfSaveOptions;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class FitAllWorksheetColumns {
	public static void main(String[] args) throws Exception {
		// ExStart:FitAllWorksheetColumns
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(FitAllWorksheetColumns.class);
		// Create and initialize an instance of Workbook
		Workbook book = new Workbook(dataDir + "TestBook.xlsx");
		// Create and initialize an instance of PdfSaveOptions
		PdfSaveOptions saveOptions = new PdfSaveOptions(SaveFormat.PDF);
		// Set AllColumnsInOnePagePerSheet to true
		saveOptions.setAllColumnsInOnePagePerSheet(true);
		// Save Workbook to PDF fromart by passing the object of PdfSaveOptions
		book.save(dataDir + "output.pdf", saveOptions);
		// ExEnd:FitAllWorksheetColumns
	}
}
