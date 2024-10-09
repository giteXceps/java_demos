public class App {
    public static void main(String[] args) throws Exception {

        try {
            int[] sayilar = new int[] { 1, 2, 3 };
            System.out.println(sayilar[5]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
            System.out.println("Hata!");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("loglandi: " + exception);
        } finally {
            System.out.println("i always run");
        }

    }
}
