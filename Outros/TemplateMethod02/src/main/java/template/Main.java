package template;

import social.Facebook;
import social.Postagem;

public class Main {
    public static void main(String[] args) {
        Postagem p = new Facebook();
        p.login();
    }
}
