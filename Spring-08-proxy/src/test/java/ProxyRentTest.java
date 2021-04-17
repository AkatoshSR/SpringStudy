import com.sqx.demo01.Client.Client1;
import com.sqx.demo01.Host.Host1;
import com.sqx.demo01.Proxy;

public class ProxyRentTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Client1(), new Host1());
        proxy.RentHouse();
    }
}
