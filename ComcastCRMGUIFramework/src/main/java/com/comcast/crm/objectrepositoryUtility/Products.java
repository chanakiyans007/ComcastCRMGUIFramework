package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products {

	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createProductImgBtn;
	
	@FindBy(name="search")
	private WebElement ele4;
}
