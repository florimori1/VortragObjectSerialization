import java.io.*;
public class SerializeDemo {

   public static void main(String [] args) {
      Mitarbeiter e = new Mitarbeiter();
      e.name = "Emilio Kalamorz";
      e.address = "Musterstraße, Leipzig";
      e.SSN = 11122333;
      e.number = 101;
      Mitarbeiter e2 = new Mitarbeiter();
      e2.name = "Florian Garbe";
      e2.address = "Musterstraße 1, Leipzig ";
      e2.SSN = 102040403;
      e2.number = 104;

      try {
         FileOutputStream fileOut =
         new FileOutputStream("mitarbeiter.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.writeObject(e2);
         out.close();
         fileOut.close();
         System.out.printf("Serialisierte Daten werden gespeichert in mitarbeiter.txt");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}