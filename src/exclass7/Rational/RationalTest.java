package exclass7.Rational;

public class RationalTest {

    public static void main(String[] args) {
        Rational r1 = new Rational(-1, 3);
        Rational r2 = new Rational(1, -2);

        System.out.println("Simple Op :");
        System.out.println(" add: " + r1.add(r2));
        System.out.println(" sub: " + r1.sub(r2));
        System.out.println(" mul: " + r1.mul(r2));
        System.out.println(" div: " + r1.div(r2));
        System.out.println(" reverse: " + r1.reverse());

        System.out.println("- - - - - - - - -\nConvert :");

        System.out.println(" " + convert("1/2*1/4*1/8+1/4"));




        System.out.println(" " + convert("50/63+8/5+750/323+9/1"));

        System.out.println("- - - - - - - - -\nConvertP :");
        System.out.println(" " + convertP("1/1-(1/2*2/3+2/6)+1/6*(4/8-1/4)"));

    }

    public static Rational convert(String str) {
        int start = 0;
        Rational[] rationals = new Rational[str.length()];
        String[] operation = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (isOperation(str.charAt(i))) {
                rationals[i] = makeRational(str.substring(start, i));
                operation[i] = String.valueOf(str.charAt(i));
                start = i + 1;
            } else if (i == str.length() - 1)
                rationals[i] = makeRational(str.substring(start));
        }

        return calculation(deleteNullRational(rationals), deleteNullOperation(operation));
    }

    public static Rational convertP(String str) {
        StringBuilder finalStr = new StringBuilder();
        int start;
        int end;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                start = i + 1;
                end = start;

                while (str.charAt(end) != ')')
                    end++;

                finalStr.append(convert(str.substring(start, end)));
                i = end + 1;
            }
            if (i != str.length())
                finalStr.append(str.charAt(i));

        }
        return convert(finalStr.toString());
    }

    private static boolean isOperation(char c) {
/*        if (c == '+' || c == '-' || c == '*' || c == ':')
            return true;
        return false;*/
        return c == '+' || c == '-' || c == '*' || c == ':';
    }

    private static Rational makeRational(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '/')
                return new Rational(Integer.parseInt(str.substring(0, i)), Integer.parseInt(str.substring(i + 1)));
        }
        return null;
    }

    private static Rational[] deleteNullRational(Rational[] rationals) {
        int lenght = 0;

        for (Rational r : rationals)
            if (r != null)
                lenght++;

        Rational[] finalRational = new Rational[lenght];
        int counter = 0;

        for (Rational rational : rationals) {
            if (rational != null) {
                finalRational[counter] = rational;
                counter++;
            }
        }
        return finalRational;
    }

    private static String[] deleteNullOperation(String[] operation) {
        int lenght = 0;

        for (String s : operation)
            if (s != null)
                lenght++;

        String[] finalOperation = new String[lenght];
        int counter = 0;

        for (String s : operation) {
            if (s != null) {
                finalOperation[counter] = s;
                counter++;
            }
        }
        return finalOperation;
    }

    private static Rational calculation(Rational[] rationals, String[] operation) {
        int opNumber = operation.length;
        int counter = 0;

        for (int i = 0; i < opNumber; i++) {
            if (operation[counter].equals("*") || operation[counter].equals(":")) {
                if (operation[counter].equals("*"))
                    rationals[counter] = rationals[counter].mul(rationals[counter + 1]);
                else if (operation[counter].equals(":"))
                    rationals[counter] = rationals[counter].div(rationals[counter + 1]);

                rationals = deleteRationals(rationals, counter + 1);
                operation = deleteOperation(operation, counter);
                counter--;
            }
            counter++;
        }
        return finalCalculation(rationals, operation);
    }

    private static Rational finalCalculation(Rational[] rationals, String[] operation) {
        Rational finalR = rationals[0];

        for (int i = 0; i < operation.length; i++) {
            if (operation[i].equals("+")) {
                finalR = finalR.add(rationals[i + 1]);
            } else if (operation[i].equals("-")) {
                finalR = finalR.sub(rationals[i + 1]);
            }
        }
        return finalR;
    }

    private static Rational[] deleteRationals(Rational[] rationals, int index) {
        Rational[] newRational = new Rational[rationals.length - 1];
        int counter = 0;

        for (int i = 0; i < rationals.length; i++) {
            if (i != index) {
                newRational[counter] = rationals[i];
                counter++;
            }
        }
        return newRational;
    }

    private static String[] deleteOperation(String[] operation, int index) {
        String[] newOp = new String[operation.length - 1];
        int counter = 0;

        for (int i = 0; i < operation.length; i++) {
            if (i != index) {
                newOp[counter] = operation[i];
                counter++;
            }
        }
        return newOp;
    }
}
