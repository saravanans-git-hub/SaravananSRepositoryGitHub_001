package com.OrangeHrm.runnerScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

//import com.OrangeHrm.excelGenericScripts.ReadExcel;
import com.OrangeHrm.genericScripts.BasePage;

public class TC01_VerifyAddEmp extends BasePage
{
	@Test
	public void VerifyAddEmp()
	{
		String ExpectedMsg = "Add Employee";
		home_page.PIM_Button().click();
		home_page.AddEmp_button().click();
		String ActualMsg = home_page.AddEmp_Msg().getText();
		System.out.println(ActualMsg);
		Assert.assertEquals(ActualMsg, ExpectedMsg);	
		//Assert.fail();
	}
	
	/*
	 * @Test public void CreateEmp() throws Exception { String fn =
	 * ReadExcel.ReadData("Sheet1", 1, 0); String mn = ReadExcel.ReadData("Sheet1",
	 * 1, 1); String ln = ReadExcel.ReadData("Sheet1", 1, 2);
	 * hp.PIM_Button().click(); hp.AddEmp_button().click(); hp.FNtf().sendKeys(fn);
	 * hp.MNtf().sendKeys(mn); hp.LNtf().sendKeys(ln); hp.save().click(); }
	 */
}