import com.sqx.intermediary.Client.Client1;
import com.sqx.intermediary.Host.Host1;
import com.sqx.intermediary.Proxy;

public class ProxyRentTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Client1(), new Host1());
        proxy.RentHouse();
    }
}
