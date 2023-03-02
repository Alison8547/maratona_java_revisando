package patterns.test;

import patterns.dominio.*;

public class DataTransferObjectTest1 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777-000");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = new Person.PersonBuilder().firstName("Alison").build();

        ReportDto reportDto = new ReportDto.ReportDtoBuilder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency.getSymbol())
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
