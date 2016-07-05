package test;

/**
 * @user sun
 * @date 2016/6/1
 */
public class OuterOps {
    public static void main(String[] args) {
        OuterOps outerOps = new OuterOps();
        OuterOps.Inner inner = outerOps.new Inner();
        inner.print();
    }

    class Inner {
        void print() {
            System.out.print(1);
        }
    }
}
