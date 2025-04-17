package core.socket;


import java.io.PrintWriter;
import java.net.Socket;

public class SocketSender {
    public void enviar(String destino, int porta, String mensagem) {
        try (Socket socket = new Socket(destino, porta);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
            writer.println(mensagem);
            System.out.println(" Mensagem enviada via TCP: " + mensagem);
        } catch (Exception e) {
            System.err.println(" Erro ao enviar TCP: " + e.getMessage());
        }
    }
}
