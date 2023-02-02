import com.digitalhouse.ChecarEmail;
import com.digitalhouse.Mail;

public class ProcessaMail {
    public static void main(String[] args) {
        Mail mail = new Mail("email@email.com", "tecnica@digitalhouse.com", "Reclamacao");
        Mail mail2 = new Mail("email@email.com", "tecnica@colmeia.com", "Gerencia");
        Mail mail3 = new Mail("email@email.com", "abobrinha@teste.com", "Tecnica");
        Mail mail4 = new Mail("email@email.com", "comercial@colmeia.com", "Comercial Reclamacao");

        ChecarEmail processo = new ChecarEmail();

        processo.verificar(mail);
        processo.verificar(mail2);
        processo.verificar(mail3);
        processo.verificar(mail4);
    }
}