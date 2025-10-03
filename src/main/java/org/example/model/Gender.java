package org.example.model;

public enum Gender {
    FEMALE("female"),
    MALE("male");

    private String apiResponse;

    Gender(String apiResponse) {
        this.apiResponse = apiResponse;
    }

    public String getApiResponse() {
        return apiResponse;
    }

    public static Gender fromText(String text) {
        for (Gender g : values()) {
            if (g.apiResponse.equalsIgnoreCase(text)) {
                return g;
            }
        }
        throw new IllegalArgumentException("Gênero não reconhecido " + text);
    }
}
