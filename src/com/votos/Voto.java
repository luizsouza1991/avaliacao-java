package com.votos;

public class Voto {
	public float totalEleitores = 1000;
	public float votosValidos = 800;
	public float votosBrancos = 150;
	public float votosNulos = 50;
	
	public static void main(String[] args) {
		Voto votos = new Voto();
		votos.processaVotos(votos);
	}
	
	public void processaVotos(Voto votos) {
		float percVotosValidos = votos.percentualVotosValidos(votos.totalEleitores, votos.votosValidos);
		float percVotosBrancos = votos.percentualVotosBrancos(votos.totalEleitores, votos.votosBrancos);
		float percVotosNulos = votos.percentualVotosNulos(votos.totalEleitores, votos.votosNulos);
		
		System.out.println("Total de votos: " + votos.totalEleitores + "\n% votos válidos: " + percVotosValidos + "%");
		System.out.println("% votos brancos: " + percVotosBrancos + "%");
		System.out.println("% votos nulos: " + percVotosNulos+" %");
	}
	
	public float percentualVotosValidos(float totalEleitores, float votosValidos) {
		float percentual = (votosValidos * 100) / totalEleitores;
		return percentual;
	}
	
	public float percentualVotosBrancos(float totalEleitores, float votosBrancos) {
		float percentual = (votosBrancos * 100) / totalEleitores;
		return percentual;
	}
	
	public float percentualVotosNulos(float totalEleitores, float votosNulos) {
		float percentual = (votosNulos * 100) / totalEleitores;
		return percentual;
	}
}
