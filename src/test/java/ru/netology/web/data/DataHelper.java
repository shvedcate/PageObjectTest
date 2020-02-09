package ru.netology.web.data;
import lombok.Value;
import ru.netology.web.page.CardChoosePage;
import java.util.Random;

public class DataHelper {

    private DataHelper() { }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {

        return new AuthInfo("vasya", "qwerty123");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {

        return new VerificationCode("12345");
    }
}