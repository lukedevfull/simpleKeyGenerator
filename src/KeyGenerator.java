import keyController.Controller;
import model.KeyModel;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class KeyGenerator {
    public static void main(String[] args) {
        Controller controllerKey = new Controller();
        KeyModel keyBase = new KeyModel();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome:");
        keyBase.setStringKey(scanner.next());
        System.out.println("Digite um Numero inteiro: ");
        keyBase.setIntKey(scanner.nextInt());

        controllerKey
                .keyEncoder(keyBase.getStringKey(), keyBase.getIntKey());

        var key = controllerKey
                .keyFormatter(keyBase.getStringKey(), keyBase.getIntKey());

        System.out.print(key);
        scanner.close();
    }


}