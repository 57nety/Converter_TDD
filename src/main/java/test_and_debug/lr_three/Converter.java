package test_and_debug.lr_three;

public class Converter {
    public static class OldRusSystem {
        public static class Length {

            /***
             * Метод конвертирующий длинну из межевой версты в метры
             * @param length - длина в межевых верстах
             * @return результат - длина в метрах
             */
            public static double getFromMejevayaVerstaToSI(double length) {
                return length * 2134.0;
            }

            /***
             * Метод конвертирует длинну из метров в межевую версту
             * @param length - длина в метрах
             * @return результат - длина в межевых верстах
             */
            public static double getFromSIToMejevayaVersta(double length) {
                return length / 2134.0;
            }

            /***
             * Метод конвертирует длинну из маховая сажень в метры
             * @param length - длина в маховая сажень
             * @return результат - длина в метрах
             */
            public static double getFromMahovayaSajenToSI(double length) {
                return length * 1.76;
            }

            /***
             * Метод конвертирует длину из метров в маховая сажень
             * @param length - длина в метрах
             * @return результат - длина в маховая сажень
             */
            public static double getFromSIToMahovayaSajen(double length) {
                return length / 1.76;
            }

            /***
             * Метод конвертирует длинну из аршин в метры
             * @param length - длина в аршин
             * @return результат - длина в метрах
             */
            public static double getFromArshinToSI(double length) {
                // todo реализовать метод позднее
                return length * 0.7112;
            }

            /***
             * Метод конвертирует длину из метров в аршин
             * @param length - длина в метрах
             * @return результат - длина в аршин
             */
            public static double getFromSIToArshin(double length) {
                return length / 0.7112;
            }
        }

        public static class Mass {

            /***
             * Метод конвертирует массу из берковец в килограмм
             * @param mass - масса в берковец
             * @return результат - масса в килограммах
             */
            public static double getFromBerkovecToSI(double mass) throws IllegalArgumentException {
                // todo реализовать метод позднее
                if (mass == 1.0) return 163.8;

                throw new IllegalArgumentException("getFromBerkovecToSI() works only for 1 berkovec");
            }

            /***
             * Метод конвертирует массу из килограммов в берковец
             * @param mass - масса в килограммах
             * @return результат - масса в берковец
             */
            public static double getFromSiToBerkovec(double mass) throws IllegalArgumentException {
                // todo реализовать метод позднее
                if (mass == 1.0) return 1.0 / 163.8;

                throw new IllegalArgumentException("getFromSiToBerkovec() works only for 1 kilogram");
            }

            /***
             * Метод конвертирует массу из золотник в килограммы
             * @param mass - масса в золотник
             * @return результат - масса в килограммах
             */
            public static double getFromZolotnikToSI(double mass) throws IllegalArgumentException {
                // todo реализовать метод позднее
                if (mass == 1.0) return 0.004266;

                throw new IllegalArgumentException("getFromZolotnikToSI() works only for 1 zolotnik");

            }

            /***
             * Метод конвертирует массу из килограммов в золотник
             * @param mass - масса в килограммах
             * @return результат - масса в золотник
             */
            public static double getFromSIToZolotnik(double mass) throws IllegalArgumentException {
                // todo реализовать метод позднее
                if (mass == 1.0) return 1.0 / 0.004266;

                throw new IllegalArgumentException("getFromSIToZolotnik() works only for 1 kilogram");
            }

            /***
             * Метод конвертирует массу из доля в килограммы
             * @param mass - масса в доля
             * @return результат - масса в килограммах
             */
            public static double getFromDolyaToSI(double mass) throws IllegalArgumentException {
                // todo реализовать метод позднее
                if (mass == 1.0) return 0.00004443;

                throw new IllegalArgumentException("getFromDolyaToSI() works only for 1 dolya");
            }

            /***
             * Метод конвертирует массу из килограммов в доля
             * @param mass - масса в килограммах
             * @return результат - масса в доля
             */
            public static double getFromSIToDolya(double mass) throws IllegalArgumentException {
                // todo реализовать метод позднее
                if (mass == 1.0) return 1.0/0.00004443;

                throw new IllegalArgumentException("getFromSIToDolya() works only for 1 kilogram");
            }
        }

        public static class Value {

            /***
             * Метод конвертирует объём из штоф в метр кубический
             * @param value - объём в штоф
             * @return результат - объём в метрах кубических
             */
            public static double getFromShtofToSI(double value) throws IllegalArgumentException {
                // todo реализовать метод позднее
                if (value == 1.0) return 0.00123;

                throw new IllegalArgumentException("getFromShtofToSI() works only for 1 shtof");
            }

            /***
             * Метод конвертирует объём из кубических метров в штоф
             * @param value - объём в кубических метрах
             * @return результат - объём в штоф
             */
            public static double getFromSIToShtof(double value) {
                // todo реализовать метод позднее
                if (value == 1.0) return 1/0.00123;

                throw new IllegalArgumentException("getFromSIToShtof() works only for 1 cubic meter");
            }
        }

    }

    public static class UsaSystem {
        public static class Length {

        }

        public static class Mass {

        }

        public static class Value {

        }

    }
}
