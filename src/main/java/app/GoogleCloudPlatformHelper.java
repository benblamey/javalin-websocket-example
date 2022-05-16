package app;

public class GoogleCloudPlatformHelper {

    // On GCP, should listen to HTTP requests on $PORT
    // Fallback to 80
    public static int getPort() {
        String port = System.getenv("PORT");
        if (port == null) {
            return 80;
        } else {
            return Integer.parseInt(port);
        }
    }
}
