package db;

import java.sql.Connection;

/**
 *Interface for DBConnection which is implemented for creating new database connections
 * 
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
interface DBConnection {
	 Connection createConnection();
}


