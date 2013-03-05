import java.sql.Connection;

import no.apto.java.db.ConnectionManager;


public class TestingHsqldb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn= ConnectionManager.getInstance().getConnection();

	}

}
