package banke2etreinamentos.restassured.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import banke2etreinamentos.restassured.objects.RegisterAccountObject;
import banke2etreinamentos.restassured.utils.DataGenerator;
import io.restassured.response.Response;

public class CadastrarTest {

	@Test
	public void cadastrarCliente() {
		Response response = RegisterAccountObject.registerClient(
				DataGenerator.firstNameRandom(),
				DataGenerator.lastNameRandom(), 
				DataGenerator.firstNameRandom() + "@e2etreinamentos.com.br",
				"18079985783", // telefone
				DataGenerator.addressRandom(), 
				"777.486.700-09", // CPF
				"48499595", // RG
				DataGenerator.zipcodeRandom(), 
				DataGenerator.numberHouseRandom(), 
				DataGenerator.stateRandom(),
				DataGenerator.cityRandom(), 
				"09-05-1997", // Data Nascimento
				"", // Complement
				DataGenerator.groupRandom(),
				DataGenerator.groupRandom(), 
				DataGenerator.jobRandom(), 
				3500, // salario
				DataGenerator.firstNameRandom() + "@e2etreinamentos.com.br");
		
		assertEquals(201, response.getStatusCode());
		System.out.println(response.asPrettyString());
	}

}
