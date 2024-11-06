
public class HelloWorld {

    public static void main(String[] args) {
        //realiza o processamento de um contato 
        Contato [] contatos = new Contato[1000];

        Contato c = new Contato();
        c.setCodigoUnico(1);
        Contato contato1 = new Contato();
        contato1.setCodigoUnico(2);
        Contato contato2 = new Contato();
        contato2.setCodigoUnico(22000);

        contatos[0] = c;
        contatos[1] = contato1;
        contatos[2] = contato2;

        for (int i = 0; i < contatos.length ; i++){
            if (contatos[i] != null){
                System.out.println("Contato com o índice "+i+
                                " - possui o codigo único "+contatos[i].getCodigoUnico());

            } 
            else {
                break;
            }
            System.out.println(i);
        }
         

        System.out.println(contatos[0].getCodigoUnico());
        System.out.println(contatos[1].getCodigoUnico());
    }
    
}
