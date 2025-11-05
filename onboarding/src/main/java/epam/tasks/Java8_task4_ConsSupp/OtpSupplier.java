package epam.tasks.Java8_task4_ConsSupp;

import java.util.*;
import java.util.function.*;

public class OtpSupplier {

	public static void main(String[] args) {

        Supplier<String> otpSupplier = () -> {
            Random random = new Random();
            int otp = 100000 + random.nextInt(900000);
            return String.valueOf(otp);
        };

        System.out.println("Generated OTP: " + otpSupplier.get());
    }
}
