public class PenBox {
    private static final int MAX_PENS_IN_BOX = 3;

    private PensFactory pensFactory = new PensFactory();
    private Pen[] pens = new Pen[MAX_PENS_IN_BOX];

    public void fillTheBox() {
        pens[0] = pensFactory.createPen();
        for (int i = 1; i < MAX_PENS_IN_BOX;) {
            Pen pen = pensFactory.createPen();
            if (!compare(pen)) {
                pens[i] = pen;
                i++;
            } else {
                System.out.println("Duplikat! ");
            }
        }
    }

    public boolean compare(Pen pen) {
        for (int i = 0; i < pens.length; i++) {
            if (pens[i] == null)
                return false;
            boolean duplicate = pens[i].equals(pen);
            if (duplicate)
                return true;
        }
        return false;
    }
}
