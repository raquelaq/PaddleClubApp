package org.ulpgc.is1.model;

public class NIF {
    public String number;

    public boolean isValid() {

        if (number.length() != 9) {
            return false;
        }

        // Los primeros siete digitos deben ser números, el último una letra
        String digits = number.substring(0, 8);
        char letter = number.charAt(8);

        try {
            // Parsear los dígitos como número (convertir la string a un número entero)
            int nifNumber = Integer.parseInt(digits);

            char[] validLetters = "TRWAGMYFPDXBNJZSQVHLCK3".toCharArray();
            char calculatedLetter = validLetters[nifNumber % 23];

            // Devolver si es T o F que coincide la letra calculada con la del DNI proporcionado
            return letter == calculatedLetter;

        } catch (NumberFormatException e) {
            return false;
        }
    }
}
