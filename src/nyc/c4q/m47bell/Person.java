package nyc.c4q.m47bell;

import java.util.Calendar;

/*
 * Access Code 2.1
 * Author  Gregory Gundersen
 * Date    March 2015
 * This class represents a person with a name and age.
 */
public class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person(String name) {
            this.name = name;
        }

        public void setName(String newName) {
            this.name = newName;
        }

        public String getName() {
            return this.name;
        }

        public void setAge(int newAge) {
            this.age = newAge;
        }

        public int getAge() {
            return this.age;
        }


    public static void greet(){

        System.out.println("I'm speaking for all persons");

    }
    public static void main(String[] args){

        /*int n =0;

        //name multiple people...class Person is not a person, it's like a factory that creates the new person
        Person fred = new Person("Fred",10);
       // System.out.println(fred.getAge());
        Person bob = new Person("Bob", 28);
        //System.out.println(bob.getAge());

        System.out.println();

        CalendarProj c = CalendarProj.getInstance();


        Person.greet();
       //Static method: A static method is a method that belongs to a class, not an instance of the class.
        String.format("Formatting the number %d", 9);
*/
        Person fred = new Person("Fred", 28);
       // fred.setAge(30);
        //System.out.println(fred.getAge());


       // Person bob = fred;
       // bob.setName("John");

       // System.out.println(fred.getName());












    }



    }


