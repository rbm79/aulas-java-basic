public class OlaMundo {

   public static void main(String[] args) {

      if (args.length > 0) {

         String argumento = args[0]; 
         System.out.println("Olá bem vindo "+ argumento);
      
      }
      else {
         System.out.println("Olá bem vindo.");
      }

   } 

}
