import java.sql.Connection;
import java.sql.SQLException;

public class DaoFactory {

    private static Config config = new Config();

    private static Ads adsDao;

    public static Ads getAdsDao() {

        if (adsDao == null) {
            try {
                adsDao = new MySQLAdsDao(config);
            } catch (SQLException e) {

            }

        }
        return adsDao;
    }
}
