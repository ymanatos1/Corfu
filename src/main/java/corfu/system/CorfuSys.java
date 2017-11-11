package corfu.system;

/**
 * Created by ymana_000 on 5/22/2017.
 */
public class CorfuSys {

    public static int VERSION = 0,
                      SUBVERSION = 1,
                      BUILD = 1;

    public static String Version() {
        return "v" + VERSION + "." + SUBVERSION + " (build " + BUILD + ")";
    }
}
