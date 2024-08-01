package banke2etreinamentos.restassured.objects;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RegisterAccountObject {

	private static final String BASE_URL = "http://52.2.114.98/";

	// Metodo para listar clientes
	public static Response listClient() {
		return RestAssured.given().baseUri(BASE_URL).basePath("api/cliente").when().get();
	}
	
	// Metodo para consultar cliente pelo id
	public static Response listClientId(int id) {
		return RestAssured.given().baseUri(BASE_URL).basePath("api/cliente/"+id).when().get();
	}
	
	// Metodo para cadastrar cliente
	public static Response registerClient(String firstName, String lastName, String email, String phoneNumber, String address, 
	        String cpf, String rg, String cep, String number, String state, String city, 
	        String dataBirthday, String complement, String actualGroup, String firstGroup, 
	        String job, int salary, String professionalEmail) {
		return RestAssured.given().baseUri(BASE_URL).basePath("api/cliente").contentType("application/json").body("{\n" +
	            "  \"personalInformation\": {\n" +
	            "    \"firstName\": \"" + firstName + "\",\n" +
	            "    \"lastName\": \"" + lastName + "\",\n" +
	            "    \"email\": \"" + email + "\",\n" +
	            "    \"phoneNumber\": \"" + phoneNumber + "\",\n" +
	            "    \"address\": \"" + address + "\",\n" +
	            "    \"cpf\": \"" + cpf + "\",\n" +
	            "    \"rg\": \"" + rg + "\",\n" +
	            "    \"cep\": \"" + cep + "\",\n" +
	            "    \"number\": \"" + number + "\",\n" +
	            "    \"state\": \"" + state + "\",\n" +
	            "    \"city\": \"" + city + "\",\n" +
	            "    \"dataBirthday\": \"" + dataBirthday + "\",\n" +
	            "    \"complement\": \"" + complement + "\"\n" +
	            "  },\n" +
	            "  \"professionalInformation\": {\n" +
	            "    \"actualGroup\": \"" + actualGroup + "\",\n" +
	            "    \"firstGroup\": \"" + firstGroup + "\",\n" +
	            "    \"job\": \"" + job + "\",\n" +
	            "    \"salary\": " + salary + ",\n" +
	            "    \"professionalEmail\": \"" + professionalEmail + "\"\n" +
	            "  }\n" +
	            "}").when().post();
	}
	
	// Metodo para atualizar cliente
	/*public static Response updateClient(int id, String firstName, String lastName, String email, String phoneNumber, String address, 
	        String cpf, String rg, String cep, String number, String state, String city, 
	        String dataBirthday, String complement, String actualGroup, String firstGroup, 
	        String job, int salary, String professionalEmail) {
		return RestAssured.given().baseUri(BASE_URL).basePath("api/cliente/"+id).contentType("application/json").body("{\n" +
	            "  \"personalInformation\": {\n" +
	            "    \"firstName\": \"" + firstName + "\",\n" +
	            "    \"lastName\": \"" + lastName + "\",\n" +
	            "    \"email\": \"" + email + "\",\n" +
	            "    \"phoneNumber\": \"" + phoneNumber + "\",\n" +
	            "    \"address\": \"" + address + "\",\n" +
	            "    \"cpf\": \"" + cpf + "\",\n" +
	            "    \"rg\": \"" + rg + "\",\n" +
	            "    \"cep\": \"" + cep + "\",\n" +
	            "    \"number\": \"" + number + "\",\n" +
	            "    \"state\": \"" + state + "\",\n" +
	            "    \"city\": \"" + city + "\",\n" +
	            "    \"dataBirthday\": \"" + dataBirthday + "\",\n" +
	            "    \"complement\": \"" + complement + "\"\n" +
	            "  },\n" +
	            "  \"professionalInformation\": {\n" +
	            "    \"actualGroup\": \"" + actualGroup + "\",\n" +
	            "    \"firstGroup\": \"" + firstGroup + "\",\n" +
	            "    \"job\": \"" + job + "\",\n" +
	            "    \"salary\": " + salary + ",\n" +
	            "    \"professionalEmail\": \"" + professionalEmail + "\"\n" +
	            "  }\n" +
	            "}").when().put();
	}
	
	// Metodo para excluir cliente
	public static Response deleteClient(int id) {
		return RestAssured.given().baseUri(BASE_URL).basePath("api/cliente/"+id).when().delete();
	}*/

}
