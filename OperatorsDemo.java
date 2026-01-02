public class OperatorsDemo {
    public static void main(String[] args) {
        //Arithmetic operations
        //addition
            int a,b;
            a=10;
            b=20;
            int c=a+b;
            System.out.println("sum of two integer :"+c);
            //substration 
            int d=a-b;
            System.out.println("sub of two integer :"+d);
            //multiplication
            int e=a*b;
            System.out.println("multiple of two integer :"+e);
            //dividing
            int f=a/b;
            System.out.println("division of two integer :"+f);

            int t =a+b*c/e+d;
                System.out.println("solution :"+t);
                
                //Relation operators
                System.out.println(a<b);//output is true or false

                //logical operators
                // it is used to combine conditions
                int age=20;
                boolean hasId=true;
                 System.out.println(age>=18 & hasId);

                 System.out.println(!hasId);
                 //Assignment operators

                 // =,+=,-=,*=,/=
                 a=a+30;
                 System.out.println(a);
                 //
    }
}
