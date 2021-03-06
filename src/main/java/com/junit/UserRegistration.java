package com.junit;

import java.util.regex.Pattern;

public class UserRegistration {
    public String firstName = "^[A-Z][a-z]{2,}$";
    public String lastName = "^[A-Z][a-z]{2,}$";
    public String email = "^[a-z0-9_+-]+((\\.)[a-z0-9]+)?(\\@)[a-z0-9]+(\\.)[a-z]{2,4}((\\.)[a-z]{2,4})?$";
    public String phoneNumber = "^[1-9][0-9]{0,2} [1-9][0-9]{9}$";
    public String password = "^(?=.*[A-Z])(?=.*\\d)(?=[a-zA-Z0-9]*[@$#%^&!?][a-zA-Z0-9]*$)[a-zA-Z0-9!@#$^&*]{8,}$";

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-z0-9_+-]+((\\.)[a-z0-9]+)?(\\@)[a-z0-9]+(\\.)[a-z]{2,4}((\\.)[a-z]{2,4})?$");
        return pattern.matcher(email).matches();
    }

}
