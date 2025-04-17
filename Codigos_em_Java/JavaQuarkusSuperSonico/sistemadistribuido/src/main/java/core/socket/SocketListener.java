package core.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketListener implements Runnable {

    private final int porta;

    public SocketListener(int porta) {
        this.porta = porta;
    }

    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(porta)) {
            System.out.println("📡 Escutando na porta TCP " + porta + "...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println("📥 Mensagem TCP recebida: " + msg);
                }
            }
        } catch (Exception e) {
            System.err.println("❌ Erro no listener TCP: " + e.getMessage());
        }
    }
}