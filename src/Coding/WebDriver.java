package Coding;

public interface WebDriver {
/*
Provide Implementation for the diagram below. Then create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them.


 */
    void open();
    void close();
    String getTitle();

}
interface RemoteWebDriver extends WebDriver,TakesScreenShot{
    void navigate();
}
interface TakesScreenShot{
    void getScreenShot();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open the chrome browser");
    }

    @Override
    public void close() {
        System.out.println("close the chrome browser");
    }

    @Override
    public String getTitle() {
        String title="";
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("navigate by using the chrome browser");
    }

    @Override
    public void getScreenShot() {
        System.out.println("take the screen shot by using the chrome browser");
    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open the firefox browser");
    }

    @Override
    public void close() {
        System.out.println("close the firefox browser");
    }

    @Override
    public String getTitle() {
        String title="";
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("navigate by using the firefox browser");
    }

    @Override
    public void getScreenShot() {
        System.out.println("take the screen shot by using the firefox browser");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open the safari browser");
    }

    @Override
    public void close() {
        System.out.println("close the safari browser");
    }

    @Override
    public String getTitle() {
        String title="";
        return title;

    }

    @Override
    public void navigate() {
        System.out.println("navigate by using the safari browser");
    }

    @Override
    public void getScreenShot() {
        System.out.println("take the screen shot by using the safari browser");
    }
}