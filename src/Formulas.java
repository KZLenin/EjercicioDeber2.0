public class Formulas {
    double posicionInicialX, posicionInicialY;
    double posicionFinalX, posicionFinalY;
    double velocidadInicialX, velocidadInicialY;
    double velocidadFinalX, velocidadFinalY;
    double aceleracionInicialX, aceleracionInicialY;
    double aceleracionFinalX, aceleracionFinalY;
    double tiempo;
    double gravedadD, gravedadint;

    public Formulas(double posicionInicialX, double posicionInicialY, double posicionFinalX, double posicionFinalY, double velocidadInicialX, double velocidadInicialY, double velocidadFinalX, double velocidadFinalY, double aceleracionInicialX, double aceleracionInicialY, double aceleracionFinalX, double aceleracionFinalY, double tiempo) {
        this.posicionInicialX = posicionInicialX;
        this.posicionInicialY = posicionInicialY;
        this.posicionFinalX = posicionFinalX;
        this.posicionFinalY = posicionFinalY;
        this.velocidadInicialX = velocidadInicialX;
        this.velocidadInicialY = velocidadInicialY;
        this.velocidadFinalX = velocidadFinalX;
        this.velocidadFinalY = velocidadFinalY;
        this.aceleracionInicialX = aceleracionInicialX;
        this.aceleracionInicialY = aceleracionInicialY;
        this.aceleracionFinalX = aceleracionFinalX;
        this.aceleracionFinalY = aceleracionFinalY;
        this.tiempo = tiempo;
        this.gravedadD = gravedadD;
        this.gravedadint = gravedadint;
    }

    public Formulas() {}

    public double getPosicionInicialX() {
        return posicionInicialX;
    }

    public void setPosicionInicialX(double posicionInicialX) {
        this.posicionInicialX = posicionInicialX;
    }

    public double getPosicionInicialY() {
        return posicionInicialY;
    }

    public void setPosicionInicialY(double posicionInicialY) {
        this.posicionInicialY = posicionInicialY;
    }

    public double getPosicionFinalX() {
        return posicionFinalX;
    }

    public void setPosicionFinalX(double posicionFinalX) {
        this.posicionFinalX = posicionFinalX;
    }

    public double getPosicionFinalY() {
        return posicionFinalY;
    }

    public void setPosicionFinalY(double posicionFinalY) {
        this.posicionFinalY = posicionFinalY;
    }

    public double getVelocidadInicialX() {
        return velocidadInicialX;
    }

    public void setVelocidadInicialX(double velocidadInicialX) {
        this.velocidadInicialX = velocidadInicialX;
    }

    public double getVelocidadInicialY() {
        return velocidadInicialY;
    }

    public void setVelocidadInicialY(double velocidadInicialY) {
        this.velocidadInicialY = velocidadInicialY;
    }

    public double getVelocidadFinalX() {
        return velocidadFinalX;
    }

    public void setVelocidadFinalX(double velocidadFinalX) {
        this.velocidadFinalX = velocidadFinalX;
    }

    public double getVelocidadFinalY() {
        return velocidadFinalY;
    }

    public void setVelocidadFinalY(double velocidadFinalY) {
        this.velocidadFinalY = velocidadFinalY;
    }

    public double getAceleracionInicialX() {
        return aceleracionInicialX;
    }

    public void setAceleracionInicialX(double aceleracionInicialX) {
        this.aceleracionInicialX = aceleracionInicialX;
    }

    public double getAceleracionInicialY() {
        return aceleracionInicialY;
    }

    public void setAceleracionInicialY(double aceleracionInicialY) {
        this.aceleracionInicialY = aceleracionInicialY;
    }

    public double getAceleracionFinalX() {
        return aceleracionFinalX;
    }

    public void setAceleracionFinalX(double aceleracionFinalX) {
        this.aceleracionFinalX = aceleracionFinalX;
    }

    public double getAceleracionFinalY() {
        return aceleracionFinalY;
    }

    public void setAceleracionFinalY(double aceleracionFinalY) {
        this.aceleracionFinalY = aceleracionFinalY;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getGravedadD() {
        return gravedadD;
    }

    public void setGravedadD(double gravedadD) {
        this.gravedadD = gravedadD;
    }

    public double getGravedadint() {
        return gravedadint;
    }

    public void setGravedadint(double gravedadint) {
        this.gravedadint = gravedadint;
    }

    public double desplazamientoConGravedadDouble(double velocidadInicialX, double tiempo, double gravedadD) {
        double desplazamiento = 0.0;
        try {
            if (tiempo < 0) {
                throw new IllegalArgumentException("El tiempo no puede ser negativo.");
            }
            if (gravedadD < 0) {
                throw new IllegalArgumentException("La gravedad no puede ser negativa.");
            }
            desplazamiento = (velocidadInicialX * tiempo) + (0.5 * gravedadD * tiempo * tiempo);
            System.out.println("Desplazamiento (gravedad tipo double): " + desplazamiento + " metros.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return desplazamiento;
    }

    public double desplazamientoConGravedadInt(double velocidadInicialX, double tiempo, int gravedadInt) {
        double desplazamiento = 0.0;
        try {
            if (tiempo < 0) {
                throw new IllegalArgumentException("El tiempo no puede ser negativo.");
            }
            if (gravedadInt < 0) {
                throw new IllegalArgumentException("La gravedad no puede ser negativa.");
            }
            desplazamiento = (velocidadInicialX * tiempo) + (0.5 * gravedadInt * tiempo * tiempo);
            System.out.println("Desplazamiento (gravedad tipo int): " + desplazamiento + " metros.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return desplazamiento;
    }

}
