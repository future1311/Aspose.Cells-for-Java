package com.aspose.cells.examples.articles;

import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class CheckVBAProjectInWorkbookIsSigned {
	public static void main(String[] args) throws Exception {
		// ExStart:CheckVBAProjectInWorkbookIsSigned
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CheckVBAProjectInWorkbookIsSigned.class);
		Workbook workbook = new Workbook(dataDir + "source.xlsm");
		System.out.println("VBA Project is Signed: " + workbook.getVbaProject().isSigned());

		// ExEnd:CheckVBAProjectInWorkbookIsSigned
	}
}
