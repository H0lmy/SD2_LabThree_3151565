public class Conversions {

    public double euroToDollar(double euro) {
        return euro>0 ? euro * 1.1 : 0;
    }

    public double dollarToEuro(double dollar) {
        return dollar>0 ? dollar * 0.9 : 0;
    }

    public int stringToInteger(String val) {
        return val != null && !val.isEmpty() ? Integer.parseInt(val) : 0;
    }

    public String integerToString(int val) {
        return null;
    }

    public String switchCase(){
        return null;
    }








}
