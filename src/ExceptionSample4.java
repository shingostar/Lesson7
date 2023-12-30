
public class ExceptionSample4 {

    public static void main(String[] args) {
        try {
            int x = divide(3,0);
            System.out.println(x);
        } catch(ArithmeticException e) {
            System.out.println("ゼロで除算しました");
        }catch (Exception e) {
            System.out.println("例外が発生しました。");
            throw e;
        }finally {
            System.out.println("処理を終了します。");
        }
    }
    public static int divide(int a, int b) throws ArithmeticException {
        //  悪数が0であれば例外を投げる
    if (b == 0) {
        throw new ArithmeticException();
    }
        int ret =a  / b;
        return ret;
    }
}
