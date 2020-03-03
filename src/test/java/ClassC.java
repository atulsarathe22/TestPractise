public class ClassC extends ClassB {
    ClassC(String name){
        System.out.println("In Class C");
        System.out.println(name);
    }

    public static void main(String args[]){
        ClassC c=new ClassC("Atul");
    }
}
