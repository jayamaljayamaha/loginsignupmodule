package POS.Backend.LoginSignupModule.Utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PassEncoder implements PasswordEncoder {

    private BCryptPasswordEncoder encoder;

    public PassEncoder(){
        encoder = new BCryptPasswordEncoder(12);
    }

    @Override
    public String encode(CharSequence text) {
        return encoder.encode(text);
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return false;
    }

    public PasswordEncoder passwordEncoder() {
        return encoder;
    }

}
