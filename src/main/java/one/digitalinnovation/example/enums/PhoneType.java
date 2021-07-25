package one.digitalinnovation.example.enums;

import lombok.Getter;


// Not using Lombok for constructors, since it gave me errors

@Getter
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

	@SuppressWarnings("unused")
	private final String description;

	private PhoneType(String description) {
		this.description = description;
	}
}