public class MethodsDemo2 {

    int classLevelVariable = 4;

    void method() {
        System.out.println(classLevelVariable);
    }

    public static void main(String[] args) {
        MethodsDemo2 obj = new MethodsDemo2();
        obj.method();
        System.out.println(obj.classLevelVariable);
    }
}
