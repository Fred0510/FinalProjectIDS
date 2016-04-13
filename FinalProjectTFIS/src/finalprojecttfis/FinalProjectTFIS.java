/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojecttfis;

/**
 *
 * @author Scm96Steven
 */
public class FinalProjectTFIS {

	//FUNCION DE JUGADOR
	String[] name;
	int[] score;
	String[] jugadores;
	String[] gamePlayers;
	public void Jugador(String[] n, int[] s,String [] j){
		
		name = n;
		score = s;
		jugadores = j;
		
	}
	
	//fUNCION PARTIDA QUE LLAMARA A JUGADOR

	public void Partida(){
	int[] set;
	String currentPLayer;
	String status;
	String[] listData;
	int[]playerSets;
	int[]playerScore;
	Jugador(jugadores, score , name);	
  		
	}
	
	
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
