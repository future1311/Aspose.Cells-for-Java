package com.aspose.cells.examples.formulas;

import com.aspose.cells.DateTime;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class CalculatingFormulasOnce {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CalculatingFormulasOnce.class);
		// Load the template workbook
		Workbook workbook = new Workbook(dataDir + "book1.xls");

		// Print the time before formula calculation
		System.out.println(DateTime.getNow());

		// Set the CreateCalcChain as false
		workbook.getSettings().setCreateCalcChain(false);

		// Calculate the workbook formulas
		workbook.calculateFormula();

		// Print the time after formula calculation
		System.out.println(DateTime.getNow());
	}
}
