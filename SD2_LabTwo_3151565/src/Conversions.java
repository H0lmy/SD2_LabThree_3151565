public class Conversions {

    public double euroToDollar(double euro) {
        return euro > 0 ? euro * 1.1 : 0;
    }

    public double dollarToEuro(double dollar) {
        return dollar > 0 ? dollar * 0.9 : 0;
    }

    public int stringToInteger(String val) {
        return val != null && !val.isEmpty() ? Integer.parseInt(val) : 0;
    }

    public String integerToString(int val) {
        return String.valueOf(val);
    }

    public String switchCase(String val) {
        if (val == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < val.length(); i++) {
            char c = val.charAt(i);
            if (!Character.isLetter(c)) {
                result.append(c);
                continue;
            }
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }

        }
        return result.toString();
    }
}
