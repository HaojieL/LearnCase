public class C extends B {
    public C(String c) {
        super(c);
        System.out.println("子类已经被实例化");
    }

    @Override
    public void play() {
        System.out.println("我实现了父类的方法");
    }

    public static void main(String[] args) {
        B c = new C("c");
    }
}