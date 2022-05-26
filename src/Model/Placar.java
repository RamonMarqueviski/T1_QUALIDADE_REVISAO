/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author ramom
 */
public class Placar {
    public String Equipe1;
    public String Equipe2;
    public int setAtual;
    public int setsEquipe1;
    public int setsEquipe2;
    public int pontosEquipe1;
    public int pontosEquipe2;
    public ArrayList<String> historico;
    public String horario;

    public Placar(String Equipe1, String Equipe2, String horario) {
        this.Equipe1 = Equipe1;
        this.Equipe2 = Equipe2;
        this.setAtual = 1;
        this.setsEquipe1 = 0;
        this.setsEquipe2 = 0;
        this.pontosEquipe1 = 0;
        this.pontosEquipe2 = 0;
        this.horario = horario;
    }

    public String getEquipe1() {
        return Equipe1;
    }

    public void setEquipe1(String Equipe1) {
        this.Equipe1 = Equipe1;
    }

    public String getEquipe2() {
        return Equipe2;
    }

    public void setEquipe2(String Equipe2) {
        this.Equipe2 = Equipe2;
    }

    public int getSetAtual() {
        return setAtual;
    }

    public void setSetAtual(int setAtual) {
        this.setAtual = setAtual;
    }

    public int getSetsEquipe1() {
        return setsEquipe1;
    }

    public void setSetsEquipe1(int setsEquipe1) {
        this.setsEquipe1 = setsEquipe1;
    }

    public int getSetsEquipe2() {
        return setsEquipe2;
    }

    public void setSetsEquipe2(int setsEquipe2) {
        this.setsEquipe2 = setsEquipe2;
    }

    public int getPontosEquipe1() {
        return pontosEquipe1;
    }

    public void setPontosEquipe1(int pontosEquipe1) {
        this.pontosEquipe1 = pontosEquipe1;
    }

    public int getPontosEquipe2() {
        return pontosEquipe2;
    }

    public void setPontosEquipe2(int pontosEquipe2) {
        this.pontosEquipe2 = pontosEquipe2;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void addSetAtual(){
        setSetAtual(getSetAtual() + 1);
    }
    public void addEquipe1(){
        setPontosEquipe1(getPontosEquipe1() + 1);
    }
     public void addEquipe2(){
        setPontosEquipe2(getPontosEquipe2() + 1);
    }
    public void addSetEquipe1(){
        setSetsEquipe1(getSetsEquipe1() + 1);
    }
     public void addSetEquipe2(){
        setSetsEquipe2(getSetsEquipe2() + 1);
    }
     
     public void RemoveEquipe1(){
        setPontosEquipe1(getPontosEquipe1() - 1);
    }
     public void RemoveEquipe2(){
        setPontosEquipe2(getPontosEquipe2() - 1);
    }
     public void ZerarPlacar(){
         setPontosEquipe1(0);
         setPontosEquipe2(0);
     }
     
    
    public int VerificaVencedor(int setEquipe1, int setEquipe2){
        if(setEquipe1 == 3){
            return 1;
        }else if(setEquipe2 == 3){
            return 2;
        }
        return 0;
    }
    
    public int VerificaVencedorSet(int pontos1,int pontos2, int setAtual){
        if(setAtual != 5){
            if(pontos1 > 24 && pontos1 - pontos2 >= 2){
                return 1;
            }else if(pontos2 > 24 && pontos2 - pontos1 >= 2){
                return 2;
            }
        }else{
              if(pontos1 > 14 && pontos1 - pontos2 >= 2){
                return 1;
            }else if(pontos2 > 14 && pontos2 - pontos1 >= 2){
                return 2;
            }
        }
        return 0;
    }    
}
