package ro.ase.csie.g1094.singleton.enumeration;

public enum DbConnection {
	
	DEV_DB;
	
	String connString;
	String schema;
	
	
	private DbConnection() {
		System.out.println("Loading setting from the conf file");
	}

}
