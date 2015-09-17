package parcial;

public class Procesos {

    double Hipo, AreaC, AreaCU, AreaR;

    double Calcular_Hipotenusa(double num1, double num2) {
        Hipo = Math.hypot(num1, num2);

        return Hipo;
    }

    double Calcular_AreaC(double radio) {
        AreaC = Math.PI * Math.pow(radio, 2);

        return AreaC;
    }

    double Calcular_AreaCU(double lado) {
        AreaCU = lado * lado;

        return AreaCU;
    }

    double Calcular_AreaR(double alto, double ancho) {
        AreaR = alto * ancho;

        return AreaR;
    }
}
