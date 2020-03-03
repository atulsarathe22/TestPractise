import java.lang.String;

public class TestPractiseImplementation {
    public void makeFirstCapital(String a){
        String[] toCheck=a.split(" ");
        String result="";
        for(int i=0;i<toCheck.length;i++){
            String word=toCheck[i];
            result=result+word.substring(0,1).toUpperCase()+word.substring(1)+" ";
        }
        System.out.println(result.trim());
    }

    public void reverseAtPlace(String a){
        String[] toCheck=a.split(" ");
        String finalResult="";
        for(String result:toCheck){
            for(int i=result.length()-1;i>=0;i--){
                finalResult=finalResult+result.charAt(i);
            }
            finalResult=finalResult+" ";
        }
        System.out.println(finalResult.trim());
    }

    public void generateRandomString(int n){
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb= new StringBuilder(n);

        for(int i=0;i<n;i++){
            int index= (int)(AlphaNumericString.length()* Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        System.out.println(sb.toString());
    }

    public void checkPrime(int n){
        if (n == 1) {
            System.out.println("prime");
        } else if (n == 2) {
            System.out.println("prime");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("not prime");
                    break;
                } else {
                    System.out.println("prime");
                    break;
                }
            }
        }
    }
}
