package one.digitalinnovation;

public class ListaCircular {

    public static void main(String[] args) {

        ListaCicular<String> minhListaCicular = new ListaCicular<>();

        minhListaCicular.add("c0");
        System.out.println(minhListaCicular);

        minhListaCicular.remove(0);
        System.out.println(minhListaCicular);

        minhListaCicular.add("c1");
        System.out.println(minhListaCicular);

        minhListaCicular.add("c2");
        minhListaCicular.add("c3");
        System.out.println(minhListaCicular);

        System.out.println(minhListaCicular.get(0));
        System.out.println(minhListaCicular.get(1));
        System.out.println(minhListaCicular.get(2));
    }
}
