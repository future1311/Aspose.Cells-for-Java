package com.aspose.cells.examples.articles;

import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class DisableCompatibilityChecker {
	public static void main(String[] args) throws Exception {
		// ExStart:DisableCompatibilityChecker
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(DisableCompatibilityChecker.class);
		// Open a template file
		Workbook workbook = new Workbook(dataDir + "sample.xlsx");

		// Disable the compatibility checker
		workbook.getSettings().setCheckComptiliblity(false);

		// Saving the Excel file
		workbook.save(dataDir + "outCompCheck.xls");
		// ExEnd:DisableCompatibilityChecker
	}
}
