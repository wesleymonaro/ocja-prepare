package aula10;

import java.io.IOException;
import java.sql.SQLException;

public class Programa3 {
	static void metodoA() throws IOException{
		throw new IOException();
	}
	static void metodoB() throws SQLException{
		try {
			metodoA();
		} catch (Exception e) {
			System.out.println("Eu trato de IOException, mas...");
			throw new SQLException();
		}
	}
	public static void main(String[] args)throws IOException, SQLException {
		try{
		metodoB();
		}catch(SQLException e){
			System.out.println("SQLException tratado.");
		}
	}
}
