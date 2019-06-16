public class MyClass {
    public static void main(String args[]) {
        for (int lambda=1;lambda<10;lambda++){
            for (int sigma=1;sigma<10;sigma++){
                for (int gamma=1;gamma<10;gamma++){
                    if(((10*lambda+sigma)*gamma)==111*lambda){
                        System.out.println("lambda = " + lambda+"; sigma = "+sigma+"; gamma = "+gamma);
                    }
                }
            }
        }
    }
}
