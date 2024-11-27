package Test.Program;

public class FactorialNumber {
	public static void main(String[] args) {
		int num=5;
		int factorial=1;
//		if(num==0){
//            System.out.println(factorial);
//		}else {
//            for(int i=1;i<=num;i++){
//                factorial=factorial*i;
//            }
//            System.out.println(factorial);
//        }
        FactorialNumber f= new FactorialNumber();
        System.out.println(f.fact(num));
	}

    public long fact(long num){
//        long fact1=1;
//        for (int i=1;i<=num;i++){
//            fact1*=i;
//        }
//        return fact1;

        if(num==0){
            return 1;
        }
        return num*fact(num-1);
    }



}
