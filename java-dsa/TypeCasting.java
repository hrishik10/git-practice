class TypeCasting {
    public static void main(String[] args) {

        // type casting
        int a = (int) (123.64f);
        System.out.println(a);
        int cl = 257;
        byte x = (byte) (cl);
        System.out.println(x); // max value a byte can store is 256, so after typecasting remainder is returned
                               // if value is greater than 256, here in this case 257-256 == 1
        // automatic type promotion in expressions
        byte l = 40;
        byte m = 50;
        byte n = 100;
        int dl = (l * m) / n;
        System.out.println(dl); // here 40*50 == 2000, here java is promoting the numbers to int while
                                // performing the arithmetic expression therefore the final value of expression
                                // should be assigned to an int variable only. Otherwise it will give error.
        // Type promotion rules
        // All the byte, short and character are promoted to int
        // if any one of the operands is long, all other operands are also promoted to
        // long. Same for float and double
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        // float + int + double
        System.out.println("Results " + result);

    }
}