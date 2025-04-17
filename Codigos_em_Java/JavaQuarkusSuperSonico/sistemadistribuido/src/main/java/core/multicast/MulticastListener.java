package core.multicast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastListener implements Runnable {

    private static final String GRUPO = "230.0.0.0";
    private static final int PORTA = 4446;

    @Override
    public void run() {
        try (MulticastSocket socket = new MulticastSocket(PORTA)) {
            InetAddress group = InetAddress.getByName(GRUPO);
            socket.joinGroup(group);
            System.out.println("📡 Escutando MULTICAST no grupo " + GRUPO + ":" + PORTA);

            while (true) {
                byte[] buffer = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                String mensagem = new String(packet.getData(), 0, packet.getLength());
                System.out.println("📥 Multicast recebido: " + mensagem);
            }
        } catch (Exception e) {
            System.err.println("❌ Erro no listener multicast: " + e.getMessage());
        }
    }
}
