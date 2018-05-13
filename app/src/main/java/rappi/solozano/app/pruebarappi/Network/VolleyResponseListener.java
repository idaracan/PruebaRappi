package rappi.solozano.app.pruebarappi.Network;

public interface VolleyResponseListener {
    void onError(String message);
    void onResponse(Object response);
}
