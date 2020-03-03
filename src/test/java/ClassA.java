import org.testng.annotations.Test;

public class ClassA {
    int x=10;
    int y=20;

    @Test
    void test1(){
       // testResult(x,y);
        test2(5,10);
    }

    @Test
    public  void testResult(int x, int y){
        this.x=y;
        this.y=x;
        System.out.println(this.x);
        System.out.println(this.y);
    }

    public void test2(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
