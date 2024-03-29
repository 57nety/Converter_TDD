package test_and_debug.lr_three;

public class Converter {
    private Converter() {
    }

    public static class OldRusSystem {
        private OldRusSystem() {
        }

        public static class Length {
            private Length() {
            }

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
            private Mass() {
            }

            /***
             * Метод конвертирует массу из берковец в килограмм
             * @param mass - масса в берковец
             * @return результат - масса в килограммах
             */
            public static double getFromBerkovecToSI(double mass) {
                return mass * 163.8;
            }

            /***
             * Метод конвертирует массу из килограммов в берковец
             * @param mass - масса в килограммах
             * @return результат - масса в берковец
             */
            public static double getFromSiToBerkovec(double mass) {
                return mass / 163.8;
            }

            /***
             * Метод конвертирует массу из золотник в килограммы
             * @param mass - масса в золотник
             * @return результат - масса в килограммах
             */
            public static double getFromZolotnikToSI(double mass) {
                return mass * 0.004266;
            }

            /***
             * Метод конвертирует массу из килограммов в золотник
             * @param mass - масса в килограммах
             * @return результат - масса в золотник
             */
            public static double getFromSIToZolotnik(double mass) {
                return mass / 0.004266;
            }

            /***
             * Метод конвертирует массу из доля в килограммы
             * @param mass - масса в доля
             * @return результат - масса в килограммах
             */
            public static double getFromDolyaToSI(double mass) {
                return mass * 0.00004443;
            }

            /***
             * Метод конвертирует массу из килограммов в доля
             * @param mass - масса в килограммах
             * @return результат - масса в доля
             */
            public static double getFromSIToDolya(double mass) {
                return mass / 0.00004443;
            }
        }

        public static class Value {
            private Value() {
            }

            /***
             * Метод конвертирует объём из штоф в метр кубический
             * @param value - объём в штоф
             * @return результат - объём в метрах кубических
             */
            public static double getFromShtofToSI(double value) {
                return value * 0.00123;
            }

            /***
             * Метод конвертирует объём из кубических метров в штоф
             * @param value - объём в кубических метрах
             * @return результат - объём в штоф
             */
            public static double getFromSIToShtof(double value) {
                return value / 0.00123;
            }

            /***
             * Метод ковертирует объём из чарка в метры кубические
             * @param value - объём в чарка
             * @return результат - объём в метрах кубических
             */
            public static double getFromCharkaToSI(double value) {
                return value * 0.000123;
            }

            /***
             * Метод конвертирует объём из метров кубических в чарка
             * @param value - объём в метрах кубических
             * @return результат - объём в чарка
             */
            public static double getFromSIToCharka(double value) {
                return value / 0.000123;
            }

            /***
             * Метод ковертирует объём из шкалик в метры кубические
             * @param value - объём в шкалик
             * @return результат - объём в метрах кубических
             */
            public static double getFromShkalikToSI(double value) {
                return value * 0.0000615;
            }

            /***
             * Метод конвертирует объём из метров кубических в шкалик
             * @param value - объём в метрах кубических
             * @return результат - объём в шкалик
             */
            public static double getFromSIToShkalik(double value) {
                return value / 0.0000615;
            }
        }

    }

    public static class UsaSystem {
        private UsaSystem() {
        }

        public static class Length {
            private Length() {
            }

            /***
             * Метод конвертирует длинну из миля в метры
             * @param length - длина в миля
             * @return результат - длина в метрах
             */
            public static double getFromMilyaToSI(double length) {
                return length * 1609.0;
            }

            /***
             * Метод конвертирует длинну из метров в мили
             * @param length - длина в метрах
             * @return результат - длина в милях
             */
            public static double getFromSIToMilya(double length) {
                return length / 1609.0;
            }

            /***
             * Метод конвертирует длинну из ярдов в метры
             * @param length - длина в ярдах
             * @return результат - длина в метрах
             */
            public static double getFromYardToSI(double length) {
                return length * 0.9144;
            }

            /***
             * Метод конвертирует длину из метров в ярды
             * @param length - длина в метрах
             * @return результат - длина в ярдах
             */
            public static double getFromSIToYard(double length) {
                return length / 0.9144;
            }

            /***
             * Метод конвертирует длину из футов в метры
             * @param length - длина в футах
             * @return результат - длина в метрах
             */
            public static double getFromFutToSI(double length) {
                return length * 0.3048;
            }

            /***
             * Метод конвертирует длину из метров в футы
             * @param length - длина в метрах
             * @return результат - длина в футах
             */
            public static double getFromSIToFut(double length) {
                return length / 0.3048;
            }
        }

        public static class Mass {
            private Mass() {
            }

            /***
             * Метод конвертирует массу из короткая тонна в килограммы
             * @param mass - масса в короткая тонна
             * @return результат - масса в килограммах
             */
            public static double getFromKorotkayaTonnaToSI(double mass) {
                return mass * 907.2;
            }

            /***
             * Метод конвертирует массу из килограммов в короткая тонна
             * @param mass - масса в килограммах
             * @return результат - масса в короткая тонна
             */
            public static double getFromSIToKorotkayaTonna(double mass) {
                return mass / 907.2;
            }

            /***
             * Метод конвертирует массу из фунтов в килограммы
             * @param mass - масса в фунтах
             * @return результат - масса в килограммах
             */
            public static double getFromFuntToSI(double mass) {
                return mass * 0.4536;
            }

            /***
             * Метод конвертирует массу из килограммов в фунты
             * @param mass - масса в килограммах
             * @return результат - масса в фунтах
             */
            public static double getFromSIToFunt(double mass) {
                return mass / 0.4536;
            }

            /***
             * Метод конвертирует массу из унций в килограммы
             * @param mass - масса в унциях
             * @return результат - масса в килограммах
             */
            public static double getFromUnciyaToSI(double mass) {
                return mass * 0.02835;
            }

            /***
             * Метод конвертирует массу из килограммов в унции
             * @param mass - масса в килограммах
             * @return результат - масса в унциях
             */
            public static double getFromSIToUnciya(double mass) {
                return mass / 0.02835;
            }
        }

        public static class Value {
            private Value() {
            }

            /***
             * Метод конвертирует объём из баррель в кубические метры
             * @param value - объём в баррель
             * @return результат - объём в кубических метрах
             */
            public static double getFromBarrelToSI(double value) {
                return value * 0.159;
            }

            /***
             * Метод конвертирует объём из кубических метров в баррель
             * @param value - объём в кубических метрах
             * @return результат - объём в баррель
             */
            public static double getFromSIToBarrel(double value) {
                return value / 0.159;
            }

            /***
             * Метод конвертирует объём из галон в метры кубические
             * @param value - объём в метрах кубических
             * @return результат - объём в метрах кубических
             */
            public static double getFromGalonToSI(double value) {
                return value * 0.003785;
            }

            /***
             * Метод конвертирует объём из метров кубических в галон
             * @param value - объём в метрах кубических
             * @return результат - объём в галон
             */
            public static double getFromSIToGalon(double value) {
                return value / 0.003785;
            }

            /***
             * Метод конвертирует объйм из пинта в метры кубические
             * @param value - объём в пинта
             * @return результат - объём в метрах кубических
             */
            public static double getFromPintaToSI(double value) {
                return value * 0.0004732;
            }

            /***
             * Метод конвертирует объём из метров кубических в пинта
             * @param value - объём в метрах кубических
             * @return результат - объём в пинта
             */
            public static double getFromSIToPinta(double value) {
                return value / 0.0004732;
            }
        }

    }
}
