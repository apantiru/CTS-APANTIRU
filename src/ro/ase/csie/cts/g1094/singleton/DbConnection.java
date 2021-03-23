package ro.ase.csie.cts.g1094.singleton;

public class DbConnection {
	
	String connString;
	String schema;
	
	//eager-instantiation
	private static DbConnection connection = null; //is static because it is an unique object (removed from obj area)
	
	private DbConnection() {
		
		System.out.println("Creating a connection object");
		System.out.println("Loading config ...");
		this.connString = "127.0.0.1";
		this.schema = "cts";

		
	}

	//lazy-instantiation of the unique object
	private DbConnection(String connString, String schema) {
		super();
		this.connString = connString;
		this.schema = schema;
	}
	
	
	public static DbConnection getConnection() {
		if(DbConnection.connection == null) {
			connection = new DbConnection(); //the only time i create a connection
			
		}
		return DbConnection.connection;
	}
	
	
	//not clean - misleading! - other will think they have multiple connections!
	public static DbConnection getConnection(String connString, String schema) {
		if(DbConnection.connection == null) {
			connection = new DbConnection(connString, schema); //the only time i create a connection
			
		}
		return DbConnection.connection;
	}
	
	
	

}
