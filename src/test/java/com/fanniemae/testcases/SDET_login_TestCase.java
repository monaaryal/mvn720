package com.fanniemae.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import com.fanniemae.base.TestBase;



public class SDET_login_TestCase extends TestBase {

	//String DBDataInlocalArray[][]=null;
	//int numofRows =0;
	@Test
	public void tc_loginTestCase(){
		 click("xpath_loginBtn");
		 type("xpath User", "monaaryal");
				 type("id_pwd","Maya@123"); 
		 click("Id_BottonLoginbutton");
		 Assert.assertEquals("","");
		
	}

 


@Test(enabled =false)
public void tc_NewAccountTestcase(){
	
	
}	
}