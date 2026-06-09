/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication_hello;

/**
 *
 * @author agusseputra
 */
class Lecturer extends Person {

    private String nidn;
    private String expertise;

    public Lecturer(String idCard,
                    String name,
                    String nidn,
                    String expertise) {

        super(idCard, name);

        this.nidn = nidn;
        this.expertise = expertise;
    }
    public String toString() {
        return this.name; 
    }
    
}
