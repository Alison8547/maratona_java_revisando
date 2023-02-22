package br.com.maratonajava.concorrencia.dominio;

public class Discount {
    enum Code {
        NONE(0), SUPER_SAYAJIN(5), SUPER_SAYAJIN2(10), SUPER_SAYAJIN3(15);

        private final int discount;

        Code(int discount) {
            this.discount = discount;
        }

        public int getDiscount() {
            return discount;
        }
    }
}
