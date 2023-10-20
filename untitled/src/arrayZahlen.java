public class arrayZahlen {

    public static int[] sum(int[] zahl1, int[] zahl2) {
        int[] result = new int[zahl1.length + 1];
        int carry = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int sum = zahl1[i] + zahl2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;
        return result;
    }

    public static int[] sub(int[] zahl1, int[] zahl2) {
        int[] result = new int[zahl1.length];
        int borrow = 0;
        boolean isNegative = false;

        // Check if zahl1 is smaller than zahl2
        for (int i = 0; i < zahl1.length; i++) {
            if (zahl1[i] < zahl2[i]) {
                isNegative = true;
                break;
            } else if (zahl1[i] > zahl2[i]) {
                break;
            }
        }

        // Swap arrays if zahl1 is smaller than zahl2
        if (isNegative) {
            int[] temp = zahl1;
            zahl1 = zahl2;
            zahl2 = temp;
        }

        for (int i = zahl1.length - 1; i >= 0; i--) {
            int diff = zahl1[i] - zahl2[i] - borrow;

            if (diff < 0) {
                diff += 10; // Borrow from the next digit
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = diff;
        }

        if (isNegative) {
            result[0] = -result[0];
        }

        return result;
    }
    public static int[] mul(int[] array, int digit) {
        if (digit < 0 || digit > 9) {
            throw new IllegalArgumentException("The digit must be between 0 and 9.");
        }

        int[] result = new int[array.length];
        int carry = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            int product = array[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        // If there's a carry after all multiplications, extend the result array
        if (carry > 0) {
            int[] extendedResult = new int[array.length + 1];
            extendedResult[0] = carry;
            System.arraycopy(result, 0, extendedResult, 1, array.length);
            result = extendedResult;
        }

        return result;
    }

    public static int[] div(int[] array, int digit) {
        if (digit <= 0 || digit > 9) {
            throw new IllegalArgumentException("The digit must be between 1 and 9.");
        }

        int[] result = new int[array.length];
        int remainder = 0;

        for (int i = 0; i < array.length; i++) {
            int dividend = array[i] + remainder * 10;
            result[i] = dividend / digit;
            remainder = dividend % digit;
        }

        // Handle the remainder if there's a non-zero remainder
        if (remainder != 0) {
            int[] extendedResult = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                extendedResult[i] = result[i];
            }
            extendedResult[array.length] = remainder;
            result = extendedResult;
        }

        return result;
    }
}
