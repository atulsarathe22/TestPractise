public class ClassB extends ClassA {
    ClassB(){
        System.out.println("In CLass B");
    }
    public static void main(String args[]){
        ClassA a=new ClassB();

    }
}
