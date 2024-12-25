/*
Name: Aarsh Ganatra
date: 04/03/2024
description: this method is about maintaining a list of all the doctors in a hospital.
self-grade: 100%, as the program compiles and runs properly and have wriyyen comments.
Testimony: I have written all the code by myself and did not get any help from unauthorized sources. Name: Aarsh Ganatra
*/
import java.util.*;

public class SearchSortGanatra {
}

class Doctor implements Comparable {
    private String first;
    private String last;
    private String phone;
    private String speciality;
    private int rating;

    public Doctor(String first, String last, String phone, String speciality, int rating) {
        this.first = first;
        this.last = last;
        this.phone = phone;
        this.speciality = speciality;
        this.rating = rating;
    }

    // getter methods
    public String getLast() {
        return last;
    }

    public String getFirst() {
        return first;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getPhone() {
        return phone;
    }

    public int getRating() {
        return rating;
    }

    // setter methods
    public void setFirst(String newFirst) {
        first = newFirst;
    }

    public void setLast(String newLast) {
        last = newLast;
    }

    public void setPhone(String newPhone) {
        phone = newPhone;
    }

    public void setSpeciality(String newSpeciality) {
        speciality = newSpeciality;
    }

    public void setRating(int newRating) {
        rating = newRating;
    }

    // Compares Doctor objects based on their last names.
 
 
    public int compareTo(Object o) {
        Doctor d = (Doctor) o;
        int i = this.last.compareTo(d.last);
        if (i == 0) {
            return d.first.compareTo(first);
        } else {
            return i;
        }
    }

    // Compares Doctor objects based on their specialties.
       
    public int comparesTo(Doctor d) {
        int i = this.speciality.compareTo(d.speciality);
        if (i == 0) {
            return d.last.compareTo(last);
        } else {
            return i;
        }
    }

    // Compares Doctor objects based on their ratings.
        public int compareRating(Doctor d) {
        return this.rating - d.rating;
    }

    // Generates a string representing all attributes of the Doctor object.
    public String toString() {
        String s = "";
        s += "\nFirst name: " + first;
        s += "\nLast name: " + last;
        s += "\nPhone: " + phone;
        s += "\nSpecialty: " + speciality;
        s += "\nRating: " + rating;
        return s;
    }

    // Checks if two Doctor objects are identical based on their first and last names
    public boolean equals(Doctor p) {
        return this.first.equals(p.first) && this.last.equals(p.last);
    }
}

// Represents a hospital with a list of doctors.
class Hospital {
    ArrayList<Doctor> doctors;

    // Constructor
    public Hospital() {
        doctors = new ArrayList<Doctor>();
    }

    // getter method
    public ArrayList<Doctor> getList() {
        return doctors;
    }

    // Sorts doctors based on their last names.
        public void bubbleSort() {
        for (int i = 0; i < doctors.size(); i++) {
            for (int j = 0; j < doctors.size() - i - 1; j++) {
                if (doctors.get(j + 1).compareTo(doctors.get(j)) < 0) {
                    Doctor temp = doctors.get(j);
                    doctors.set(j, doctors.get(j + 1));
                    doctors.set(j + 1, temp);
                }
            }
        }
    }

    // Adds a doctor to the list of doctors.
    public void addDoctor(String first, String last, String phone, String speciality, int rating) {
        int i = 0;
        while (i < doctors.size() && last.compareTo(doctors.get(i).getLast()) > 0) {
            i++;
        }
        doctors.add(i, new Doctor(first, last, phone, speciality, rating));
    }

    // Deletes a doctor from the list.
    public boolean deleteDoctor(String last) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getLast().equals(last)) {
                doctors.remove(i);
                return true;
            }
        }
        return false;
    }

    // adds a doctor to the end of the list.
    public void add(String first, String last, String phone, String spec, int rating) {
        Doctor p = new Doctor(first, last, phone, spec, rating);
        doctors.add(p);
    }

    // Represents the Hospital object as a string.
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Doctor doctor : doctors) {
            s.append("\n").append(doctor.toString());
        }
        return s.toString();
    }

    // Performs selection sort by invoking compareRating method to sort doctors based on their ratings.
       
    public void selectionSort() {
        for (int i = 0; i < doctors.size(); i++) {
            int index = 0;
            boolean swap = false;
            Doctor min = doctors.get(i);
            for (int j = i + 1; j < doctors.size(); j++) {
                if (doctors.get(j).compareRating(min) < 0) {
                    index = j;
                    min = doctors.get(j);
                    swap = true;
                }
            }
            if (swap) {
                Doctor temp = doctors.get(i);
                doctors.set(i, doctors.get(index));
                doctors.set(index, temp);
            }
        }
    }

    // Uses binary search to find a doctor in the list.
       
    public int binarySearch(Doctor d) {
        int first = 0;
        int last = doctors.size() - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (doctors.get(mid).compareTo(d) == 0)
                return mid;
            if (d.compareTo(doctors.get(mid)) > 0)
                first = mid + 1;
            else
                last = mid - 1;
            mid = (first + last) / 2;
        }
        return -1;
    }

    // Sorts the list of doctors based on their specialties.
       
    public void insertionSort() {
        for (int i = 0; i < doctors.size() - 1; i++) {
            int j = i + 1;
            Doctor temp = doctors.get(j);
            String n = doctors.get(j).getSpeciality();
            while (j > 0 && n.compareTo(doctors.get(j - 1).getSpeciality()) < 0) {
                doctors.set(j, doctors.get(j - 1));
                j--;
            }
            doctors.set(j, temp);
        }
    }
}
class YourDriver {
    public static void main(String[] args) {
        Hospital sterling = new Hospital();
        sterling.add("John","Doe","123-456-7890","Neurologist",4);
        sterling.add("Jane","Smith","987-654-3210","Cardiologist",5);
        sterling.add("Michael","Johnson","456-789-0123","Pediatrician",3);
        sterling.add("Emily","Brown","321-654-9870","Dermatologist",4);
        sterling.add("William","Davis","789-012-3456","Oncologist",5);
        sterling.add("Olivia","Martinez","654-321-0987","Psychiatrist",4);
        sterling.add("James","Taylor","234-567-8901","Orthopedic Surgeon",5);
        sterling.add("Sophia","Anderson","567-890-1234","Endocrinologist",3);
        System.out.println("******");
        System.out.println("Testing the bubble sort sort based on the last name");
        sterling.bubbleSort();
        System.out.println("Here is the sorted list based on the last name");
        System.out.println(sterling);
        System.out.println("******\n\n");
        System.out.println("Testing the binary search looking for William Davis");
        int i = sterling.binarySearch(new Doctor("William","Davis","789-012-3456","Oncologist",5));
        System.out.println("The index for William Davis is : " + i+ "\n\n");
        System.out.println("*****");
        System.out.println("adding 3 more doctors to the list"); 
        System.out.println("******");
        sterling.add("Liam","Wilson","890-123-4567","Urologist",4);
        sterling.add("Ava","Garcia","567-890-2345","Gynecologist",5);
        sterling.add("Benjamin","Lopez","098-765-4321","Rheumatologist",4);
        System.out.println("******\n"); 
        System.out.println("New list of doctors");
        System.out.println(sterling);
        System.out.println("*****");
        System.out.println("Testing the insertion sort based on the speciality");
        sterling.insertionSort();
        System.out.println(sterling);
        System.out.println("*******");
        System.out.println("Adding more to the sterling");
        sterling.add("Emma","Harris","678-901-2345","Dentist",5);
        sterling.add("Daniel","Clark","345-678-9012","Allergist",4);
        sterling.add("Mia","Lewis","901-234-5678","Ophthalmologist",3);
        System.out.println("*******");
        System.out.println("Testing the selection sort based on the rating of the doctors ratings");
        sterling.selectionSort();
        System.out.println("Here is the sorted list based on the rating ");
        System.out.println(sterling);
        System.out.println("******\n");
        sterling.bubbleSort();
        System.out.println("*******");
        System.out.println("Sorted list based on the last name:");
        System.out.println(sterling);
        System.out.println("*******");
        int index = sterling.binarySearch(new Doctor("Emma","Harris","678-901-2345","Dentist",5));
        System.out.println("Emma is at index : "+ index);
    } 
}   
class Driver
{
 public static void main(String[] args)
 {
  Hospital mercy = new Hospital();
  mercy.add ( "Ana","Baily","568-345-9999" , "Dermatalogist", 4);
  mercy.add ( "Mary","Busta","111-222-3333","Cardialogist", 5 );
  mercy.add ( "Richard","Smith","123-123-4567","Pediatrition", 3 );
  mercy.add ( "Alex","Rodrigues","987-567-3333" , "Punmnalogist", 4);
  mercy.add ( "Sarah","Schulz","555-666-7777" , "Pain medicine", 3);
  mercy.add("Roy","Trump","333-555-6666", "Phsyciatric", 4);
  mercy.add("Zack", "Lambard","345-777-8989", "Radialogist", 5);
  mercy.add("Alex","Cook","111-222-3333", "Ocuplastic surgen", 4);
  System.out.println("******************************************");
  System.out.println("Testing the bubble sort sort based on the last name");
  mercy.bubbleSort();
  System.out.println("Here is the sorted list based on the last name");
  System.out.println(mercy);
  System.out.println("******************************************\n\n");
  System.out.println("Testing the binary search looking for Richard Smith");
  int i = mercy.binarySearch(new Doctor( "Richard","Smith","123-123-4567","Pediatrition", 3 ));
  System.out.println("The index for Richard Smith is : " + i+ "\n\n");
  System.out.println("*****************************************");
  System.out.println("adding 3 more doctors  to the list"); 
  System.out.println("******************************************");
  mercy.add("Zack", "Lambard","345-777-8989", "Plastic surgern", 5);
  mercy.add("Alex","Cook","111-222-3333", "Ocuplastic surgen", 4);
  mercy.add("Roy","Trump","333-555-6666", "Phsyciatric", 4);
  System.out.println("**************************************\n"); 
  System.out.println("New list of doctors");
  System.out.println(mercy);
  System.out.println("*********************************************");
  System.out.println("Testing the insertion sort based on the speciality");
  mercy.insertionSort();
  System.out.println(mercy);
  System.out.println("***************************************************");
  System.out.println("Adding more to the mercy");
  mercy.add("Sarah", "Lee","888-999-9008", "Cardialogist", 5);
  mercy.add("AShly", "Lu","123-444-0780","Internal medicine", 4);
  mercy.add("Jose","Brwon","111-999-6556", "Eye surgen",3);
  System.out.println("***********************************************");
  System.out.println("Testing the selection sort based on the rating of the doctors ratings");
  mercy.selectionSort();
  System.out.println("Here is the sorted list based on the rating ");
  System.out.println(mercy);
  System.out.println("************************************************\n");
  mercy.bubbleSort();
  System.out.println("*************************************************");
  System.out.println("Sorted list based on the last name:");
  System.out.println(mercy);
  System.out.println("*************************************************");
  int index = mercy.binarySearch(new Doctor("Sarah", "Lee","888-999-9008", "Cardialogist", 5));
  System.out.println("Sarah is at index : "+ index);
 } 
}