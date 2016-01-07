package db;

import java.sql.Connection;

/**
 *ConnectionFactory factory method class is used to create jdbc connection
 *to access database. In future new jdbc connections can be made by extending this class
 *and writing new switch conditions
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public class ConnectionFactory {

	public Connection createSqlConnection(String type) {
		switch (type) {
		case "mysql":

			return MySqlConnection.getConnection().createConnection();

		case "oracle":
			break;
		}
		return null;

	}

}
