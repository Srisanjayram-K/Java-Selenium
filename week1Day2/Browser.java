package week1Day2;

public class Browser { 
	public void lanchBrowser() {
		System.out.println("browser lanched successfully");
	}
	public void loadUrl() {
		System.out.println("url loaded successfully");
	}
public static void main(String[]arg) {
	Browser obj = new Browser();
	obj.lanchBrowser();
	obj.loadUrl();
   }
}
