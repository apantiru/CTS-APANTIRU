package ro.ase.csie.cts.g1094.singleton.staticref;


public class DbConnection {
	String connString;
	String schema;
	
	public final static DbConnection connection = new DbConnection(); //is static because it is an unique object (removed from obj area)
	
	
	//static class initializer
	static {
		//called only once before the class in loaded by the JVM
		System.out.println("Hello. DbConnection id loaded");
		connection.connString = "10.0.0.1:1443";
		connection.schema = "tempData";
	
	}
	
	//constructor initializer
	{
		
		//called every time before any constructor call
		System.out.println("Building an obgject");
	}
	
	//if you do not define it you will get the free public version of it
	private DbConnection() {
		
		System.out.println("Creating a connection object");
		System.out.println("Loading config ...");
		this.connString = "127.0.0.1";
		this.schema = "cts";

		
	}

	private DbConnection(String connString, String schema) {
		super();
		this.connString = connString;
		this.schema = schema;
	}
	
	
	

}
