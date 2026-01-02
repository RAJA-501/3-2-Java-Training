class DataType {
    
    private static int number;
    private static int salary;

    public static void main(String[] args) {
        //Primitive datatype
        String Name="Raja";
        System.err.println("Name: "+Name);
        int age=20;
        System.out.println("age: " + age);
        boolean isActive=true;
        System.out.println(""+isActive);

        char grade = 'A';
        System.out.println(grade);
        String Address= "hyderabad";
        System.err.println("Address: "+Address);

        //initialization 

        number=100;
        salary=500000;
        System.err.println(number);
        System.err.println(salary);

        //type casting
        //1)implict type casting
        //2)explict type casting
        int a=10;
        double d=a;
        
        System.err.println(d);


    }
}
