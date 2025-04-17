package core.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

    public void enviar(String destino, int porta, String mensagem) {
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] buffer = mensagem.getBytes();
            InetAddress address = InetAddress.getByName(destino);
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, porta);
            socket.send(packet);
            System.out.println(" UDP enviado para " + destino + ":" + porta + " → " + mensagem);
        } catch (Exception e) {
            System.err.println(" Erro ao enviar UDP: " + e.getMessage());
        }
    }
}
