package com.aspose.cells.examples.articles;

import com.aspose.cells.PdfSaveOptions;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class LimitNumberofPagesGenerated {
	public static void main(String[] args) throws Exception {
		// ExStart:LimitNumberofPagesGenerated
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(LimitNumberofPagesGenerated.class);
		// Open an Excel file
		Workbook wb = new Workbook(dataDir + "TestBook.xlsx");
		// Instantiate the PdfSaveOption
		PdfSaveOptions options = new PdfSaveOptions();

		// Print only Page 3 and Page 4 in the output PDF
		// Starting page index (0-based index)
		options.setPageIndex(2);
		// Number of pages to be printed
		options.setPageCount(2);

		// Save the PDF file
		wb.save(dataDir + "outPDF1.pdf", options);
		// ExEnd:LimitNumberofPagesGenerated
	}
}
