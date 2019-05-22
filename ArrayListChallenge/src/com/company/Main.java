package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("8885161879");

    public static void main(String[] args) {

    boolean quit =false;
    startPhone();
    printActions();
    while (!quit) {
        System.out.println("\nEnter action: (6 to show available actions)");
        int action = scanner.nextInt();
        scanner.nextLine();

        switch (action) {
            case 0:
                System.out.println("\nShutting down...");
                quit = true;
                break;

            case 1:
                mobilePhone.print();
                break;

            case 2:
                addNewContact();
                break;

            case 3:
                updateContact();
                break;

            case 4:
                removeContact();
                break;

            case 5:
                queryContact();
                break;

            case 6:
                printActions();
                break;
        }
    }

    }

    public static void startPhone() {
        System.out.println("Phone is starting......");
    }

    public static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

    public static void addNewContact() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter number");
        String number = scanner.nextLine();
        Contact newcontact = Contact.create(name,number);
        if (mobilePhone.add(newcontact)) {
            System.out.println("New contact added: name = " + name + ", phone = "+ number);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
        }

        public static void updateContact() {
            System.out.println("Enter existing name");
            String name = scanner.nextLine();
            Contact exist = mobilePhone.searchcontact(name);
            if (exist == null) {
                System.out.println("Contact found");
            }
            System.out.println("Enter name");
            String newname = scanner.nextLine();
            System.out.println("Enter number");
            String number = scanner.nextLine();
            Contact newcontact = Contact.create(newname,number);
            if (mobilePhone.modify(exist,newcontact)) {
                System.out.println("Successfully updated record");
            } else {
                System.out.println("Error updating record.");
            }
            }

            public static void removeContact() {
                System.out.println("Enter contact");
                String name = scanner.nextLine();
                Contact exist = mobilePhone.searchcontact(name);
                if (mobilePhone.remove(exist)) {
                    System.out.println("Contact removed");
                }
                System.out.println("Error");
            }

            public static void queryContact() {
                System.out.println("Enter contact");
                String name = scanner.nextLine();
                Contact exist = mobilePhone.searchcontact(name);
                if (exist == null) {
                    System.out.println("Contact not found");
                }
                System.out.println("Contact found");
            }
        }


