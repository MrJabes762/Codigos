package core.security;

import core.model.SnapshotEstado;

public class SecureSnapshotService {

    public static String assinarSnapshot(SnapshotEstado snapshot, String usuario) {
        return HmacUtil.gerarHmac(snapshot.toString(), SecurityManager.getChaveSecreta(usuario));
    }

    public static boolean validarSnapshot(SnapshotEstado snapshot, String usuario, String hmac) {
        return SecurityManager.autenticar(usuario, hmac, snapshot.toString());
    }
}
