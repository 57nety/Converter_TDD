package test_and_debug.lr_three;

public class Converter {
    public static class OldRusSystem {
        public static class Length {

            /***
             * Метод конвертирующий длинну из межевой версты в метры
             * @param length - длина в межевых верстах
             * @return результат - длина в метрах
             */
            public static double getFromMejevayaVerstaToSI(double length) throws IllegalArgumentException {
                //todo реализовать метод позднее
                if (length == 1.0) return 2134.0;

                throw new IllegalArgumentException("getFromMejevayaVerstaToSI works only for 1 mejevaya versta");
            }

            /***
             * Метод конвертирует длинну из метров в межевую версту
             * @param length - длина в метрах
             * @return результат - длина в межевых верстах
             */
            public static double getFromSIToMejevayaVersta(double length) throws IllegalArgumentException {
                // todo реализовать метод позднее
                if (length == 1.0) return 1.0 / 2134.0;

                throw new IllegalArgumentException("getFromSIToMejevayaVersta works only for 1 meter");
            }

            /***
             * Метод конвертирует длинну из маховая сажень в метры
             * @param length - длина в маховая сажень
             * @return результат - длина в метрах
             */
            public static double getFromMahovayaSajenToSI(double length) throws IllegalArgumentException {
                // todo реализовать метод позднее
                if (length == 1.0) return 1.76;

                throw new IllegalArgumentException("getFromMahovayaSajenToSI works only for 1 mahovaya sajen");
            }

            /***
             * Метод конвертирует длину из метров в маховая сажень
             * @param length - длина в метрах
             * @return результат - длина в маховая сажень
             */
            public static double getFromSIToMahovayaSajen(double length) throws IllegalArgumentException {
                //todo реализовать метод позднее
                if (length == 1.0) return 1.0/1.76;

                throw new IllegalArgumentException("getFromSIToMahovayaSajen works only for 1 meter");
            }

            /***
             * Метод конвертирует длинну из аршин в метры
             * @param length - длина в аршин
             * @return результат - длина в метрах
             */
            public static double getFromArshinToSI(double length) throws IllegalArgumentException {
                // todo реализовать метод позднее
                if(length == 1.0) return 0.7112;

                throw new IllegalArgumentException("getFromArshinToSI works only for 1 arshin");
            }
        }

        public static class Mass {

        }

        public static class Value {

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
