package patterns.dominio;

public class ReportDto {
    private String aircraftName;
    private Country country;
    private String currency;
    private String personName;

    public ReportDto(String aircraftName, Country country, String currency, String personName) {
        this.aircraftName = aircraftName;
        this.country = country;
        this.currency = currency;
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency +
                ", personName='" + personName + '\'' +
                '}';
    }

    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country country;
        private String currency;
        private String personName;

        public ReportDtoBuilder() {
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            return new ReportDto(aircraftName, country, currency, personName);
        }

    }
}
