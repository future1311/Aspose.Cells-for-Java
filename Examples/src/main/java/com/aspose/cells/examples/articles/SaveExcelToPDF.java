package com.aspose.cells.examples.articles;

import com.aspose.cells.PdfOptimizationType;
import com.aspose.cells.PdfSaveOptions;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class SaveExcelToPDF {
	public static void main(String[] args) throws Exception {
		// ExStart:SaveExcelToPDF
		String dataDir = Utils.getDataDir(SaveExcelToPDF.class);
		// Load excel file into workbook object
		Workbook workbook = new Workbook(dataDir + "sample.xlsx");
		// Save into Pdf with Minimum size
		PdfSaveOptions opts = new PdfSaveOptions();
		opts.setOptimizationType(PdfOptimizationType.MINIMUM_SIZE);
		workbook.save(dataDir + "output.pdf", opts);
		// ExEnd:SaveExcelToPDF
	}
}
