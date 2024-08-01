package banke2etreinamentos.restassured.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import banke2etreinamentos.restassured.objects.RegisterAccountObject;
import io.restassured.response.Response;

public class ConsultarTest {

	@Test
	public void consultarClientes() {
		Response response = RegisterAccountObject.listClient();
		
		System.out.println(response.asPrettyString());
		assertEquals(response.getStatusCode(), 200);
		assertTrue(response.asString().contains("777.486.700-09"));
	}
	
	/*@Test
	public void consultarCliente() {
		Response response = RegisterAccountObject.listClientId(30);
		
		System.out.println(response.asPrettyString());
		assertEquals(response.getStatusCode(), 200);
	}*/
	
}
