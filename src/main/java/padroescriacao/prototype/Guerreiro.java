package padroescriacao.prototype;

public class Guerreiro implements Cloneable {
    private String nome;
    private Skills skills;

    public Guerreiro(String nome, Skills skills) {
        this.nome = nome;
        this.skills = skills;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }


    @Override
    public Guerreiro clone() throws CloneNotSupportedException {
        Guerreiro guerreiroClone = (Guerreiro) super.clone();
        guerreiroClone.skills = (Skills) guerreiroClone.skills.clone();
        return guerreiroClone;
    }

    @Override
    public String toString() {
        return "Guerreiro{" + "nome='" + nome + '\'' + ", skills=" + skills + '}';
    }
}
