package com.pluralsight;

public class Main {
    public static void main(String[] args) {

// testing format(firstName, lastName) - simplest method
        System.out.println(NameFormatter.format("Marcus", "Bennett"));
        // expected: Bennett, Marcus

        // testing format(prefix, firstName, middleName, lastName, suffix) - all five parts
        System.out.println(NameFormatter.format("Dr.", "Sofia", "Elena", "Ramirez", "PhD"));
        // expected: Ramirez, Dr. Sofia Elena, PhD

        // testing format with no prefix
        System.out.println(NameFormatter.format("", "Aiden", "James", "Nakamura", "PhD"));
        // expected: Nakamura, Aiden James, PhD

        // testing format with no prefix and no suffix
        System.out.println(NameFormatter.format("", "Layla", "", "Hassan", ""));
        // expected: Hassan, Layla

        // testing format(fullName) - full name string with prefix and suffix
        System.out.println(NameFormatter.format("Dr. Nadia Simone Okafor, PhD"));
        // expected: Foka, Dr. Nadia Simone, PhD

        // testing format(fullName) - full name string with suffix only
        System.out.println(NameFormatter.format("Carlos Andre Petrov, Jr"));
        // expected: Petrov, Carlos Andre, Jr

        // testing format(fullName) - simple first and last name only
        System.out.println(NameFormatter.format("Priya Sharma"));
        // expected: Sharma, Priya

    }
}
