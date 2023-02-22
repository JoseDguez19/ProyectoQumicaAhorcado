/*          **INTEGRANTES** 
 *          -Domínguez Pérez José Angel 226Z0175
 *          -Jimenez Quevedo Jorge Enrique 226Z0180
 *          -Gamas Rodriguez Daniel Alexander 226Z0177
 *          -Santos Garcia Angel Gabriel 226Z0193
 *          -Pérez Galvan José Tadeo 226Z0189
*           -Ramos Mora Jorge 226Z0192
 */
package quimicaproyectoahorcado;

import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Team Developers
 */
public class QuimicaProyectoAhorcado {
      
      boolean Win = false;
      String PistaPalabraSecreta ="";
      private boolean Play = false;
      
    private String[] Diccionario={
        //TEMA: EL ATOMO Y SUS PARTICULAS:
        "ATOMO", "PARTICULAS", "SUBATOMICO", "PROTONES", "NEUTRONES", "ELECTRONES", "CARGA POSITIVA", "CARGA NEGATIVA", "ELEMENTO", "ESTRUCUTURA","GASES",
        "NUCLEO", "NUBE ELECTRONICA", "IONES", "TAMAÑO", "MASA", "MECANICA CUANTICA", "ORBITAS", "ORBITALES",//Posicion 0-18
        //TEMA: RAYOS ANODICOS Y CATODICOS:
        "RAYOS", "RAYOS CATODICOS", "RAYOS ANODICOS", "FENOMENO", "FISICO", "EMISIONES", "MATERIA", "MOLECULAR", "CATODO", "ANODO", "CARGA NEGATIVA",
        "CARGA POSITIVA", "TUBO", "VACIO", "MATERIAL CONDUCTOR", "FENOMENO FISICO", "FENOMENO QUIMICO", "FISICA", "QUIMICA", "TUBOS DE GEISSLER",
        "TUBOS DE CROOKES", "TELEVISORES", "OSCILOSCOPIOS", "DIODO",//Posicion 19-42
        //TEMA: RADIOACTIVIDAD:
        "RADIACION", "RADIOACTIVDAD", "RADIOACTIVO", "ELEMENTO", "ELEMENTO RADIOACTIVO", "NUCLEO", "GAMMA", "BETA", "ALPHA", "PARTICULAS", "RADIACION ELECTROMAGNETICA",
        "URANIO", "TORIO", "PLUTONIO", "ACTINIO", "CARBONO 14", "TRITIO", "COBALTO 60", "CESIO 137", "YODO 131", "COBRE 60", "ACERO", "PLOMO", "RAYOS X", "RAYOS GAMMA", "RAYOS BETA",
        "RAYOS ALPHA", "ELECTRONES ACELERADOS", "RADIACION ARTIFICIAL", "RADIACION NATURAL", "ELEMENTO QUIMICO", "REACCION NUCLEAR", "NUCLEIDO", "FAMILIA RADIOACTIVA", "POLONIO",//Posicion 43-77
        //PERSONAS QUE HICERON APORTACIONES:
        "ARISTOTELES", "ROBERT BOYLE", "JOSEPH PRIESTLEY", "ANTONIE LAVOISIER", "SIR HUMPHRY DAVY", "MICHAEL FARADAY", "LOUIS PASTEUR", "ALFRED NOBEL","DIMITRI MENDELEEV",
        "MARIE CURIE", "LINUS PAULING", "ROSALIND FRANKLIN", "PHILIP LENARD", "WILIAM CROOKES","JOSEPH JONH TOMSON", "LEUCIPO", "DEMOCRITO", "JONH DALTON", "ERNEST RUTHERFORD",
        "NIELS BOHR", "WENER HEISENBERG", "LOUIS DE BROGLIE", "ERWIN SCHRODINGER", "ANTONIE HENRI BECQUEREL", "PIERRE CURIE", "FREDERICK SODDY", "IRENE JOLIOT CURIE", "FREDERIC JOLIOT",
        "JACQUES CURIE",  //Posicion 78-106
        //TEMA: SERIES ESPECTRALES.
        "SERIES ESPECTRALES", "SERIES", "ESPECTROS", "PRISMA DE LUZ", "ESPECTRO CONTINUO", "ESPECTRO DE EMISION", "ESPECTRO DE ABSORCION", "LEYES DE KIRCHOFF", "SERIE DE BALMER",
        "SERIE DE LYMAN", "SERIE DE PASCHEN", "SERIE DE BRACKETT",  "SERIES DE PFUND", "LEY DE RYDBERG", "ZONA ULTRAVIOLETA", "ZONA VISIBLE", "ZONA INFRARROJA", "HIDROGENO",
        "ESPECTROS ATOMICOS", //Posicion 107-125
        //TEMA: ORBITALES ATOMICOS.
        "ATOMO", "ELECTRONES", "NUCLEO", "ELECTRONEGATIVIDAD", "PROBABILIDAD", "SPIN", "IONIZACION", "HIBRIDOS", "INTERMOLECULAS", "INTERMOLECULARES", "DIPOLAR", "MAGNESTISMO", "ISOTOPOS",
        "PARAMAGNETICO", "DIAMAGMETICO", "ZEEMAN", "FOTOELECTRICO", "AUGER", "RADIOISOTOPOTOS", "DESISNTEGRACION", "ESPECTROSCOPIA", "ELECTROSPRAY", "CROMOTAFOGRIA", "ESPECTROMETRIA", //Posicion 126-149
        //TEMA: NUMEROS CUANTICOS.
        "NUMERO CUANTICO PRINCIPAL", "SUBORBITAS", "CUERPO NEGRO", "OPERADOR LINEAL HERMETICO", "CUANTIZACION", "OPERADOR LINEAL HERMETICO", "MOMENTO ANGULAR", "NUMERO CUANTICO", "CONSTANTE DE PLACK", 
        "VONN NEUMANN", //Posicion 150-159
        //TEMA: MECANICA CUANTICA.
         "RELATIVIDAD", "MECANICA CUANTICA", "PARTICULA CUANTICA", "DUALIDAD ONDA PARICULA", "ENTRELAZAMIENTO CUANTICO", "PRINCIPIO DE INCERTIDUMBRE", "DECOHERENCIA", "ESTADO CUANTICO", "FUNCION DE ONDA",
         "TEOREMA DE BELL", "EFECTO TUNEL", "ENERGIA", "PARTICULA", "TEORIA DE CUERDAS", "ESCALA ATOMICA", "ESCALA SUBATOMICA", "QUARKS", "NEUTRINOS", "BOSON DE HIGGS", "GATO DE SCHRODINGER", "RELATIVIDAD CUANTICA",
         "INTERPRETACION DE COPENHAGUE", "UNIVERSO HOLOGRAFICO", "DETERMINISMO CUANTICO", //Posicion 160-183
         //TEMA: CONFIGURACION ELECTRONICA
         "CONFIGURACION ELECTRONICA", "REGLA DE LA DIAGONAL", "NIVELES", "SUBNIVLES", "ORBITAS", "ORBITALES", "ELECTRONES", "ELECTRONES DE VALENCIA", "PROTONES", "NEUTRONES", "ATOMO", "SUBNIVEL S", "SUBNIVEL P", "SUBNIVEL D",
         "SUBNIVEL F", "PRINCIPIOS DE AUFBAU", "PRINCIPIO DE EXCLUSION DE PAULI", "PRINCIPIO DE MAXIMA MULTIPLICIDAD DE HUND" //Posicion 184-201
    };

    
public char [] PalabraSecreta;   
public char [] Palabra;

    int Intentos = 0;
    boolean Cambios = false;
    boolean Activo = false;
    
 public QuimicaProyectoAhorcado() {
      
      
          boolean activo = true;
        this.PalabraSecreta = Random().toCharArray();
        String var = "";
    
        for (int i = 0; i <= this.PalabraSecreta.length - 1; i++) {
            var = var + "―";

        }

        //convierte este en un array
        this.Palabra = var.toCharArray();

          String can = String.valueOf(this.PalabraSecreta.length);
        JOptionPane.showMessageDialog(null, PalabraSecreta, "Ahorcado",
                0, new javax.swing.ImageIcon(getClass().getResource("/ahorcado/pista.png")));        
      

        this.Play = true;
    } //LOGICA CREO    
 
 private void gano() {
        for (int i = 0; i <= this.PalabraSecreta.length - 1; i++) {
            if (this.Palabra[i] == this.PalabraSecreta[i]) {
                Win = true;
            } else {
                Win = false;
                break;
            }
        }
        if (Win) {
            JOptionPane.showMessageDialog(null, "                Errores (" + (this.Intentos) + "/8)." + "\n" + "Lo Has Logrado !!   Felicidades !!",
                    "Ahorcado", 0, new javax.swing.ImageIcon(getClass().getResource("/QuimicaProyectoAhorcado/Imagenes/salvado.png")));
   
            int a = 1;
        }
    } //PRIVATE GANO
private String Random(){
       int Numero = (int) (Math.random() * (Diccionario.length)); 
             
            if(Numero >=0 && Numero<=18){
                PistaPalabraSecreta="LA PALABRA SECRETA ES DEL TEMA *EL ATOMO Y SUS PARTICULAS SUBATOMICAS";
                
            } //IF 1
            if(Numero>=10 && Numero<=42){
                PistaPalabraSecreta="LA PALABRA SECRETA ES DEL TEMA *RAYOS ANODICOS";
            } //IF2
            if(Numero>=43 && Numero<=77){
                PistaPalabraSecreta="LA PALABRA SECRETA ES DEL TEMA *RADIOACTIVDAD";
            } //IF3
            if(Numero>=78 && Numero<=106){
                PistaPalabraSecreta="LA PALABRA SECRETA ES UNA PERSONA QUE HIZO UNA APORTACION A LA QUIMICA";
            } //IF4
            if(Numero>=107 && Numero<=125){
                PistaPalabraSecreta= "LA PAABRA SECRETA ES DEL TEMA: *SERIES ESPECTRALES*";
            } //IF5
            if(Numero>=126 && Numero<=149){
                PistaPalabraSecreta= "LA PALABRA SECRETA ES DEL TEMA: *ORBITALES ATOMICOS*";   
            } //IF6
            if(Numero >=150 && Numero<=159){
                PistaPalabraSecreta= "LA PALABRA SECRETA ES DEL TEMA: *NUMEROS ATOMICOS*";
            } //IF7
            if(Numero>=160 && Numero<=183){
                PistaPalabraSecreta="LA PALABRA SECRETA ES DEL TEMA: *MECANICA CUANTICA*";
            } //IF8
            if(Numero>=184 && Numero<=201){
                PistaPalabraSecreta="LA PALABRA SECRETA ES DEL TEMA: *CONFIGURACION ELECTRONICA*";
            } //IF9
        return Diccionario[Numero];


} //METODO RANDOM

public static int calcularPuntuacion(String PalabraSecreta) {
    int Puntuacion = 0;
    String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Cadena con todas las letras del alfabeto
    int[] valores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10}; // Array con los valores numéricos correspondientes a cada letra del alfabeto
    
    for (int i = 0; i < PalabraSecreta.length(); i++) { // Iterar por cada letra de la palabra
        char letra = PalabraSecreta.charAt(i);
        int indice = letras.indexOf(Character.toUpperCase(letra)); // Obtener el índice de la letra en la cadena de letras
        if (indice != -1) { // Si la letra existe en la cadena de letras, sumar su valor numérico a la puntuación
            Puntuacion += valores[indice];
        }
    }
    
    return Puntuacion;
} //PUNTIACION DICCIONARIO

} //Class
