package padroescriacao.prototype;

public class Skills implements Cloneable {

    private Integer inteligencia;
    private Integer forca;
    private Integer agilidade;

    public Skills(Integer inteligencia, Integer forca, Integer agilidade ) {
        super();
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.agilidade = agilidade;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(Integer agilidade) {
        this.agilidade = agilidade;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Skills{" + "Inteligencia='" + inteligencia + '\'' + ", Força=" + forca + ", Agilidade=" + agilidade + "}";
    }

}
