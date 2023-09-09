public class FunctionOverloadingUsingDatatype {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Integer sum is:- "+sum(10,20));
        System.out.println("Float sum is:- "+sum(10.23f,35.29f));
    }
}
