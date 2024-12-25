/*
Name: Dharmang Shah
Date: 21 February,2024
description: this program writes an email for you
Self-grade:100%, as i have followed all the rubric and given comments wherever necessary.
Testimony: I have done all the code myself without getting help from any resourses including AI websites: Name Dharmang Shah
*/
import java.util.*;
public class DocShah
{
}
class Document
{
 //instance variable
 private String content;
 //constructor method
 public Document(String text)
 {
  content = text;
 }
 //getter method
 public String getText()
 {
  return content;
 }
 //setter method
 public void setContent(String newContent)
 {
  content = newContent;
 }
 //this method converts variable to string
 public String toString()
 {
  String s ="";
  s += content;
  return s;
 }
 //this method returns the number of characters
 public int characterCount()
 {
  return content.length();
 }
 //this method returns the number of words
 public int countWords()
 {
  int count=0;
  char last= ' ';
  for (int i=0; i<content.length();i++)
  {
   if(content.charAt(i)==' ' && last!=' ')
   {
    count+=1;
   }
   last = content.charAt(i);
  }
  return count;
 }
 //this method finds the given word
 public Boolean find (String keyword)
 {
  return content.contains(keyword);
 }
 //this method checks if the 2 variables are the same.
 public Boolean equals (Document other)
 {
  return this.content.equalsIgnoreCase(other.content);
 }
}
class Email extends Document
{
 //instance variables
 public static String message = "sent emails cannot be modified";
 private String sender;
 private String recipient;
 private Date date;
 private String subject;
 private String cc;
 private boolean iSent;
 //constructor method
 public Email(String text, String sender, String recipient, String subject, String cc)
 {
  super(text);
  this.sender = sender;
  this.recipient = recipient;
  this.subject = subject;
  this.cc = cc;
  this.date = new Date();
 }
 //this method acts as the send button of an e-mail app.
 public void send()
 { 
  iSent = true;
 }
 //this method checks if the mail has been sent
 public boolean getSent()
 {
  return iSent;
 }
 //this method returns the name of sender
 public String getSender()
 { 
  return sender;
 }
 //this method returns the recipients name.
 public String getRecipient()
 {
  return recipient;
 }
 //this method returns the subject.
 public String getSubject()
 {
  return subject;
 }
 //this method returns the cc list.
 public String getCc()
 {
  return cc;
 }
 //this method returns the date.
 public Date Date()
 {
  return date;
 }
 //this mathod changes the sender's name, if the mail has not been sent.
 public void setSender(String s)
 {
  if (iSent == false)
  {
   sender= s;
  }
  else
  {
   System.out.println(message);
  }
 }
 //this method chamges the name of recipient, if the mail has not been sent.
 public void setRecipient(String r)
 {
  if (iSent == false)
  {
   recipient= r;
  }
  else
  {
   System.out.println(message);
  }
 }
 //this method changes the subject of the mail, if the mail has not been sent.
 public void setSubject(String s)
 {
  if (iSent == false)
  {
   subject = s;
  }
  else
  {
   System.out.println(message);
  }
 }
 //this method changes the cc list, if the mail has not been sent.
 public void setCc(String c)
 {
  if (iSent == false)
  {
   cc= c;
  }
  else
  {
   System.out.println(message);
  }
 }
 //this method writes the mail in a proper format.
 public String toString()
 {
  String s = "";
  s+= "Sender: "+sender;
  s+= "\nRecipient: "+recipient;
  s+= "\nSubject: "+ subject;
  s+= "\nDate: "+ date;
  s+= "\n"+super.toString();
  return s;
 }
 //this method changes the content of the mail, if the mail has not been sent.
 public void editContent(String s)
 {
  if (iSent == false)
  {
   super.setContent(s);
  }
  else
  {
   System.out.println(message);
  }
 }
 //this method forwards the mail to all the people in the cc list.
 public Email forward(String rec, String sender, String cc)
 {
  Email f = new Email (this.getText(), sender, rec, this.subject, cc);
  f.date = new Date();
  f.iSent = true;
  return f;
 }
} 
class EmailDriver
{
    public static void main(String[] args)
    {
       Email e1 = new Email("Good morning, the exam date has been changed. check the Canvas", "Teacher","All Students","Exam","");
       //sending the email
       e1.send();
       //disply the details about the email
       System.out.println(e1);
       System.out.println("\n\n");
       //searching the email for the email for the word tomorrow
       boolean b = e1.find("tmorrow");
       if(b)
         System.out.println("The word tomorrow was  found in the email");
       else
          System.out.println("The word tomorrow was not found in the email"); 
       //displaying just the content(text) of the email
       System.out.println("\nThe content of this email is: " + e1.getText());
       System.out.println();
       //modifying the content of the email
       e1.editContent("bye");
       System.out.println(e1.countWords());
       //changing the recipient of the e1 email
       e1.setRecipient("Jose@yahoo.com,Mary@gmail.com");
       System.out.println();
       //forwarding the email
       Email forward = e1.forward("Jose", "Ahmad" ,"Bruce");
       System.out.println();
       //printing the forwarded email 
       System.out.println("Here is the forwarded message\n");
       System.out.println("forwarded message\n"+ forward);
       System.out.println();
       //display the length of the text in the email
       System.out.println("The number of the letters in the email is: " + e1.characterCount());
       System.out.println("\n\nDisplaying the email again");
       System.out.println(e1);
    }
}
//this is the driver method.
class YourDriver
{
 public static void main(String args[])
 {
  Email e1 = new Email("Good morning, the exam date has been cancelled. check the Canvas", "Teacher","All Students","Exam","");
  Email e2 = new Email("Good morning, the exam date has been preponed. check the Canvas", "Teacher","All Students","Exam","");
  System.out.println("There are "+e1.characterCount()+" characters.");
  e1.send();
  System.out.println("There are "+e1.countWords()+" words.");
  String a = "the";
  if (e1.find(a))
  {
   System.out.println("\""+a+"\" is in the email.");
  }
  else
  {
   System.out.println(a+" is not in the email.");
  }
  if(e1.equals(e2))
  {
   System.out.println("They are the same.");
  }
  else
  {
   System.out.println("They are not the same.");
  }
 }
}