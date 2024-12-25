
import java.util.*;


public class QueueMoradiya
{
    // No code here
}

class Song
{
    private String song;
    private String singer;

    public Song(String song, String singer)
    {
        this.song = song;
        this.singer = singer;
    }

    public String getSong()
    {
        return song;
    }

    public String getSinger()
    {
        return singer;
    }

    @Override
    public String toString()
    {
        return song + " " + singer + "\n**************\n";
    }

    public boolean equals(Song other)
    {
        return this.song.equalsIgnoreCase(other.song) && this.singer.equalsIgnoreCase(other.singer);
    }

    public int compareTo(Song other)
    {
        if (this.singer.compareTo(other.singer) == 0)
            return this.song.compareTo(other.song);
        else
            return this.singer.compareTo(other.singer);
    }
}

class Queue
{
    private ArrayList<Song> list;

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
                {
                    throw new Exception();
                }
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
  Song song1 = new Song("The closer", "-Chainsmokers");
  Song song2 = new Song("Shape of You", "-Ed Sheeran");
  Song song3 = new Song("Friends", "-Marshmellow");
  Song song4 = new Song("Supernova", "-Ansel Elgort");
  Song song5 = new Song("The Hymes of the Weekend", "-Coldplay");
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
  String singerToSearch = "Singer1";
  ArrayList<Song> singerSongs = myQueue.getSingerSongs(singerToSearch);
  System.out.println("Songs by " + singerToSearch + ":\n" + singerSongs);
  // Testing getPercentage method
  System.out.println("\nPercentage of songs by " + singerToSearch + ":\n" + myQueue.getPercentage(singerToSearch));
  // Testing play method
  System.out.println("\nNow playing your songs\n");
  myQueue.play();
 }
}