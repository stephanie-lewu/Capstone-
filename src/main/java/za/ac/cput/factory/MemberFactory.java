package za.ac.cput.factory;

import za.ac.cput.domain.Member;
import za.ac.cput.util.Helper;
import java.util.UUID;

public class MemberFactory {

    public static Member createMember(String memberId, String name, String licenseNumber, int phoneNumber, String accountStatus) {
        // Validation check using Helper
        if (Helper.isNullOrEmpty(memberId) ||
                Helper.isNullOrEmpty(name) ||
                Helper.isNullOrEmpty(licenseNumber) ||
                Helper.isNullOrEmpty(accountStatus)) {
            return null;
        }

        // Return a new Member using the Builder pattern from your Domain class
        return new Member.Builder()
                .setMemberId(memberId)
                .setName(name)
                .setLicenseNumber(licenseNumber)
                .setPhoneNumber(phoneNumber)
                .setAccountStatus(accountStatus)
                .build();
    }

    // Overloaded method: Generates the ID automatically if you don't want to pass it
    public static Member createMember(String name, String licenseNumber, int phoneNumber, String accountStatus) {
        String memberId = UUID.randomUUID().toString(); // Generates a unique ID

        return createMember(memberId, name, licenseNumber, phoneNumber, accountStatus);
    }
}