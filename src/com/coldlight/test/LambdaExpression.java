package com.coldlight.test;

public class LambdaExpression {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        /*
         * System.out.println(engine((a,b)->a+b, x, y));
         * 
         * System.out.println(engine((a,b)->a*b,x,y));
         */

        /*
         * Function<Integer,Integer> func = k->k*2;
         * 
         * System.out.println(func.apply(5));
         */

        /*
         * Runnable runn =() -> {System.out.println("Hello");};
         * 
         * runn.run();
         */

        /*
         * Consumer<Object> cons = (name) -> {System.out.println("Hello : "+name);};
         * 
         * cons.accept("Vikram");
         */

        IDummyFunctional dummyprint = () -> {
            System.out.println("Print Dummy");
        };

        dummyprint.print();
    }

    public static Integer engine(Calculator calculator, int x, int y) {
        return calculator.calculate(x, y);
    }

}
