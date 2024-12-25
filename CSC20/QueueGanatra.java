/*
Name: Aarsh Ganatra
Description: Implementation of a Queue with functionalities for managing and manipulating songs.
date: 26/4/2024
self-grade: 100%, as the program runs and compiles and have written comments.
Testimony: All the code is written by myself and I have not copied the code from any resources. Name: Aarsh Ganatra
*/
import java.util.*;
public class QueueGanatra
{
}
// Represents a Song object
class Song
{
 private String song;
 private String singer;
 // Initializes Song object
 public Song(String song, String singer)
 {
  this.song = song;
  this.singer = singer;
 }
 // getter methods
 public String getSong()
 {
  return song;
 }
 public String getSinger()
 {
  return singer;
 }
 //Overriding toString method to represent Song object as string
 @Override
 public String toString()
 {
  return song + " " + singer + "\n**************\n";
 }
 // Method to check equality of two Song objects
 public boolean equals(Song other)
 {
  return this.song.equalsIgnoreCase(other.song) && this.singer.equalsIgnoreCase(other.singer);
 }
 // Method to compare Song objects for sorting
 public int compareTo(Song other)
 {
  if (this.singer.compareTo(other.singer) == 0)
   return this.song.compareTo(other.song);
  else
   return this.singer.compareTo(other.singer);
 }
}
// Represents a Queue of songs
class Queue
{
 private ArrayList<Song> list;
 // Initializes Queue with ArrayList of Song objects
 public Queue()
 {
  list = new ArrayList<Song>();
 }
 public void enqueue(Song s)
 {
  list.add(s);
 }
 public Song dequeue()
 {
  return list.remove(0);
 }
 // Method to play songs in the queue
 public void play()
 {
  Stack<Song> s = new Stack<>();
  Scanner scanner = new Scanner(System.in);
  boolean done = false;
  while (!done)
  {
   try
   {
    Song front = dequeue();
    s.push(front);
    System.out.println(front);
    System.out.println("Press any key to continue");
    scanner.nextLine();
   }
   catch (Exception e)
   {
    done = true;
   }
  }
  restore(s);
 }
 // Method to get all songs by a particular singer
 public ArrayList<Song> getSingerSongs(String singer)
 {
  ArrayList<Song> songs = new ArrayList<>();
  Stack<Song> s = new Stack<>();
  boolean done = false;
  while (!done)
  {
   try
   {
    Song front = dequeue();
    s.push(front);
    if (front.getSinger().equalsIgnoreCase(singer))
    {
     songs.add(front);
    }
   }
   catch (Exception e)
   {
    done = true;
   }
  }
  restore(s);
  return songs;
 }
 // Method to convert Queue to string representation
 public String toString()
 {
  StringBuilder result = new StringBuilder();
  Stack<Song> s = new Stack<>();
  boolean done = false;
  while (!done)
  {
   try
   {
    Song e = dequeue();
    s.push(e);
    result.append(e.toString());
   }
   catch (Exception e)
   {
    done = true;
   }
  }
  restore(s);
  return result.toString();
 }
 // Method to restore the original order of songs in the queue
 public void restore(Stack s)
 {
  boolean b = false;
  while (!b)
  {
   try
   {
    if (s.isEmpty())
     throw new Exception();
    Song ss = (Song) s.pop();
    list.add(0, ss);
   }
   catch (Exception c)
   {
    b = true;
   }
  }
 }
 // Method to reverse the order of songs in the queue
 public void reverseOrder()
 {
  boolean done = false;
  Stack<Song> s = new Stack<>();
  while (!done)
  {
   try
   {
    Song e = dequeue();
    s.push(e);
   }
   catch (Exception e)
   {
    done = true;
   }
  }
  done = false;
  while (!done)
  {
   try
   {
    Object o = s.pop();
    if (o == null)
     throw new Exception();
    enqueue((Song) o);
   }
   catch (Exception e)
   {
    done = true;
   }
  }
 }
 // Method to get the percentage of songs by a particular singer
 public String getPercentage(String singer)
 {
  double sum = 0;
  int count = 0;
  boolean done = false;
  Stack<Song> s = new Stack<>();
  while (!done)
  {
   try
   {
    Song song = dequeue();
    if (song == null)
     throw new Exception();
    count++;
    s.push(song);
    if (song.getSinger().equalsIgnoreCase(singer))
    {
     sum++;
    }
   }
   catch (Exception e)
   {
    done = true;
   }
  }
  restore(s);
  return sum + " out of " + count + " is by the singer " + singer;
 }
 // Method to preserve songs from another queue
 public void preserve(Queue q)
 {
  boolean b = false;
  while (!b)
  {
   try
   {
    this.enqueue(q.dequeue());
   }
   catch (Exception e)
   {
    b = true;
   }
  }
 }
}
class Driver
{
    public static void main(String[] args)
    {
        Queue m = new Queue();
        m.enqueue(new Song("Riders in the Sky", "Monroe"));
        m.enqueue(new Song("Catch My Breath", "Clarkson"));
        m.enqueue(new Song("All American Girl", "Underwood"));
        m.enqueue(new Song("Anyway", "McBride"));
        m.enqueue(new Song("Before He Cheats", "Underwood"));
        m.enqueue(new Song("Born Free", "Monroe"));
        m.enqueue(new Song("people Like Us", "Clarkson"));
        m.enqueue(new Song("Give Her That", "Underwood"));
        m.enqueue(new Song("So Small", "Underwood"));
        m.enqueue(new Song("Stronger", "Clarkson"));
        m.enqueue(new Song("Walk Away", "Monroe"));
        m.enqueue(new Song("Independence Day", "McBride"));
        System.out.println("Here is the list of your songs\n__________________________");
        System.out.println(m);
        System.out.println("The queue is : " + m);
        m.reverseOrder();
        System.out.println("The queue in reverse order is: \n" + m);
        m.reverseOrder();
        System.out.print("Is the list sorted: ");
        System.out.println("\n\nSongs by Underwood: \n");
        System.out.println("\n\n" + m.getPercentage("Underwood"));
        System.out.println("\n\n" + m.getPercentage("Clarkson") + "\n\n");
        System.out.println("Now playing your songs\n");
        m.play();
    }
}
class YourDriver
{
 public static void main(String[] args)
 {
  Queue myQueue = new Queue();
  Song song1 = new Song("Yesterday Once More", "Carpenters");
  Song song2 = new Song("Hotel California", "Eagles");
  Song song3 = new Song("Bohemian Rhapsody", "Queen");
  Song song4 = new Song("Stairway to Heaven", "Led Zeppelin");
  Song song5 = new Song("Hey Jude", "The Beatles");
  myQueue.enqueue(song1);
  myQueue.enqueue(song2);
  myQueue.enqueue(song3);
  myQueue.enqueue(song4);
  myQueue.enqueue(song5);
  // Displaying the original queue
  System.out.println("Original Queue:\n" + myQueue);
  // Testing the reverseOrder method
  myQueue.reverseOrder();
  System.out.println("Queue in reverse order:\n" + myQueue);
  myQueue.reverseOrder(); // Restoring back to the original order
  // Testing getSingerSongs method
  String singerToSearch = "Queen";
  ArrayList<Song> singerSongs = myQueue.getSingerSongs(singerToSearch);
  System.out.println("Songs by " + singerToSearch + ":\n" + singerSongs);
  // Testing getPercentage method
  System.out.println("\nPercentage of songs by " + singerToSearch + ":\n" + myQueue.getPercentage(singerToSearch));
  // Testing play method
  System.out.println("\nNow playing your songs\n");
  myQueue.play();
 }
}