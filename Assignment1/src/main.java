public class main {
    public static void main(String[] args) {
        OneInstance instance1=OneInstance.getInstance("rifat");
        System.out.println(instance1.name);
        OneInstance instance=OneInstance.getInstance("hossain");
        System.out.println(instance.name);

    }
}
