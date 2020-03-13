package com.perficient.baseclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.perficient.util.DatabaseUtil;
import com.perficient.util.ExcelReader;
import com.perficient.util.FTPTransfer;
import com.perficient.util.PageManager;
import com.perficient.util.PageObject;

public class AzureDevops extends PageObject

{
	public static String TITLE1 = "Welcome to Jenkins";
	
	
	@FindBy(xpath = "//h1[text()='Happy Holi Again and Again']")
	public WebElement TestTarget;

	public AzureDevops(PageManager pm, DatabaseUtil db, ExcelReader xl, FTPTransfer ftp) {
		super(pm, db, xl, ftp);
		// TODO Auto-generated constructor stub
	}
	
	public void open(String url) {
		
		pageManager.maximizeBrowser();
		pageManager.navigate(url);
		
	}
	
	public void testMethod()
	{
		
		String Text = pageManager.getText(TestTarget);
		System.out.println(Text);
	}

	
}
