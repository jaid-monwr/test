package jaid.securecapita.utils;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import static com.twilio.rest.api.v2010.account.Message.creator;

public class SmsUtils {
    public static final String FROM_NUMBER = "+8801781737438";
    public static final String SID_KEY = "AC51e67d3572593e738864cd3167cfbd5c";
    public static final String TOKEN_KEY = "3f7c2dbb273e131ac41d545547376529";

    public static void sendSMS(String to, String messageBody) {
        Twilio.init(SID_KEY, TOKEN_KEY);
        Message message = creator(new PhoneNumber("+88" + to), new PhoneNumber(FROM_NUMBER), messageBody).create();
        System.out.println(message);
    }
}
