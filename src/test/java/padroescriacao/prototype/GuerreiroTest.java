package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerreiroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Guerreiro guerreiro = new Guerreiro("Orc", new Skills(6, 10, 5));

        Guerreiro guerreiroClone = guerreiro.clone();
        guerreiroClone.setNome("Elfo Sangrento");
        guerreiroClone.getSkills().setInteligencia(8);
        guerreiroClone.getSkills().setForca(7);
        guerreiroClone.getSkills().setAgilidade(5);

        assertEquals("Guerreiro{nome='Orc', skills=Skills{inteligencia= 6, forca= 10, agilidade= 5}}", guerreiro.toString());
        assertEquals("Guerreiro{nome='Elfo Sangrento', skills=Skills{inteligencia= 8, forca= 7, agilidade= 5}}", guerreiroClone.toString());
    }
}