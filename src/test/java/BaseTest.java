
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class BaseTest {

    @BeforeTest
    public void Init() {
        DriverManager.driverSetup();
    }

    @AfterTest
    public void closeDriver(){
        //DriverManager.closeDriver();
    }
}
