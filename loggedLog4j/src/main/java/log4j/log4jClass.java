package log4j;

import java.util.logging.Logger;

/**
 * загружаем библиотеку log4j
 *
 */
public class log4jClass {

    private static String LOG_PROPERTIES_FILE = "D:\\Ukrainian_IT_School\\Work\\FinalWork\\loggedLog4j\\target\\classes\\log4j.properties";//???
    private static Logger logger = Logger.getLogger(String.valueOf(log4jClass.class));//???????????

    public static void main(String[] args) {
        Config conf = new Config(LOG_PROPERTIES_FILE);
        conf.init();
        logger.info("Prog run..."); //fatal???error???
    }
}

