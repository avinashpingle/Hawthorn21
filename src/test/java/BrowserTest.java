import com.testingshastra.uikeywords.Keyword;

public class BrowserTest {
	Keyword kw=new Keyword();
	public void browserSetup()
	{
		String browsername="chrome";
		kw.openBrowser(browsername);
	}

}
