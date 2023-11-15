package app.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class AppView {
    //private final Scanner scanner = new Scanner(System.in);
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public String[] getData() throws IOException {
        System.out.print("Введите свое имя: ");
        String name = bufferedReader.readLine();
        System.out.print("Введите свой номер телефона: ");
        String phone = bufferedReader.readLine();
        System.out.print("Введите количество товара: ");
        String quantity = bufferedReader.readLine();
        System.out.print("Введите цену товара: ");
        String price = bufferedReader.readLine();
        System.out.println("Если Вы хотите вывезти товар сами - нажмите 1, если хотите, чтоб доствку сделали мы - нажмите 2");
        String delivery = bufferedReader.readLine();
        return new String[]{name, phone, quantity, price, delivery};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
