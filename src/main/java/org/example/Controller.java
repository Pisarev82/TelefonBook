package org.example;

import org.example.model.Bank;
import org.example.model.Item;
import org.example.servis.Check;

public class Controller {
    Viers viers = new Viers();
    Bank bank = new Bank();
    Check check = new Check();

    public void general (){
        /*Внимание для реализации паттерна MVC нужно
        до создании экземпляра Item произвести проверку полученных из Viers данных
        Данный функционал на семинаре реализовать не успели*/
        bank.addItemInArray(viers.addItem());
        bank.addItemInArray(viers.addItem());
        viers.printAllItems(bank.getItemArrayList());
    }

    private void addItemInArray () {
        viers.addItem();
    }
}
