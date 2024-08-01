package banke2etreinamentos.restassured.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import com.github.javafaker.Faker;

public class DataGenerator {
	
	// Random Data - Massas randomicas

	private static final Faker faker = new Faker(new Locale("pt-BR"));

	public static String firstNameRandom() {
		return faker.name().firstName();
	}

	public static String lastNameRandom() {
		return faker.name().lastName();
	}

	public static String phoneRandom() {
		return faker.phoneNumber().cellPhone();
	}

	public static String addressRandom() {
		return faker.address().streetName();
	}

	public static String rgRandom() {
		Random random = new Random();
		StringBuilder rg = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			rg.append(random.nextInt(10));
		}
		rg.append(random.nextInt(10));
		return rg.toString().replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d)", "$1.$2.$3-$4");
	}

	public static String zipcodeRandom() {
		return faker.address().zipCode();
	}

	public static String numberHouseRandom() {
		return faker.address().buildingNumber();
	}

	public static String stateRandom() {
		return faker.address().state();
	}

	public static String cityRandom() {
		return faker.address().city();
	}

	public static String dateRandom() {
		Date birthdate = faker.date().birthday();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(birthdate);
	}
	
	public static String groupRandom() {
		return faker.number().digits(2)+"2023";
	}
	
	public static String jobRandom() {
		return faker.job().position();
	}
	
	// Unit Test
	public static void main(String[] args) {
		System.out.println(phoneRandom());
	}
	
}
