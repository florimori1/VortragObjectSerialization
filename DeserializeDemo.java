import java.io.*;
public class DeserializeDemo {

   public static void main(String [] args) {
      Mitarbeiter e = null;
      Mitarbeiter e2 = null;
      try {
         FileInputStream fileIn = new FileInputStream("mitarbeiter.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Mitarbeiter) in.readObject();
         e2 = (Mitarbeiter) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Mitarbeiter Klasse nicht gefunden.");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Deserialisierter Mitarbeiter...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);

      System.out.println("Deserialisierter Mitarbeiter...");
      System.out.println("Name: " + e2.name);
      System.out.println("Address: " + e2.address);
      System.out.println("SSN: " + e2.SSN);
      System.out.println("Number: " + e2.number);
   }
}