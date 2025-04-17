package core.multicast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MulticastSender {

    private static final String GRUPO = "230.0.0.0";
    private static final int PORTA = 4446;

    public void enviar(String mensagem) {
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] buffer = mensagem.getBytes();
            InetAddress group = InetAddress.getByName(GRUPO);
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, PORTA);
            socket.send(packet);
            System.out.println(" Enviado via MULTICAST: " + mensagem);
        } catch (Exception e) {
            System.err.println(" Erro ao enviar multicast: " + e.getMessage());
        }
    }
}