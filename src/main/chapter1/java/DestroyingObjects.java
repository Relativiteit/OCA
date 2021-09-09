public class DestroyingObjects {
    public static void main(String[] args) {
    //   use pen and paper always!!
        DestroyingObjects Alejo = new DestroyingObjects();
        Alejo.extracted();
    }

    private void extracted() {
        String one, two;
        try {
            finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }
}
