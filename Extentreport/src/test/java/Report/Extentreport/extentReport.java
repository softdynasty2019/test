package Report.Extentreport;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport {
	ExtentReports extent;
	
	
	@BeforeTest
	public void config() {
		
	//ExtentReport //ExtentSpearkReport
		
		
		String path=System.getProperty("user.dir")+"\\report\\testRepot.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Facebook Login Test Report");
		
		reporter.config().setDocumentTitle("Test Result");
		
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Tester Name", "Taher");
		
		
	}
	

	
@Test
public void facebookLogin() {
	ExtentTest test=extent.createTest("facebookLogin");
	
	System.out.println("Login Facebook");
	extent.flush();
	
}
@Test	
public void facebookLogout() {
	ExtentTest test=extent.createTest("facebookLogout");
	
	System.out.println("logout Facebook");
	test.fail("This Test Fail");
	
	extent.flush();
}
	
	

}
