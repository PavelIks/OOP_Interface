// extends (наследование) не обязует реализовывать методы в отличии от implements (имплементация)

package com.company;

interface PhoneI
{
    static void PhoneMethod(String calls, String migration)
    {
        System.out.println("------------------ |Телефон| ------------------");
        System.out.println("Звонки: " + calls);
        System.out.println("Брать с собой: " + migration);
    }
}

interface NotebookI
{
    static void NotebookMethod(String calls, String migration)
    {
        System.out.println("------------------ |Ноубук| ------------------");
        System.out.println("Звонки: " + calls);
        System.out.println("Брать с собой: " + migration);
    }
}

interface PCI
{
    static void PCMethod(String calls, String migration)
    {
        System.out.println("------------------ |ПК| ------------------");
        System.out.println("Звонки: " + calls);
        System.out.println("Брать с собой: " + migration);
    }

    /*static void AntiCalls()
    {
        System.out.println("Эта янйух не может звонить");
    }
    static void Test1(String name)
    {
        System.out.println(name);
    }*/
}

public class Main
{
    public static void main(String[] args)
    {
        PhoneI.PhoneMethod("Да", "Да");
        NotebookI.NotebookMethod("Нет", "Да");
        PCI.PCMethod("Нет", "Нет");
    }
}