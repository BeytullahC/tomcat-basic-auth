package auth.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by BeytullahC on 04.03.2015.
 */


@WebService(serviceName = "AuthWs")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class AuthTest {

    @WebMethod
    public String test() {
        return "TEST OK";
    }

}
