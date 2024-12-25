public class shah
{
}
class person
{
 //instance varibles: first,last,SSN,address
 private String firstName;
 private String lastName;
 private int ssn;
 private String address;
 //constructor
 public person(String firstName, String lastName, int ssn, String address)
 {
  this.firstName = firstName;
  this.lastName = lastName;
  this.ssn = ssn;
  this.address = address;
 }
 //getter methods
 public String getFirstName()
 {
  return firstName;
 }
 public String getLastName()
 {
  return lastName;
 }
 public int getSsn()
 {
  return ssn;
 }
 public String getAddress()
 {
  return address;
 }
 //setter methods
 public void setFirstName(String newFirstName)
 {
  firstName = newFirstName;
 }
 public void setLastName(String newLastName)
 {
  lastName = newLastName;
 }
 public void setSsn(int newSsn)
 {
  ssn = newSsn;
 }
 public void setAddress(String newAddress)
 {
  address = newAddress;
 }
 //equals methon based on ssn
 public boolean equals(person other)
 {
  return (this.ssn == other.ssn);
 }
 //to string
 public String toString()
 {
  String s ="";
  s += "First Name: "+firstName+"\n";
  s += "Last Name: "+lastName+"\n";
  s += "SSN: "+ssn+"\n";
  s += "Address: "+address+"\n";
  return s;
 }
}
//doctor class
class doctor extends person
{
 //first,last,ssn,address,id,speciality,year,univ
 //instance varibles: first,last,SSN,address,id,speciality,year,univ
 private String firstName;
 private String lastName;
 private int ssn;
 private String address;
 private int id;
 private String speciality;
 private int year;
 private String univ;
 //constructor
 public doctor(String firstName, String lastName, int ssn, String address, int id, String speciality, int year, String univ)
 {
  super(firstName,lastName,ssn,address);
  this.id = id;
  this.speciality = speciality;
  this.year = year;
  this.univ = univ;
 }
 //getter methods
 public int getId()
 {
  return id;
 }
 public String getSpeciality()
 {
  return speciality;
 }
 public int getYear()
 {
  return year;
 }
 public String getUniv()
 {
  return univ;
 }
 //setter methods
 public void setId(int newId)
 {
  id = newId;
 }
 public void setSpecialty(String newSpecialty)
 {
  speciality = newSpecialty;
 }
 public void setYear(int newYear)
 {
  year = newYear;
 }
 public void setUniv(String newUniv)
 {
  univ = newUniv;
 }
 //equals method
 public boolean equals(doctor other)
 {
  return (this.id ==other.id); 
 }
 //to string method
 public String toString()
 {
  String s ="";
  s = super.toString();
  s += "Id: "+id+"\n";
  s += "Speciality: "+speciality+"\n";
  s += "Year: "+year+"\n";
  s += "University: "+univ+"\n";
  return s;
 }
}
class MyDriver
{
 public static void main(String[] args)
 {
  person p = new person("Dharmang","Shah",123456789,"abc");
  person q = new person("John","Bautista",976543217,"aega");
  //System.out.println(p);
  //System.out.println(p.equals(q));
  //cerate doctor
  doctor d = new doctor("Dharmang","Shah",123456789,"abc",123456,"cardio",1999,"CSUS");
  d.setFirstName("Aarsh");
  System.out.println(d);
 }
}