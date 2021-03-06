package com.aspose.cells.examples.articles;

import com.aspose.cells.Cells;
import com.aspose.cells.Picture;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class InsertPictureCellReference {
	public static void main(String[] args) throws Exception {
		// ExStart:InsertPictureCellReference
		String dataDir = Utils.getDataDir(InsertPictureCellReference.class);

		// Instantiate a new Workbook
		Workbook workbook = new Workbook();

		// Get the first worksheet's cells collection
		Cells cells = workbook.getWorksheets().get(0).getCells();

		// Add string values to the cells
		cells.get("A1").putValue("A1");
		cells.get("C10").putValue("C10");

		// Add a blank picture to the D1 cell
		Picture pic = (Picture) workbook.getWorksheets().get(0).getShapes().addPicture(0, 3, null, 10, 10);

		// Set the size of the picture.
		pic.setHeightCM(4.48);
		pic.setWidthCM(5.28);

		// Specify the formula that refers to the source range of cells
		pic.setFormula("A1:C10");

		// Update the shapes selected value in the worksheet
		workbook.getWorksheets().get(0).getShapes().updateSelectedValue();

		// Save the Excel file.
		workbook.save(dataDir + "referencedpicture.xlsx");
		// ExEnd:InsertPictureCellReference
	}
}
