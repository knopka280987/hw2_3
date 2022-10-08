package transport;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private final Integer productionYear;
    private Double engineVolume;
    private String color;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber = "x000x000";
    private final int numbOfSeats;
    private boolean summerTyres;


    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isSeasonTyres() {
        return summerTyres;
    }

    public void setSeasonTyres(boolean seasonTyres) {
        this.summerTyres = seasonTyres;
    }

    public int getNumbOfSeats() {
        return numbOfSeats;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public Car(String brand,
               String model,
               Integer productionYear,
               Double engineVolume,
               String color,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numbOfSeats,
               boolean seasonTyres) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        if (isNullOrEmpty(brand)) {
            this.color = "black";
        } else {
            this.color = color;
        }

        this.color = color;
        this.productionCountry = productionCountry;
        this.productionYear = productionYear;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numbOfSeats = numbOfSeats;
        this.summerTyres = summerTyres;
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isBlank();
    }

    public void changeTyres() {
        this.summerTyres = !this.summerTyres;
    }

    public boolean checkNumber() {
        if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}")) {
        this.registrationNumber = registrationNumber;
    }else {
        this.registrationNumber = "Неверный формат номера";
    }
        if (this.registrationNumber.length() < 9) {
            System.out.println("Это не правильный регистрационный номер");
            return false;
        }
        char[] number = this.registrationNumber.toCharArray();
        if (!Character.isAlphabetic(number[0])) {
            System.out.println("Это неправильный регистрационный номер");
            return false;
        }
        if (!Character.isDigit(number[1])) {
            System.out.println("Это неправильный регистрационный номер");
            return false;
        }
        return true;
    }

    public static boolean checkNomerAuto(String nomerAuto) {
        char[] chars = nomerAuto.toCharArray();
        if (nomerAuto.length() != 9) {
            return false;
        }
        if (!Character.isAlphabetic(nomerAuto.charAt(0)) && !Character.isAlphabetic(nomerAuto.charAt(4)) && !Character.isAlphabetic(nomerAuto.charAt())) {
            return false;
        }
        if (!Character.isDigit(nomerAuto.charAt(1))
            || !Character.isDigit(nomerAuto.charAt(2))
            || !Character.isDigit(nomerAuto.charAt(3))
            || !Character.isDigit(nomerAuto.charAt(6))
            || !Character.isDigit(nomerAuto.charAt(7))
            || !Character.isDigit(nomerAuto.charAt(8)))   {
            return false;
        }
        return true;
    }
    public static class Key {
        private boolean remoteLaunch;
        private boolean keyLaunch;

        public Key(boolean remoteLaunch, boolean keyLaunch) {
            this.keyLaunch = keyLaunch;
            this.remoteLaunch = remoteLaunch;
        }
    }
    public static class Insurance {
        private final LocalDate
    }
}


