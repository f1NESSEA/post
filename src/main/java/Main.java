public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 444444";
        post.patronomyc = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = "true";

        FormDate.birthday = new FormDate();
        birthday.birthday.day = "13";
        post.birthday.month = "6";
        post.birthday.year = "1999";
    }
}
