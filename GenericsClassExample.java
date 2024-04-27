public class GenericsClassExample<T, U> {
    T s;
    U a;

    public GenericsClassExample(T s, U a) {
        this.s = s;
        this.a = a;
    }

    public T getString() {
        return s;
    }

    public void setString(T s) {
        this.s = s;
    }

    public U getInt() {
        return a;
    }

    public void setInt(U a) {
        this.a = a;
    }

    public static void main(String[] args) {
        GenericsClassExample<String, Integer> pair1 = new GenericsClassExample<>("AJP LAB", 35);
        System.out.println("LAB: " + pair1.getString());
        System.out.println("Number of Students: " + pair1.getInt());

       
    }
}
