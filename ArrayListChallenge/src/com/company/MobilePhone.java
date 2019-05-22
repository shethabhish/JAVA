package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> mycontact;
    private String mynumber;

    public MobilePhone(String mynumber) {
        this.mycontact = new ArrayList<Contact>();
        this.mynumber = mynumber;
    }

    public boolean add(Contact contact) {
        if (find(contact.getName())>=0 ) {
            System.out.println("Contact already exists");
            return false;
        }
        mycontact.add(contact);
        return true;
    }

    public boolean modify(Contact oldcontact, Contact newcontact) {
        int find = find(oldcontact);
        if (find<0) {
            System.out.println(oldcontact.getName() + " was not found");
            return false;
        } else if (find(newcontact) != -1) {
            System.out.println(newcontact.getName() + " already exists cannot modify");
            return false;
        }
        this.mycontact.set(find, newcontact);
        return true;
    }

    public boolean remove(Contact contact) {
        int find = find(contact);
        if (find<0) {
            System.out.println(contact + " contact not found");
            return false;
        }
        this.mycontact.remove(find);
        return true;
    }

    private int find(Contact contact) {
        return this.mycontact.indexOf(contact);
    }

    public int find(String name) {
       for (int i =0; i< this.mycontact.size();i++) {
           Contact contact = this.mycontact.get(i);
           if (contact.getName().equals(name)) {
               return i;
           }
       }
       return -1;
    }

    public String  searchcontact(Contact contact) {
        if (find(contact)>=0) {
            return contact.getName();
        }
        return null;
    }

    public Contact searchcontact(String name) {
        int find = find(name);
        if (find>0) {
            return this.mycontact.get(find);
        }
        return null;
    }

    public void print() {
        System.out.println("Contact List");
        for (int i = 0; i<this.mycontact.size();i++) {
            System.out.println((i+1) + ". " + this.mycontact.get(i).getName() + " ------> " + this.mycontact.get(i).getNumber());
        }
    }
}
