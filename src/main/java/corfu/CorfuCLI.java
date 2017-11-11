package corfu;

import corfu.system.*;
import corfu.workspace.*;
//import corfu.parse.*;

/**
 * Created by ymana_000 on 5/20/2017.
 */
public class CorfuCLI {

    /*static String help ="Usage: CorfuCLI [-options] class [args...]\n" +
                        "           (to execute a class)\n" +
                        "   or  CorfuCLI [-options] -jar jarfile [args...]\n" +
                        "           (to execute a jar file)\n" +
                        "where options include:\n" +
                        "    -d32          use a 32-bit data model if available\n" +
                        "    -d64          use a 64-bit data model if available\n" +
                        "    -server       to select the \"server\" VM\n" +
                        "                  The default VM is server.\n" ;
                        "\n" +
                        "    -cp <class search path of directories and zip/jar files>\n" +
                        "    -classpath <class search path of directories and zip/jar files>\n" +
                        "                  A ; separated list of directories, JAR archives,\n" +
                        "                  and ZIP archives to search for class files.\n" +
                        "    -D<name>=<value>\n" +
                        "                  set a system property\n" +
                        "    -verbose:[class|gc|jni]\n" +
                        "                  enable verbose output\n" +
                        "    -version      print product version and exit\n" +
                        "    -version:<value>\n" +
                        "                  Warning: this feature is deprecated and will be removed\n" +
                        "                  in a future release.\n" +
                        "                  require the specified version to run\n" +
                        "    -showversion  print product version and continue\n" +
                        "    -jre-restrict-search | -no-jre-restrict-search\n" +
                        "                  Warning: this feature is deprecated and will be removed\n" +
                        "                  in a future release.\n" +
                        "                  include/exclude user private JREs in the version search\n" +
                        "    -? -help      print this help message\n" +
                        "    -X            print help on non-standard options\n" +
                        "    -ea[:<packagename>...|:<classname>]\n" +
                        "    -enableassertions[:<packagename>...|:<classname>]\n" +
                        "                  enable assertions with specified granularity\n" +
                        "    -da[:<packagename>...|:<classname>]\n" +
                        "    -disableassertions[:<packagename>...|:<classname>]\n" +
                        "                  disable assertions with specified granularity\n" +
                        "    -esa | -enablesystemassertions\n" +
                        "                  enable system assertions\n" +
                        "    -dsa | -disablesystemassertions\n" +
                        "                  disable system assertions\n" +
                        "    -agentlib:<libname>[=<options>]\n" +
                        "                  load native agent library <libname>, e.g. -agentlib:hprof\n" +
                        "                  see also, -agentlib:jdwp=help and -agentlib:hprof=help\n" +
                        "    -agentpath:<pathname>[=<options>]\n" +
                        "                  load native agent library by full pathname\n" +
                        "    -javaagent:<jarpath>[=<options>]\n" +
                        "                  load Java programming language agent, see java.lang.instrument\n" +
                        "\n" +
                        "    -splash:<imagepath>\n" +
                        "                  show splash screen with specified image\n" +
                        "See http://www.oracle.com/technetwork/java/javase/documentation/index.html for m\n" +
                        "ore details.";*/

    private static String helpText() {
        String help = "  CorfuCLI " + CorfuSys.Version() + "\n" +
                "Usage: corfucli [-options] [workspace_file]\n" +
                "  where workspace_file is an optional previously saved corfu workspace.\n" +
                "Purpose: Command line interface to a new or loaded corfu workspace.\n" +
                "Options include:\n" +
                "  -classpath <class search path of directories and zip/jar files>\n" +
                "                A ; separated list of directories, JAR archives,\n" +
                "                and ZIP archives to search for class files.\n" +
                "  -verbose:[class|gc|jni]\n" +
                "                enable verbose output\n" +
                "  -version      print product version and exit\n";
        return help;
    }


    public static void main(String[] args) {
        System.out.println(helpText());
    }

}
