package sample;

public class ExceptionExample2 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        try {
            System.out.println("割り算開始");
            int a = devide(10, 0);
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught:" + e.getMessage());
        
        } finally {
            System.out.println("割り算終了");
        }
        
        System.out.println("処理終了");

    }
    
    public static int devide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // 0での除算を試みた場合、ArithmeticExceptionを投げ飛ばします
            throw new ArithmeticException("ゼロ除算エラーです");
        }
        return a/b;
    }
    
    
    
    
    

}
