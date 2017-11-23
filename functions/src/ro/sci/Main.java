package ro.sci;

import ro.sci.controller.CauciucController;
import ro.sci.controller.LoginController;
import ro.sci.domain.Cauciuc;
import ro.sci.domain.CauciucRequest;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.User;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("gigi", "alegeoaia");

        User result = loginController.handleLoginRequest(loginRequest);

        if (result != null) {
            System.out.println("autentificare cu succes");
        }else {
            System.out.println("mai incearca " + loginRequest.loginName);

        }
        CauciucController cauciucController = new CauciucController();

        CauciucRequest cauciucRequest = new CauciucRequest(205,55,16,true,"continental");

        Cauciuc resultCauciu = cauciucController.handleCauciuRequest(cauciucRequest);

        if (resultCauciu != null ) {
            System.out.println("gasit cu succes");
        }else {
            System.out.println("mai incearca ");


        }

    }
}
