package pl.code.academy;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Maven !!");

        Car c1 = new Car();
        c1.power=100;
        c1.vMax=200;

        Gson gson = new Gson();

        System.out.println(gson.toJson(c1));
    }
}
